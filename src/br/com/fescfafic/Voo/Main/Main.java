package br.com.fescfafic.Voo.Main;
import br.com.fescfafic.Voo.Model.*;
import java.time.LocalDate;
import java.time.LocalTime;


public class Main {
    public static void main(String[] args) {
        Passageiro passageiro = new Passageiro("Júlio", "Ferreira", "12345678901");

        LocalDate data1 = LocalDate.of(2023, 10, 20);
        LocalTime hora1 = LocalTime.of(10, 0);
        AeroportoDomestico origem1 = new AeroportoDomestico("Aeroporto de São Paulo", "São Paulo", "SP");
        AeroportoDomestico destino1 = new AeroportoDomestico("Aeroporto do Rio de Janeiro", "Rio de Janeiro", "RJ");
        Voo voo1 = new Voo("V123", "São Paulo" , "RJ" , data1, hora1);

        LocalDate data2 = LocalDate.of(2023, 10, 21);
        LocalTime hora2 = LocalTime.of(15, 30);
        AeroportoInternacional origem2 = new AeroportoInternacional("Aeroporto de Londres", "Londres", "LD","Inglaterra");
        AeroportoInternacional destino2 = new AeroportoInternacional("Aeroporto de Paris", "Paris", "PR","França");
        Voo voo2 = new VooDomestico("D456"," Londre", "Paris" , data2, hora2, true);

        Reserva reserva1 = new Reserva(voo1, passageiro);
        Reserva reserva2 = new Reserva(voo2, passageiro);

        System.out.println("Detalhes da Reserva 1:");
        reserva1.exibirInformacoes();

        System.out.println("\nDetalhes da Reserva 2:");
        reserva2.exibirInformacoes();

    }
}

