//Create main class
public class Methods{
	
 	//create method without parameters
	public void Full(){
		System.out.println("The car is red");
	}
	
	//create method with parameters
	public void Speed(int maxspeed){
		System.out.println("Car Speed is :"+maxspeed);
	}
	
		public static void main(String [] args){
			Methods obj1=new Methods();
			obj1.Full();
			obj1.Speed(100);
		}
}


/* --------Methods----------------
1.perform operations
2.Any valid name
3.Return type required
4.Called by programmer
5.can be static
6.can be inherited
7.overloading and overiding
*/
		