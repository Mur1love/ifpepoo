package com.aula2;

public class TesteCarroPublico {

    public static void main(String[] args) {
        CarroPublico c = new CarroPublico();

        // Acesso direto
        c.ano = 2020;
        c.marca = "Fiat";
        c.modelo = "Uno";
        c.preco = 50000;
        c.mostrarInfo();
    }
    
}
