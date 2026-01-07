public class Try{
	private String name;
	
	// Getter
	public String getname(){
		return name;
	}
	
	//Setter
	public void  setname(String name){
		this.name=name;
	}
}
public class Encapsulations{	
	public static void main(String [] args){
		Try obj1=new Try();
		obj1.setname("Chanuka");
		System.out.println(obj1.getname());
	}
}
		
/*--------Encapsulations------------
1.Wrapping data and method into a single unit
2.protect data(data hiding)
*/