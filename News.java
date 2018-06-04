public class News extends Post{
	//classe herdando de Post 
	private String source;
	
	public News(){
	
	}
	public News (String title, String content, String source){
		super(title, content);	
		this.source = source;
	}

	public void setsource(String source){
		this.source = source;
	}
	public String getsource(){
		return this.source;
	}
	public void show(){
		super.show();
		System.out.println("Source: "+this.source);
	}
}
