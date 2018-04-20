class ExceptionDemo{
	public static void main(String[] args) {
		try{
			System.out.println("outer try");
			//System.out.println(10/0);
			try{
				System.out.println("innertry");
				System.out.println(10/0);
				
				
			}catch (NullPointerException e) {
				System.out.println("inner catch");
			
			}
		
				System.out.println("after ineer try and catch");
			
			}catch(ArithmeticException e) {
			System.out.println("outer catch");
		}
System.out.println("end of trycatch block");

	}
}



		
		
