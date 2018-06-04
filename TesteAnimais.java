public class TesteAnimais{
	public static void main (String [] args){
	Animal a = new Animal();
	Peixe p = new Peixe();
	Mamifero m = new Mamifero();
	
	System.out.println("ZOO:");
	System.out.println("*__________________________________*");
	a.setnome ("Camelo");
	a.setcor ("Amarelo");
	a.setambiente ("terrestre");
	a.setcomprimento("150 cm");
	a.setpatas(4);
	a.setvelocidade (13.5f);
	a.dados();
	System.out.println ("*__________________________________*");
	
	p.setnome("Tubarão");
	p.setcor("Cinzento");
	p.setambiente("Agua");
	p.setcomprimento("300 cm");
	p.setpatas(0);
	p.setvelocidade(1.5f);
	p.setcaracteristicas("Barbatanas e caudas");
	p.dados();

	System.out.println ("*__________________________________*");
	m.setnome("Urso-do-canadá");
	m.setcor("Vermelho");
	m.setambiente("terrestre");
	m.setcomprimento("180 cm");
	m.setpatas(4);
	m.setvelocidade(0.5);
	m.setalimento("Mel");
	m.dados();
	}
}
