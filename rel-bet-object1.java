class employee{
	String name;
	int age;
	company c;

	employee(String name,int age, company c){
		this.name=name;
		this.age=age;
		this.c=c;
	}

	void display(){
		System.out.println("name is :"+name);
		System.out.println("age is :"+age);
		System.out.println("c_name is :"+c.c_name);
		System.out.println("loc is :"+c.loc);


	}

}
class company{
	String c_name;
	String loc;

	company(String c_name, String loc){
		this.c_name=c_name;
		this.loc=loc;
	}

}
class demo{
	public static void main (String[]args){
	
	company c1= new company("TCS","Pune");
	employee e1 = new employee("Shubham", 28 ,c1);
	e1.display();
	System.out.println("--------------------------------");


	company c2 = new company("capg","Mumbai");
	employee e2 = new employee("sanket", 27, c2);
	e2.display();

	}
}