import java.io.File;
public class ArquivoJava2{
	public static void main(String []args){
	File arquivo = new File("arquivo.txt");//pode ser xml tat file extension tanto faz
	
	
	/*criar pasta
	file.mkdir();
	//apagar pasta
	file.delete();
	*/
	//apagar arquivo arquivo.delete();
	try{
		//escrever dentro do arquivo 
		FileWriter fileWriter = new FileWriter (arquivo);
		BufferedWriter escrever = new BufferedWriter(fileWriter);
		escrever.write("fala pá nóis");
		escrever.close();
		fileWrite.close();
		//arquivo.createNewFile();
		//abrir para ler o que ja  foi  escrito
		FileReader ler = new FileReader(arquivo);
		BufferedReader lerb = new BufferReader(ler);
		
		String linha = lerb.readLine();
		While (linha != null){
			System.out.println(linha);
			linha = lerb.readLine();
		}
		File fil = new File("/");
		File fi [] = fil.listFile();
		
		for (int i=0; i<fi.length; i++){
			System.out.println(fi[i]);
		}
	}	
	catch (IOException ex){
		System.out.println("ERROR" +ex);
	}
	
}