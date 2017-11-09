import java.util.Scanner;
public class menu {
	public static void main (String[]args) {
		Scanner entrada = new Scanner (System.in); 
		int ncount = 0;

		Conta Count1 = new Conta (ncount++, "Pedro");
		Conta Count2 = new Conta (ncount++, "Count2");

		int op = 1;
		do {
			System.out.println ("----------------------------------------");
			System.out.println ("- Digite a opção desejada:             -");
			System.out.println ("----------------------------------------");
			System.out.println ("x {1} Consulta de saldo                x");
			System.out.println ("x {2} Para efetuar saque               x");
			System.out.println ("x {3} Para efetuar depósito            x");
			System.out.println ("x {4} Para efetuar transferência       x");
			System.out.println ("x {5} Para exibir dados da Conta       x");
			System.out.println ("x {6} Para sair                        x");
			System.out.println ("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

			op = entrada.nextInt();
			
			}while (op != 0);
				switch (op){
				case (1): {
					System.out.println (Count1.consulta());
				break;
				}		
				case (2): {
					System.out.println ("Insira um valor para sacar");
					Double valorSaque = entrada.nextDouble ();
					if (valorSaque <= Count1.consulta){
					Count1.sacar (valorSaque);
					System.out.println ("Você ainda possui" +Count1.consulta());	
				} 
				else {
					System.out.println ("Saldo insuficiente, tente novamente");
				}
				break;
				}
				case (3): {
					Double valorDeposito = entrada.nextDouble ();
					Count1.depositar = (valorDeposito);
				break;
				}
				case (4): {	
					Double valorTransf = entrada.nextDouble ();
					if (valorTransf <= Count1.consulta){
			 		Count1.sacar (valorTransf);
					Count2.depositar (valorTransf);
				}
				break;
				}
				case (5): { 
					System.out.println ("Saldo da Conta 1:" +Count1.consulta());
					System.out.println ("Saldo da Conta 2:" +Count2.consulta());
				break;
					}
				default: {
				op = 0;
			}	
		}

	}

	
}
