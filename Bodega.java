//package Bodega;
import java.util.*;
public class Bodega{
	public static void main(String[] args){
		Empresa emp= new Empresa("Joaozin da bodega", "Bar do João", "12338");
		Scanner ent = new Scanner (System.in);
		Funcionario f = new Funcionario();
		
		
		Funcionario f1 = new Funcionario("Manolo", "Silva", "027,378,090-09", "6519677", "502", "21/12/2014", "1900");
		emp.adicionar(f1);
		Funcionario f2 = new Funcionario("Josenildo", "Carvalho", "177,590,696-22", "1548477", "200", "15/01/2003", "2500");
		emp.adicionar(f2);
		Funcionario f3 = new Funcionario("Jandira", "Souza", "455,321,770-10", "1454987", "677", "24/10/2016", "1200");
		emp.adicionar(f3);
		



		int op = 0;
		do {
			System.out.println ("--=      Menu Principal		   =--");
			System.out.println ("{1} Para cadastrar funcionários        --");
			System.out.println ("{2} Para litas funcionários   	    --");
			System.out.println (" *           =====        		*-");
			System.out.println ("{3} Para cadastrar bebida	 	--");
			System.out.println ("{4} Listar bebidas cadastradas	--");
			System.out.println ("{5} Comprar bebidas		--");
			System.out.println ("{6} Vender bebidas			--");
			System.out.println ("*            =====                 *-");
			System.out.println ("{7} Cadastrar clientes  			--");
			System.out.println ("{8} Listar clientes     	 	        --");

			op = ent.nextInt ();
			switch (op){
				case 1:
					emp.contrata(f);
					break;
				case 2:
					emp.listarFunc();
					break;
				case 3:
					emp.cadastraBebida();
					break;
				
				case 4:
					emp.listarBebida();	

					break;
				case 5:
					emp.Venda();
					break;
				case 6:
					emp.Compra();
					break;
				case 7:
					emp.cadastraCliente();
					break;
				case 8:
					emp.listarCliente();
					break;
				}		
		}while(op<=8);
	}
}
