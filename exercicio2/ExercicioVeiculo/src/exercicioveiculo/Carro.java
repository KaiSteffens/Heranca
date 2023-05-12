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
public class Carro extends Veiculo{
    private int NumeroPortas;

    public Carro(int NumeroPortas, String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.NumeroPortas = NumeroPortas;
    }

    public int getNumeroPortas() {
        return NumeroPortas;
    }

    public void setNumeroPortas(int NumeroPortas) {
        this.NumeroPortas = NumeroPortas;
    }

    @Override
    public String toString() {
        return "Carro{" + "NumeroPortas=" + NumeroPortas + '}';
    }

    @Override
    public double calcularVelocidadeMaxima() {
       return 200.0;
    }
    
    
}
