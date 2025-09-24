package com.aula2;

public class CarroPublico {

    public String marca;
    public String modelo;
    public int ano;
    public double preco;

    public void mostrarInfo() {
        System.out.println(marca + " " + modelo + " (" + ano + ") - R$" + preco);
    }

}
