package br.com.fescfafic.Voo.Model;

public class AeroportoDomestico extends Aeroporto {
    public AeroportoDomestico(String nome, String cidade, String sigla) {
        super(nome, cidade, sigla);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Aeroporto Doméstico: " + nome);
        System.out.println("Cidade: " + cidade);
        System.out.println("Sigla: " + sigla);
    }
}

