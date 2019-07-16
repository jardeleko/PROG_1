import javax.swing.JOptionPane;
 import java.util.*;
public class TestPublicacao {

	public static void main (String [] args){
	Scanner ent = new Scanner (System.in);
	List <Publicacao> pub = new ArrayList <>();
	List <PublicacaoSemanal> pubS = new ArrayList <>();
	int op, op2, op3;

    
		do {
			//OBS implementei um botao pra dar uma otimizada 
			//mas por alguma razao ele precisa de duas entradas uma na mensagem e outra no terminal
			//caso isso possa ser desconsiderado da nota eu ajusto novamente
			//valeeu kkk
			JOptionPane.showInputDialog(null ,"1 - Criar publicação				\n2 - Mostrar publicações				\n3 - Sair					", "Menu Principal", JOptionPane.PLAIN_MESSAGE);

	
			op = ent.nextInt();
	
			switch(op){
			case 1:
				do {
			JOptionPane.showInputDialog(null, "1 - Criar publicação mensal      \n2 - Criar publicação semanal     *\n3 - Voltar ao menu anterior      ", "Menu Publicações", JOptionPane.PLAIN_MESSAGE);

					op2 = ent.nextInt();
			    	
                    if (op2 == 1){
                    	Scanner le = new Scanner(System.in);
				    	Publicacao p = new Publicacao();
				    	p.referenciarEditora();
			    		System.out.println("Nome da publicação: ");
				    	p.setnomePublic(le.nextLine());
				    	System.out.println ("Preço do exemplar R$:");
					    p.setprecoExemplar(le.nextDouble());
					    System.out.println ("Quantas publicações mensais em um ano(12 meses): ");
					 	p.calcularAnuidade(le.nextInt());
					    pub.add(p);
				    }
				    else if (op2 == 2){
						Scanner le = new Scanner (System.in);			    
				    	PublicacaoSemanal P = new PublicacaoSemanal(); 
				    	P.referenciarEditora();   	
				    	System.out.println ("Nome da publicação: ");
				    	P.setnomePublic(le.nextLine());
					    System.out.println ("Preço do exemplar: ");
					    P.setprecoExemplar(le.nextDouble());
					    System.out.println("Quantas publicações semanis em um ano(52 semanas): ");
					    P.calcularAnuidade(le.nextInt());
					    P.taxaEntrega();
					    pubS.add(P);
				    }
			    }
                while(op2<=2);
			break;

		case 2:
            System.out.println ("Para listar publicação mensal digite 1, semanal digite 2:");
            op3 = ent.nextInt();
            if (op3==1){
                Iterator <Publicacao> ite = pub.iterator();
                    while (ite.hasNext()){
                    Publicacao p = ite.next();
                     p.imprimirDados();
                     }
            }
            else{
               Iterator <PublicacaoSemanal> itera = pubS.iterator();
                    while (itera.hasNext()){
                    PublicacaoSemanal P = itera.next();
                    P.imprimirDados();
                    }
                }
			break;
		case 3:
			return;
		default:
			System.out.println ("Opção invalida, digite novamente!");
			break;
            }
		}while (op<=3);
	}
}
