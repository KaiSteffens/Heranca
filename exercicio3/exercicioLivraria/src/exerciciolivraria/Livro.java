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
public class Livro extends Produto{
    private String autor;

    public String getAutor() {
        return autor;
    }

    public Livro(String autor, String titulo, double preco) {
        super(titulo, preco);
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro{" +super.exibirDetalhes()+ "autor=" + autor + '}';
    }

    @Override
    public double calcularDesconto() {
     return super.getPreco()*0.90;
    }

   

    
    


    }
    
    
