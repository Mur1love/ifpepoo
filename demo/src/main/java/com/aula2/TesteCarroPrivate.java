package com.aula2;

public class TesteCarroPrivate {
    public static void main(String[] args) {
        CarroPrivate c = new CarroPrivate();

        c.setMarca("Fiat");
        c.setModelo("Uno");
        c.setAno(2000);
        c.setPreco(50000);

        c.mostrarInfo();
    }

}
