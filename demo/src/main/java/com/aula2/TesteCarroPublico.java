package com.aula2;

public class TesteCarroPublico {

    public static void main(String[] args) {
        CarroPublico c = new CarroPublico();

        // Acesso direto
        c.marca = "Fiat";
        c.modelo = "Uno";
        c.ano = 2020;
        c.preco = 5000; 

        c.mostrarInfo();
    }
    
}
