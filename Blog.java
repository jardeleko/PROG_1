import java.util.*;
public class Blog{
	public static List <Post> posting = new ArrayList <> ();

	
	public void readDate(Post p){

		if (p instanceof ProductReview){ //Usando instanceof
			
			String title;
			Date date = new Date();
			String content;
			String brand;
			int stars;
			
			ProductReview p2 = (ProductReview) p; //Acontece Downcast
			Scanner input = new Scanner(System.in);
			
			System.out.println("Title of product review:");
			title = input.nextLine();
			p2.settitle(title);
			p2.setDate(date);
			System.out.println("Content of the post:");
			content = input.nextLine();
			p2.setcontent(content);
			System.out.println("Indicate the brand of the post");
			brand = input.nextLine();
			p2.setbrand(brand);
			System.out.println("Please rate publication 1 to 10:");
			stars = input.nextInt();
			p2.evaluate(stars);
			posting.add(p2);
	

		}
		else if ( p instanceof News){ // Usando instanceof 
			
			String title;
			Date date = new Date();
			String content;
			String source;
			

			News p3 = (News) p; //Acontece Downcast
			Scanner input = new Scanner(System.in);
			
			System.out.println("Title for publication of news:");
			title = input.nextLine();
			p3.settitle(title);
			p3.setDate(date);
			System.out.println("Content of the post:");
			content = input.nextLine();
			p3.setcontent(content);
			System.out.println("Source of the news:");
			source = input.nextLine();
			p3.setsource(source);
			posting.add(p3);
	
			

		}
		else if ( p instanceof Post){ 
			
			String title;
			Date date = new Date();
			String content;

			Post p1 = (Post) p; // Acontece Downcast
			Scanner input = new Scanner(System.in);	

			System.out.println("Title of publication:");
			title = input.nextLine();
			p1.settitle(title);
			p1.setDate(date);
			System.out.println("Content of the post:");
			content = input.nextLine();
			p1.setcontent(content);
			posting.add(p1);
		

		} 
		
	}
		public void showAll(){
			int page=0;
			Iterator <Post> it = posting.iterator();
				while (it.hasNext()){
					Post p = it.next();
					p.show(); //Acontece polimorfismo
					System.out.println("Index: "+page);
					page++;
				} 




		}
	public static void main (String []args){
		Post p;
		int option;
		int op;
		Blog blog = new Blog(); // criando objeto blog para usar suas funçoes
		Scanner le = new Scanner(System.in);
		//Obs: Eu crio sempre varios scanners pelo fato de evitar problema no buffer

		do {
			System.out.println ("\n\n\n\n\nBLOG: what do you want to do ");
			System.out.println ("(1) - New News post");
			System.out.println ("(2) - New product review");
			System.out.println ("(3) - Post from other topics");
			System.out.println ("(4) - List all posts");
			System.out.println ("(5) - Like a post");
			System.out.println ("(6) - Do not like a post");
			System.out.println("(10) - Get out\n\n\n\n");
			System.out.println("Choose de option:");
		
			option = le.nextInt();

				if(option == 1){
					p = new News(); //Acontece o UPCAST
					blog.readDate(p);
				
				}
				else if (option == 2){
					p = new ProductReview();//Acontece UPCAST
					blog.readDate(p);
				}
				else if (option == 3){
					p = new Post();
					blog.readDate(p);
				}
				else if (option == 4){
					blog.showAll();
				}
				else if(option == 5){
					System.out.println("Enter the index to like: ");
					op = le.nextInt();
					p = posting.get(op);
					p.toLikes();
				}
				else if (option == 6){
					System.out.println("Enter the index to dislike: ");
					op = le.nextInt();
					p = posting.get(op);
					p.toDislikes();
				}

			}while (option != 10);	
	}
}
