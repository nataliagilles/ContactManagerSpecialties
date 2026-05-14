package br.contactmanager.api.controller;

import br.contactmanager.api.model.Contato;
import br.contactmanager.api.service.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/contatos")
public class ContatoController {

    @Autowired
    private ContatoService contatoService;

    // GET /api/contatos - Listar todos os contatos
    @GetMapping
    public List<Contato> listarContatos() {
        return contatoService.listarTodos();
    }

    // GET /api/contatos/{email} - Buscar contato por e-mail
    @GetMapping("/{email}")
    public ResponseEntity<Contato> buscarContatoPorEmail(@PathVariable String email) {
        Optional<Contato> contato = contatoService.buscarPorEmail(email);
        return contato.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // POST /api/contatos - Adicionar novo contato
    @PostMapping
    public ResponseEntity<Contato> adicionarContato(@RequestBody Contato contato) {
        // Verifica se já existe
        if (contatoService.buscarPorEmail(contato.getEmail()).isPresent()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        boolean salvou = contatoService.adicionarContato(contato);
        if (salvou) {
            return ResponseEntity.status(HttpStatus.CREATED).body(contato);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    // PUT /api/contatos/{email} - Atualizar um contato existente
    @PutMapping("/{email}")
    public ResponseEntity<Contato> atualizarContato(@PathVariable String email,
                                                    @RequestBody Contato contatoAtualizado) {
        // Verifica se o contato existe
        Optional<Contato> existente = contatoService.buscarPorEmail(email);
        if (existente.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        // Garante que o e-mail do path seja usado (evita inconsistência)
        contatoAtualizado.setEmail(email);
        boolean atualizou = contatoService.atualizarContato(contatoAtualizado);
        if (atualizou) {
            return ResponseEntity.ok(contatoAtualizado);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    // DELETE /api/contatos/{email} - Remover contato
    @DeleteMapping("/{email}")
    public ResponseEntity<Void> removerContato(@PathVariable String email) {
        Optional<Contato> existente = contatoService.buscarPorEmail(email);
        if (existente.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        boolean removido = contatoService.remover(email);
        if (removido) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
