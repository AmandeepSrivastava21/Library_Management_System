
package libraryhandler;
import java.util.*;
import java.lang.*;

public class Main{
	
	public static void main(String[] args) {
		try {
	       Scanner st = new Scanner(System.in);
	       Scanner sc=new Scanner(System.in);
		    User obj=new User();
		    Admin adminobj=new Admin();

		    Book book1=new Book(1,"Amandeep","ThoughtOfGod","Balaji");
		    Book book2=new Book(2,"Amandeep","ImpuritiesOfLife","Aws");
		    Book book3=new Book(2,"Amandeep","ImpuritiesOfLife","Aws");
		    Book.book[0]=book1;
		    Book.book[1]=book2;
		    Book.book[2]=book3;
		    
		
			obj.user[0]=new User();
			obj.user[1]=new User();
			
			obj.user[0].id=1001;
			obj.user[0].pass="aman";
			obj.user[1].id=1002;
			obj.user[1].pass="nikhil";
			
			int userlength=obj.user.length;
			int choice=0;
			boolean status=true;
			while(status) {
			
			do {
			  System.out.println("for new user press 1"); 
			  System.out.println("for existing use press 2");
			  System.out.println("for admin press 3");
			  System.out.println("for exit the system");
			  choice=st.nextInt();
			  
            }
			while(choice==0);
			if(choice==1) {
				do {
					System.out.println("Press 1 for register");
					System.out.println("press 3 for back to main menu");
					choice=st.nextInt();
					switch(choice) {
					  case 1:
						  
						  System.out.println("Enter your id and pass");
							int id=st.nextInt();
							String pass=st.next();
							User newuser =obj.userRegister(id,pass);
							for(int i=0;i<userlength;i++) {
								if(obj.user[i]==null) {
								obj.user[i]=newuser;
									System.out.println("user added successfully");
									
									System.out.println("userid: "+obj.user[i].id+" userpass: "+obj.user[i].pass);
								    break;
							    }
								
							}break;
					  
					 
					  case 3:{
						  choice=0;
						  break;
					  }
					}}
				while(choice==1);
				}
			else if(choice==2) {
				do {
					System.out.println("if you want to login Enter your id and pass 1");
					System.out.println("press 2 for go back to main menu");
					choice=sc.nextInt();
					switch(choice) {
					  case 1:
						    int id=st.nextInt();
							String pass=st.next();
							boolean result=obj.loginCheck(id,pass);
							if(result==true) {
							System.out.println("you are successfully logged in");
							
							while(choice==1) {
							System.out.println("press 1 you want to search");
							System.out.println("press 2 for logout");
							choice=st.nextInt();
							switch(choice) {
							 case 1:
								 System.out.println("enter your book title");
								 String titleforsearch=sc.next();
								// System.out.println(titleforsearch);
								 if(Book.searchBook(titleforsearch)) {
									 System.out.println("yes we find that book: "+titleforsearch);
								 }
								 else {
									 System.out.println("not found this book");
								 }break;
							 case 2:
								 choice=2;
								 break;
					
							
							}}}
						    else {
								   System.out.println("User not found!");
							} break;
						
					  case 2:
						  choice=0;
					}
				}
				while(choice==2);
				   
			}
			else if(choice==3) {
				do {
					System.out.println("if you are admin please login press 1");
					System.out.println("back to main menu press 2");
					
					choice=st.nextInt();
					switch(choice) {
					   case 1:
						    System.out.println("enter your id and pass");
							String id=st.next();
							String pass=st.next();
							boolean result=adminobj.adminCheck(id, pass);
		
							if(result==true) {
					          System.out.println("you are successfullylogged in");
					          do {
					        	  System.out.println("if you want to add book press 1");
					        	  System.out.println("if yoy wnat to remove the book press 2");
					        	  System.out.println("press 3 for logout");
					        	  choice=st.nextInt();
					        	  try {
					        	  switch(choice) {
					        	     case 1:
					        	    	 adminobj.addBook();
					 					 adminobj.showAllBooks();
					 					 break;
					        	     case 2:
					        	    	 adminobj.removeBook();
					        	    	 adminobj.showAllBooks();
					                     break;
					        	  
					        	     case 3:
					        	    	 choice=3;
					        	     
					        	  
					        	  
					        	  }}
					        	  catch(Exception e){
					        		  
					        	  }
					        	  
					          }
					          while(choice==1||choice==2);
					          
					          
					          
					
							}break;
					  case 2:
						choice=0;   
						break;
					  }

				}
				while(choice==3);
				
			}
			else{
				status=false;
			}
			
				
	
				
				
				
				
				
				
				
				
				
				
				
			}
			System.out.println("System shut");	
		 }
		
		catch(Exception e) {
		 System.out.println(e);
		}
	}	
}
	
		



