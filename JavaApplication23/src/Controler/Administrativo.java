/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

/**
 *
 * @author Escola
 */
public class Administrativo extends Funcionario{
private String setor;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Administrativo(String setor, String nome, int idade, double salario) {
        super(nome, idade, salario);
        this.setor = setor;
    }

    @Override
    public double calcularoBonusSalario() {
       return super.getSalario()*0.5;
    }

  
    public String exibirdetalhes() {
        return "Administrativo{" + "setor=" + setor + '}';
    }

 
    
    
}
