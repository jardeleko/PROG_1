class Mamifero extends Animal{
	String alimento;

	public String getalimento(){
	return this.alimento;
	}
	public void setalimento(String alimento){
	this.alimento = alimento;
	}
	public void dados(){
    super.dados();
	System.out.println (" Alimento: " +this.alimento); 
	}
}
