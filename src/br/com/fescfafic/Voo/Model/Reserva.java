package br.com.fescfafic.Voo.Model;

public class Reserva {
    public Voo voo;
    public Passageiro passageiro;

    public Reserva(Voo voo, Passageiro passageiro) {
        this.voo = voo;
        this.passageiro = passageiro;
    }

    public void exibirInformacoes() {
        System.out.println("Detalhes do Voo:");
        voo.exibirInformacoes();
        System.out.println("Detalhes do Passageiro:");
        passageiro.exibirInformacoes();
    }
}

