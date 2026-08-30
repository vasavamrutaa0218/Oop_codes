//By using setter /getter Methods

class Codex{
	int age;
	String name;
	
	Codex(int age,String name){
		this.age = age;
		this.name = name;
	}
	void setAge(int age){
		this.age=age;
	
	}
	
	int getAge(){
		return age;
	}

	String getName(){
		return name;
	}



}
class demo{
	public static void main(String[]args){
	 
	Codex c=new Codex(10,"Amruta");
	Codex c1= new Codex(20,"Tanvi");
	
	System.out.println("Age :"+c.getAge());
	System.out.println("Name :"+c.getName());
	System.out.println("----------------------");
	System.out.println("Age :"+c1.getAge());
	System.out.println("Name :"+c1.getName());

	System.out.println("after modify the data");
	c.setAge(25);
	c1.setAge(35);
	System.out.println("Age :"+c.getAge());
	System.out.println("Name :"+c.getName());

	System.out.println("Age :"+c1.getAge());
	System.out.println("Name :"+c1.getName());
	


	}

}