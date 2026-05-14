package br.contactmanager.api.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contato {
    private String nome;
    private String email;
    private String telefone;
    private List<Especialidade> especialidades;

    // Construtor padrão (necessário para o Spring)
    public Contato() {}

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public List<Especialidade> getEspecialidades() { return especialidades; }
    public void setEspecialidades(List<Especialidade> especialidades) { this.especialidades = especialidades; }
}