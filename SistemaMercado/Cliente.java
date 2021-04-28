package SistemaMercado;

import java.util.Scanner;

//Sub-Classe com Encapsulamento
public class Cliente {
       
	//Esses atributos estão em private (Protegidos) ou seja só podem ser alterados dentro dessa classe ou por encapsulamento  
	private String nome;
	private int idade;
    private double saldo;//Vamos subtrair esse valor com o Valor total da compra
 	
    //Get and Setters   
    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}