public class PublicacaoSemanal extends Publicacao {
	private double taxaEntrega;
	
	public PublicacaoSemanal(){

	}
	public void settaxaEntrega(double taxaEntrega){
		this.taxaEntrega = taxaEntrega;
	}
	public double gettaxaEntrega(){
		return this.taxaEntrega;
	}

	public void taxaEntrega(){
		super.getvalorAnuidade();
		this.taxaEntrega = super.getvalorAnuidade();
		this.taxaEntrega = this.taxaEntrega * 0.05;
	}
	public void imprimirDados(){
		super.imprimirDados();
		System.out.println ("Taxa de entrega semanal: " +this.taxaEntrega);
	}
}