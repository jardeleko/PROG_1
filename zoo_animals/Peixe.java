
public class Peixe extends Animal {
	String caracteristicas;
	public void getcaracteristicas(String caracteristicas){
		this.caracteristicas = caracteristicas;
	}
	public void setcaracteristicas(String caracteristicas){
		this.caracteristicas = caracteristicas;
	}
	public void dados(){
        super.dados();
		System.out.println (" Caracteristicas: "+this.caracteristicas);
	}

}
