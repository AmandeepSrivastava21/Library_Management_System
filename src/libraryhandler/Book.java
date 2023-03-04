package libraryhandler;

public class Book {
	

	int id;
	String author;
	String title;
	String publication;
    static Book book[]=new Book[5];
	public Book(){
		
	}
	public Book(int id, String author, String title, String publication) {
		super();
		this.id = id;
		this.author = author;
		this.title = title;
		this.publication = publication;
	}
	
	public static boolean searchBook(String title) {
		
		boolean flg=false;
	    for(int i=0;i<book.length;i++) {	
		if(book[i].title.compareTo(title)==0) {
			flg=true;
			break;
		    
		    }
		else {
			flg=false;
		}
			
		
}
	 return flg; 
    
    
	}
	
		
	

}
