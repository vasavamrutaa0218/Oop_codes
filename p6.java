class student{
	String name;
	int id;
	String branch;

	student(String name,int id,String branch){
		this.name = name;
		this.id = id;
		this.branch = branch;
	}
	void setId(int id){
		this.id = id;
	}

	void getId(){
		return id;
	}

}
class demo{
	public static void main(String[]args){
	
	student s1 = new student("shubham",10,"CSE");
	student s2 = new student("sanket",20,"Aids");

	System.out.println(s1.id);
	

	}

}