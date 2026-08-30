class Employee{
	String name;
	private String comp;
	int Id;

	Employee(String name,String comp, int Id){
		this.name=name;
		this.comp=comp;
		this.Id=Id;
	
	}
	void display(){
		System.out.println("name :"+name);
		System.out.println("comp :"+comp);
		System.out.println("Id :"+Id);
	}
	void setComp(String comp){
		this.comp=comp;
	}

}
class demo{
	public static void main(String[]args){
		Employee e = new Employee("Shubham","Codex",10);
		e.display();

		System.out.println("after modify the company");
		e.setComp("TCS");
		e.display();
		System.out.println("--------------------------");

		Employee e1 = new Employee("Sanket","Capg",20);
		e1.display();
		System.out.println("after modify the company");

		e1.setComp("Google");
		e1.display();


	}

}