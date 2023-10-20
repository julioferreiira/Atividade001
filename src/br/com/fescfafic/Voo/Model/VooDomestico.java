package br.com.fescfafic.Voo.Model;

import java.time.LocalDate;
import java.time.LocalTime;

public class VooDomestico extends Voo{
    private boolean bagagemIncluida;

    public VooDomestico(String numero, String origem, String destino, LocalDate data, LocalTime hora, boolean bagagemIncluida) {
        super(numero, origem, destino, data, hora);
        this.bagagemIncluida = bagagemIncluida;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Bagagem Incluída: " + (bagagemIncluida ? "Sim" : "Não"));
    }
}

