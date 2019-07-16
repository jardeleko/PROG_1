public class Animal{
	private String nome;
	private String cor;
	private String ambiente;
	private String comprimento;
	private int patas;
	private double velocidade;
		
	public Animal () {

	}
	public void setnome (String nome){
	this.nome = nome;
	}
	public void setcor(String cor){
	this.cor = cor;
	}
	public void setambiente (String ambiente){
	this.ambiente = ambiente;
	}
	public void setcomprimento (String comprimento){
	this.comprimento = comprimento;
	}
	public void setpatas (int patas){
	this.patas = patas;
	}
	public void setvelocidade (double velocidade){
	this.velocidade = velocidade;
	}
	public String getnome(){
	return this.nome;
	}
	public String getcor(){
	return this.cor;
	}
	public String getambiente(){
	return this.ambiente;
	}
	public String getcomprimento(){
	return this.comprimento;
	}
	public int getpatas(){
	return this.patas;
	}
	public double getvelocidade (){
	return this.velocidade;
	}

	public void dados(){
		System.out.println (" Nome: " +this.nome); 
		System.out.println (" Cor: "+this.cor); 
		System.out.println (" Habitat: "+this.ambiente);
		System.out.println (" Comprimento: "+this.comprimento);
		System.out.println (" Quantidade de patas: "+this.patas);
		System.out.println (" Velocidade: " +this.velocidade);
	}

}
