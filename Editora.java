public class Editora{
	private String nomeEditora;
	private String cnpj;
	public Editora (){
		
	}
	public Editora (String nomeEditora, String cnpj){
		this.nomeEditora = nomeEditora;
		this.cnpj = cnpj;
	}
	public void setnomeEditora( String nomeEditora){
		this.nomeEditora = nomeEditora;
	}
	public String getnomeEditora (){
		return this.nomeEditora;
	}
	public void setcnpj(String cnpj){
		this.cnpj = cnpj;
	}
	public String getcnpj(){
		return this.cnpj;
	}
	public String toString(){
      return "\nEditora: "+this.nomeEditora+ "\nCnpj: "+this.cnpj;
	}
}
