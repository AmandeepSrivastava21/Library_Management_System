package libraryhandler;
import java.util.*;
public class Admin extends Book{
      
	  String admin="Amandeep";
	  String pass="Ads@191500101";
	 
	
	  
	  Scanner sc=new Scanner(System.in);
	  Scanner sr=new Scanner(System.in);
	 
	  	  public boolean adminCheck(String admin,String pass) {
		  if(admin.equals(this.admin)&&pass.equals(this.pass)) {
			  return true;
		  }
		  else {
			  return false;
		  }
	  }
	  	public void addBook() {
	  		System.out.println("enter book information:id,author,title,publication");
	  		int id=sc.nextInt();
	  		String author=sc.next();
	  		String title=sc.next();
	  		String publication=sr.next();
	  		
			Book newbook=new Book();
			newbook.id=id;
			newbook.author=author;
			newbook.title=title;
			newbook.publication=publication;
			
			for(int i=0;i<book.length;i++) {
				if(book[i]==null) {
					book[i]=newbook;
					System.out.println("book added Succesfully");
					break;
				}
			}
		
	}
	  	 
	 public void removeBook() {
		 System.out.println("enter your id");
		 int id=sc.nextInt();
		  
		for (int i = 0,  j = 0; j < book.length; j++) {
						
			  if (book[i].id==id) {
                  book[i++] = book[j];
			   }

			  book = Arrays.copyOf(book, i);
			  System.out.println("book removed successfully");
	    }
	}
	public void showAllBooks() {
		for(Book book:book) {
			System.out.println(book.id+" "+book.author+" "+book.title+" "+book.publication);
		}
	}
}
	    

	  
	  


