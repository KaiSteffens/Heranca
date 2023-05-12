/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioheranca;

/**
 *
 * @author Escola
 */
public class Main {
        public static void main(String[] args) {
    Funcionario Lu =new Professor("Matematica", "Lu", 18, 2900);
    Funcionario Kai = new Administrativo("gerente", "Kai", 18, 9000);
    
          System.out.println(Lu.exibirDetalhes());
          System.out.println(Kai.exibirDetalhes());
}
}

    

