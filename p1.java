class codex{
	int a;
	codex(int a){
		this.a=a;
	}
	void display(){
		System.out.print(a);
	}

}
class demo{
	public static void main(String[]args){
		codex obj=new codex(10);
		obj.display();

	}

}

