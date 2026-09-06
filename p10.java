class codex{
	static int a=10;

	static void fun(){
		System.out.println("in static block");

	}

	void gun(){
		System.out.println("Non Static block");

	}

}
class demo{
	public static void main(String[]args){
		codex obj = new codex();
		System.out.println(codex.a);

		codex.fun();
		System.out.println("---------------------");

		obj.gun();

	}


}