class codex{
	private int age;
	private String name;

	codex(int age,String name){
		this.age = age;
		this.name =name;

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
	codex obj = new codex(10,"A");
	System.out.println("Age :"+obj.getAge());
	System.out.println("Name :"+obj.getName());
	


	}

}