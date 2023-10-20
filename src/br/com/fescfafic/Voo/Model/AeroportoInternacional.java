package br.com.fescfafic.Voo.Model;

public class AeroportoInternacional extends Aeroporto {
    public String pais;

    public AeroportoInternacional(String nome, String cidade, String sigla, String pais) {
        super(nome, cidade, sigla);
        this.pais = pais;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Aeroporto Internacional: " + nome);
        System.out.println("Cidade: " + cidade);
        System.out.println("Sigla: " + sigla);
        System.out.println("País: " + pais);
    }
}


