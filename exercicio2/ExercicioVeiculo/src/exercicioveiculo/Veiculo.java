/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioveiculo;

/**
 *
 * @author Escola
 */
public  abstract class Veiculo {

 private String marca;
   private String modelo;
   private int ano;

    public abstract double calcularVelocidadeMaxima() ;
    

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
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

   
    public String exibirDetalhes() {
        return "veículo: " + "marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ';';
    }
   
    
}
