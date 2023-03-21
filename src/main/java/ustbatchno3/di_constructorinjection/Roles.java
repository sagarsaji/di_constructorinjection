package ustbatchno3.di_constructorinjection;

public class Roles {

	public String charactername;
	public String responsibility;
	public Roles(String charactername, String responsibility) {
		super();
		this.charactername = charactername;
		this.responsibility = responsibility;
	}
	
	public void display() {
		System.out.println("My name : " + charactername);
		System.out.println("\nMy responsibility : " + responsibility);
	}
	
}
