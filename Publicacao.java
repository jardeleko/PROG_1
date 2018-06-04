import javax.swing.JOptionPane;
import java.util.*;

public class Publicacao {
	private String nomePublic;
	private double precoExemplar;
	protected double valorAnuidade;
	String ed;
	Editora edit = new Editora();

	public void setnomePublic (String nomePublic){
		this.nomePublic = nomePublic;
	}
	public String getnomePublic(){
		return this.nomePublic;
	}
	public void setprecoExemplar (double precoExemplar){
		this.precoExemplar = precoExemplar;
	}
	public double getprecoExemplar (){
		return this.precoExemplar;
	}
	public double getvalorAnuidade(){
		return this.valorAnuidade;
	}
	public void calcularAnuidade (int aux){
		this.valorAnuidade = this.precoExemplar * aux;
	}
	public void referenciarEditora(){
		Scanner ent = new Scanner(System.in);
		System.out.println ("Editora: ");
		edit.setnomeEditora(ent.nextLine());
		System.out.println("Cnpj:");
		edit.setcnpj(ent.nextLine());
	}

	public void imprimirDados(){
		String ed = edit.toString();
		System.out.println
		(ed);
		System.out.println("Nome Publicação: " +this.nomePublic);
		System.out.println("preço exemplar: "+this.precoExemplar);
		System.out.println("Valor da anuidade: "+this.valorAnuidade);
	}
}