package com.aula2;

public class CarroPrivate {

    private String marca;
    private String modelo;
    private int ano;
    private double preco;

    public CarroPrivate(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }


    public CarroPrivate() {
    }


    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void mostrarInfo() {
        System.out.println(marca + " " + modelo + " (" + ano + ") - R$" + preco);
    }    
}
