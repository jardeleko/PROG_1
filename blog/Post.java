import java.util.*;
//assuntos genéricos
public class Post{
	private String title;
	private Date date;
	private String content;
	private int likes = 0;
	private int dislikes = 0;
	
	

	public Post(){

	}
	public Post(String title, String content){
		
		this.title = title;
		this.content = content;
	}

	public void settitle(String title){
		this.title = title;
	}
	public String gettitle(){
		return this.title;
	}
	public void setDate (Date date){
		this.date = date;
	}
	public Date getDate(){
		return this.date;
	}
	public void setcontent (String content){
		this.content = content;
	}
	public String getcontent(){
		return this.content;
	}



	public void show(){
		System.out.println("------------------------------------------------");
		System.out.println("Title: "+this.title+"\n");
		System.out.println("Date: "+ this.date+"\n");
		System.out.println("Content: "+this.content+"\n");
		System.out.println("Likes: "+this.likes);
		System.out.println("Dislikes: "+this.dislikes);
	}
	public void toLikes(){
		this.likes++;
	}
	public void toDislikes(){
		this.dislikes++;
	}

}
