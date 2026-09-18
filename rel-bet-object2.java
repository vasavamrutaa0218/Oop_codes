class employee{
	private String name;
	private int age;
	private company c;

	employee(String name, int age,company c){
		this.name = name;
		this.age = age;
		this.c=c;
	}
	String getname(){
		return name;
	}
	int getage(){
		return age;
	}

	company getcompany(){
		return c;
	}
}
class company{
	private String Cname;
	private String loc;
	
	company(String Cname,String loc){
		this.Cname=Cname;
		this.loc=loc;
	}
	String getCname(){
		return Cname;
	}

	String getloc(){
		return loc;
	}
}
class demo{
	public static void main(String[]args){
	
	company c1 = new company("TCS","pune");
	employee e1 = new employee("sujit", 23, c1);

	System.out.println("name is :"+e1.getname());
	System.out.println("age is :"+e1.getage());
	System.out.println("company name is:"+e1.getcompany().getCname());
	System.out.println("company loc is:"+e1.getcompany().getloc());
	}
}