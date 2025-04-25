package br.com.cadUser;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named("pessoa")
@RequestScoped
public class Pessoa {

    private String nome;
    private List<String> nomes = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getNomes() {
        return nomes;
    }

    public void setNomes(List<String> nomes) {
        this.nomes = nomes;
    }

    public void salvar() {
        nomes.add(nome);
        nome = "";
    }
}