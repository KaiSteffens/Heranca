/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciolivraria;

/**
 *
 * @author Escola
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Produto CD=new CD("Xuxa", "Xuxa para baixinhos", 20);
      Produto livro=new Livro("Vitor Martins", "Um milhão de finais felizes", 50);
      
      
        System.out.println(CD.exibirDetalhes());
        System.out.println(livro.exibirDetalhes());
    }
    
}
