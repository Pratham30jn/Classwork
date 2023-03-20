package Constructor;

public class User {
	
	String name;
	String emailId;
	int rollNo;
	static int count;
	
	//System.out.println("Inside  Constructor");
	
	  public User() { System.out.println("Inside constructor"); }
	 
	public User(String name,int rollNo) {
		this();
		
		this.name=name;
		this.rollNo=rollNo;
		count++;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", emailId=" + emailId + ", rollNo=" + rollNo + "]";
	}
	

}
