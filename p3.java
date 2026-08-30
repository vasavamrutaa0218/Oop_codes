class codex{
	 int a;
	
	codex(int a){
		this.a=a;
	}
	void display(){
		System.out.println(a);
	}

}
class demo{
	public static void main(String[]args){
		codex obj = new codex(10);
		obj.display();

		codex obj1 = new codex(20);
		obj.display();

		System.out.println("----after modify the object------");
		obj.a=50;
		obj.display();

	}

}