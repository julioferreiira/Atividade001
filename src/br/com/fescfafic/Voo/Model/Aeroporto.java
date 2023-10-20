package br.com.fescfafic.Voo.Model;

public abstract class Aeroporto {
    public String nome;
    public String cidade;
    public String sigla;

    public Aeroporto(String nome, String cidade, String sigla) {
        this.nome = nome;
        this.cidade = cidade;
        this.sigla = sigla;
    }
    public abstract void exibirInformacoes();

    @Override
    public String toString() {
        return "Nome: " + nome + ", Cidade: " + cidade + ", Sigla: " + sigla;
    }
}


