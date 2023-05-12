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
public class Main {

    public static void main(String[] args) {
        Veiculo carro01 = new Carro(2, "Toyota", "Supra", 2000);
        Veiculo carro02 = new Carro(2, "Nissan", "Skyline GT-R R34", 1999);
        Veiculo carro03 = new Carro(2, "Chevrolet", "Corvette C8", 2020);
        Veiculo carro04 = new Carro(2, "Chevrolet", "Chevete ", 2008);
        Veiculo moto01 = new Moto(true, "Honda", "CG160", 2016);
        Veiculo moto02 = new Moto(true, "Honda", "CG125", 2022);
        Veiculo moto03 = new Moto(true, "Honda", "CG150", 2009);
        Veiculo carro05 = new Carro(2, "Nissan", "Skyline GT-R R33", 1995);
        Veiculo carro06 = new Carro(2, "Nissan", "Skyline GT-R R35", 2007);
        Veiculo carro07 = new Carro(2, "Nissan", "Skyline GT-R R32", 1994);

        System.out.println(carro01.exibirDetalhes());
        System.out.println(carro02.exibirDetalhes());
        System.out.println(carro03.exibirDetalhes());
        System.out.println(carro04.exibirDetalhes());
        System.out.println(carro05.exibirDetalhes());
        System.out.println(carro06.exibirDetalhes());
        System.out.println(carro07.exibirDetalhes());
        System.out.println(moto01.exibirDetalhes());
        System.out.println(moto02.exibirDetalhes());
        System.out.println(moto03.exibirDetalhes());
    }
}
