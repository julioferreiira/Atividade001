package br.com.fescfafic.Voo.Model;

public class Passageiro {
    public String nome;
    public String sobrenome;
    public String cpf;

    public Passageiro(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("CPF: " + cpf);
    }
}

