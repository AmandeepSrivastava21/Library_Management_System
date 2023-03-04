package libraryhandler;

public class User {
    User user[]=new User[5];
	int id;
	String pass;
	    
	public  User userRegister(int id,String pass) {
		User newuser=new User();
		newuser.id=id;
		newuser.pass=pass;
		return newuser;
		
	}
	public  boolean loginCheck(int id,String pass){
		boolean status=false;
		
		for(User data:user) {
			if(data!=null) {
			if(data.id==id && pass.equals(data.pass)) {
				status= true;
				break;
			}
			else {
				status= false;
			}}
			else {
				status =false;
			}
			
		}
		return status;
	}



}
