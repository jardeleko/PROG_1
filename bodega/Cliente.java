//package Bodega;
public class Cliente {
	String nomeCliente;
	String cpf;
	boolean fiado;
	
	public Cliente (){
	
	}

	public Cliente (String nome, boolean clienteFiado, String cpf) {
		this.nomeCliente = nome;
		this.cpf = cpf;
		this.fiado = clienteFiado;
		}

	
	public void setnomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public void setcpf (String cpf){
		this.cpf = cpf;
	}
	public void setfiado (boolean fiado){
		this.fiado = fiado;
	}

	
	public String toString(){
		return "\nNome Cliente: "  + this.nomeCliente + 
			"\nCPF Cliente: " + this.cpf +
			"\nPode vender Fiado?" + this.fiado;
	}
	
}	
