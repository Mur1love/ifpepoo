package com.aula3;
//Classe que não segue boas pŕaticas de programação orientada a objetos

//Nome da classe em minúsculo (pessoa)
//Atributos públicos (quebra de encapsulamento)
//Métodos e variáveis com nomes inconsistentes (Nome, cpf, setTudo)
//Método setTudo faz várias tarefas (baixa coesão)
//Falta de construtor sobrecarregado e uso do this()
//Ausência de comentários e formatação inconsistente

public class pessoa {
    public String Nome;
    public String cpf;
    public int idade;
    
    public pessoa(String n, String c, int i){
        Nome = n;
        cpf = c;
        idade = i;
    }

    public void setTudo(String n, String c, int i){
        Nome = n;
        cpf = c;
        idade = i;
    }

    public void mostrar(){
        System.out.println("Nome: " + Nome + " Cpf: " + cpf + " Idade: " + idade);
    }
}
