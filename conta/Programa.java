import java.util.*;

public class Programa {
	
	public static void main (String[]args){
	conta minhaConta = new conta ();
	Scanner ent = new Scanner(System.in);
	int numero=0, op=0;
	do {
	System.out.println ("\n\n\n\n\n");
	System.out.println ("            <<<<<    -Digite a opção desejada-   >>>>> ");
	System.out.println ("            <<<<< {1} Cadastramento de conta     >>>>> ");
	System.out.println ("            <<<<< {2} Consultar saldo            >>>>> ");
	System.out.println ("            <<<<< {3} Efetuar saque              >>>>> ");
	System.out.println ("            <<<<< {4} Efetuar Deposito           >>>>> ");
	System.out.println ("            <<<<< {5} Listar todas as contas     >>>>> ");
	System.out.println ("            <<<<< {6} Sair                       >>>>> ");
	System.out.println ("\n\n\n\n\n");
		op = ent.nextInt();
			if (op==1){
			
				System.out.println ("\nNome titular:");
				minhaConta.nome = (ent.next() );
				System.out.println ("\nDeposito de cadastramento de conta:");
				minhaConta.saldo = ent.nextDouble ();
				minhaConta.numero = numero;
				numero++;
				System.out.println ("\nConta cadastrada com sucesso!");
			}
			else if (op==2){
				System.out.println ("\nO saldo atual é de "+ minhaConta.saldo);	
			}
			else if (op==3){
				System.out.println ("\nDigite o valor do saque: ");
			if  (minhaConta.saca (ent.nextDouble() )){
				System.out.println ("\nSaque efetuado com sucesso\n Novo saldo:" + minhaConta.saldo);
			} 
			else {

				System.out.println ("\nSaldo insuficiente");
			}
			}
			else if (op==4){
				System.out.println ("\nValor do deposito: ");
				minhaConta.deposito(ent.nextDouble());
			}
			else if (op==5){
				System.out.println ("\n<Opção em construção>");
			}
			else if (op==6){
				System.out.println ("\nFinalizando aplicação");
			}
			else {
				System.out.println ("\nOpção inválida.");
			}

		} while (op != 6);
	}
}