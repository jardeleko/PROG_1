import java.io.File;
public class ArquivoJava{
	public static void main(String []args){
	File file = new File("novo diretório");
	//criar pasta
	file.mkdir();
	//apagar pasta
	file.delete();
	
	}
}