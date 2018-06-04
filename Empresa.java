//package Bodega;

import java.util.*;
public class Empresa {
	String nomeEmpresa;
	String rSocial;
	String cnpj;	
	int qtdFunc, qtdBebida, qtdClient;	
	Funcionario f = new Funcionario();			
	List <Funcionario> bodegueiros = new ArrayList <Funcionario>();
	ArrayList <Bebida> bebidas = new ArrayList <>();
	ArrayList <Cliente> cliente = new ArrayList <>();
	Scanner ent = new Scanner (System.in);
		

	public Empresa (String nomeEmp, String rS, String cnpj){
		this.nomeEmpresa = nomeEmp;
		this.rSocial = rS;
		this.cnpj = cnpj;

	}
	public void adicionar(Funcionario f1){
		bodegueiros.add(f1);
	}

	public String toString (){
		return "Nome da empresa:" +this.nomeEmpresa+
		"Razao social:" +this.rSocial+
		"Cnpj: " +this.cnpj+ 
		"Funcionarios:" +this.bodegueiros+ 
		"Bebidas: "+this.bebidas;
	}
		// colocar 3 funcionarios fixos
	
	
	public void contrata (Funcionario f){
		Scanner le = new Scanner(System.in);
			
		System.out.println("Digite o nome");
		f.setnome(le.nextLine());
		System.out.println("Digite o sobrenome");
		f.setsobrenome(le.nextLine());
		System.out.println("Digite o CPF");
		f.setcpf(le.nextLine());
		System.out.println("Digite o RG");
		f.setrg(le.nextLine());
		System.out.println("o id func");
		f.setid_func(le.nextLine());
		System.out.println(" dt de dataAdm");
		f.setdataAdm(le.nextLine());
		System.out.println("o salario");
		f.setsalario(le.nextLine());
		this.bodegueiros.add(f);
		this.qtdFunc++;
		}
		//cadastrar bodegueiros
	public void cadastraBebida (){

		Scanner ent = new Scanner (System.in);
		Bebida b = new Bebida();
		System.out.println ("Nome da bebida:");
		b.setnome(ent.nextLine());
		System.out.println ("Quantidade ml:");
		b.setml(ent.nextDouble());
		System.out.println ("Teor alcoolico");
		b.setteor(ent.nextDouble());
		System.out.println ("Valor da bebida em R$: ");
		b.setvalor(ent.nextDouble());
		System.out.println ("Quantidade em estoque: ");
		b.setestoque(ent.nextInt());
		this.bebidas.add(b);
		this.qtdBebida++;
	}
	public void cadastraCliente (){
		Scanner ent = new Scanner (System.in);
		Cliente c = new Cliente();
		System.out.println ("Nome do cliente: ");
		c.setnomeCliente(ent.nextLine());
		System.out.println ("Cpf do cliente:");
		c.setcpf(ent.nextLine());	
		System.out.println ("pode vender fiado? se sim 1, se não 0");
		c.setfiado(ent.nextBoolean());
		this.cliente.add(c);
		this.qtdClient++;
	}
		//Listar funcionarios

	public void listarFunc (){
		Iterator <Funcionario> it = bodegueiros.iterator();
		while (it.hasNext()){

			System.out.println (it.next().toString()); 
		}
	}	
		
		
	public void listarBebida () {
		Iterator <Bebida> it = bebidas.iterator();
		while (it.hasNext()){
			
			System.out.println (it.next().toString()); 
		}
	}
	public void listarCliente (){
		String p;
		for (int i=0; i<cliente.size(); i++){
		p=cliente.toString();
		System.out.println (p);
		}
	}
	public boolean conferiStoq (int bqtd, int bqtd2){
		if (bqtd>bqtd2){
			System.out.println("Quantidade excede o estoque!");
			return false;
		}
			return true;
	}
	public void Venda (){
		listarBebida();
		System.out.println ("Digite o nome da bebida a ser comprada:\n(ex: Cerveja, Coca-Cola, Whisky, Vodka, Agua mineral ");
		Scanner ent = new Scanner (System.in);		
		String nome = ent.nextLine(); 
				
		Iterator <Bebida> it = bebidas.iterator();
		while (it.hasNext()){

		Bebida b = it.next();
			if (b.verifica(nome)==true){
		 		System.out.println ("quantas und bebidas: ");
				 int aux = ent.nextInt();
				b.comprarBebida(aux);
			}
		}

	}
	public void Compra(){
		
		listarBebida();
		System.out.println ("Digite o nome da bebida que vai ser vendida: ");
		String nome = ent.nextLine();
		
			Iterator <Bebida> it2 = bebidas.iterator();
		while (it2.hasNext()){
		
		Bebida b = it2.next();
			if (b.verifica(nome)==true){
				System.out.println ("quantas und bebidas:");
				int count = ent.nextInt();
				b.venderBebida(count);
			}
		}
	}
}
		/*public void vendaBebida(String bnome, int bqtd){
			while (bebidas.b : this.bebidas;){
				if(b.nomeBebida.equals(bnome)){
					if (conferiStoq(bqtd, b.qtd_Stoq)){
						b.qtd_Stoq -= bqtd;
						System.out.println ("Venda efetuada com sucesso!!");
						return true;
					}
					else{
						System.out.println ("Quantidade em falta no estoque...");
						return false;
					}
				}
			}S
			public boolean compraBebida(String bnome, int bqtd){
			for(bebidas.b : this.bebidas){
			if(b.nomeBebida.equals(bnome)){
				if(conferirEstoque(bqtd,b.qtd_Stoq)){
					b.qtd_Stoq+=bqtd;
					System.out.println("Compra finalizada com sucesso!!");
					return true;
				}
				else {
					System.out.println ("Compra falhou");
					return false;
				}
			}
		}
		*/		
	

