// super is used to invoke parent class method
class Color{
	void color(){
		System.out.println("My favourite color is Blue");
	}
}
   class Green extends Color{
   	  void color(){
   	  	System.out.println("Hey how are you");
   	  	super.color(); // super invoke the parent class method
   	  }
   } 

   class Test{
   	public static void main(String[] args) {
   		Green g=new Green();
   		      g.color();
   	}
   }