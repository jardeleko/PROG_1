//package Bodega;

import java.util.*;
public class Bebida {
	String nomeBebida;
	double qtd_ml;
	double teorAlcoolico;
	double preco;
	int qtd_Stoq;
	

	public Bebida (){

	}
	public Bebida (String nome, double ml, double teor, double valor, int stoq){
		this.nomeBebida = nome;
		this.qtd_ml = ml;
		this.teorAlcoolico = teor;
		this.preco = valor;
		this.qtd_Stoq = stoq;
	}
	
	public String toString (){
		return "\nNome da bebida:" +this.nomeBebida+ 
				"\nQuantidade ml: "+this.qtd_ml+ 
				"\nTeor alcoolico: " +this.teorAlcoolico+
				"\nPreço em R$: "+this.preco+
				"\nQuantidade em estoque: "+this.qtd_Stoq;
				
	}
	public boolean verifica(String nome){
		if (this.nomeBebida.equals(nome)){
				return true;
		} 
		return false;		
	}
	public boolean conferirStoq (int aux){
		if (this.qtd_Stoq >= aux){
			return true;
		}
		else {
			return false;
		}
	}
	public void venderBebida (int aux){
		if (conferirStoq(aux)){
			this.qtd_Stoq -= aux;
		}
		else {
			System.out.println ("Quantidade não disponivel em estoque!");
			System.out.println ("Disponivel apenas" + this.qtd_Stoq);
		}
	} 
	public void comprarBebida (int aux){
		if (conferirStoq(aux)){
			this.qtd_Stoq += aux;
		}

	}

	public void setnome(String nome){
		this.nomeBebida = nome;
	}

	public void setml(double ml){
		this.qtd_ml = ml;
	}

	public void setteor(double teorAlcoolico){
		this.teorAlcoolico = teorAlcoolico;
	}

	public void setvalor(double valor){
		this.preco = valor;
	}
	public void setestoque(int qtd_Stoq){
		this.qtd_Stoq = qtd_Stoq;
	}

}
