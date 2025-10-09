package com.aula3;
//Classe que não segue boas práticas de programação orientada a objetos
public class pessoa {

   public String NOMEpessoa;
   public String cpf_do_Usuário;
   public int idadêDaPessoa;

   public pessoa(String NomePessoa, String CPF, int IDADEpessoaÇ){
       NOMEpessoa = NomePessoa;
       cpf_do_Usuário = CPF;
       idadêDaPessoa = IDADEpessoaÇ;
   }

   public void settudooo(String NOVOnome, String novocpf, int Idadê){
       NOMEpessoa = NOVOnome;
       cpf_do_Usuário = novocpf;
       idadêDaPessoa = Idadê;
   }

   public void mostrár_dádos(){
       System.out.println("Nome da PESSOA: " + NOMEpessoa +
                          " | CPF: " + cpf_do_Usuário +
                          " | Idadê: " + idadêDaPessoa);
   }
}
