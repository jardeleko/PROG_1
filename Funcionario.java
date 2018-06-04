//package Bodega;
import java.util.*;

public class Funcionario{
		String nome;
		String sobrenome;
		String cpf;
		String rg;
		String id_func;
		String dataAdm;
		String salario;

		public Funcionario () {

		}
		
		public Funcionario (String n, String s, String c, String r, String iF, String dt, String sal){
			this.nome = n;
			this.sobrenome = s;
			this.cpf = c;
			this.rg = r;
			this.id_func = iF;
			this.dataAdm = dt;
			this.salario = sal; 
		} 
		public void setnome (String nome){
			this.nome = nome;
		}
		public void setsobrenome (String sobrenome){
			this.sobrenome = sobrenome;
		}
		public void setcpf (String cpf){
			this.cpf = cpf;
		}
		public void setrg (String rg){
			this.rg = rg;
		}
		public void setid_func (String id_func){
			this.id_func = id_func;
		}
		public void setdataAdm (String dataAdm){
			this.dataAdm = dataAdm;
		}
		public void setsalario (String salario){
			this.salario = salario;
		}
		
		public String toString() {
			return 	"\n Nome funcionario: " + this.nome + "\nSobrenome: " + this.sobrenome + "\nCpf: " + this.cpf + "\nRG: " + this.rg + "\nID: " + this.id_func + "\nData de Admissão: "+ this.dataAdm + "\nSalario: "+ this.salario;
		
	}
}	

