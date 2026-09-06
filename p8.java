class codex{
	static void fun(){
		System.out.println("in static block");

	}

}
class demo{
	public static void main(String[]args){
		codex obj = new codex();
		codex.fun();


	}

}