public class Constructors{
	int x;//class Attribute
	
	//create constructors
	public Constructors(){
		x=5;
	}
	
	public static void main (String [] args){
		Constructors obj1= new Constructors();
		System.out.println(obj1.x);
	}
}

/*--------Constructurs----------
1.Initialize object
2.Same as class name
3.No return Type
4.Called by jvm
*/