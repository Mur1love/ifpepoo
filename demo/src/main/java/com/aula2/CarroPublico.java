package com.aula2;

public class CarroPublico {

    String marca;
    String modelo;
    int ano;
    double preco;
    String cor;
    String placa;
    double quilometragem;

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Preço: R$" + preco);
        System.out.println("Cor: " + cor);
        System.out.println("Placa: " + placa);
        System.out.println("Quilometragem: " + quilometragem + " km");
    }

}
