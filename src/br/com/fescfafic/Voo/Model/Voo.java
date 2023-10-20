package br.com.fescfafic.Voo.Model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Voo {
    public String numero;
    public String origem;
    public String destino;
    public LocalDate data;
    public LocalTime hora;

    public Voo(String numero, String origem, String destino,LocalDate data, LocalTime hora){
        this.numero = numero;
        this.origem = origem;
        this.destino = destino;
        this.data = data;
        this.hora = hora;
    }

    public void exibirInformacoes() {
        System.out.println("Número: " + numero);
        System.out.println("Origem: " + origem);
        System.out.println("Destino: " + destino);
        System.out.println("Data: " + data);
        System.out.println("Hora: " + hora);
    }
}
