package chocolate;

public class ChocolateBoiler {
	
	//----------------DOUBLE CHECKED LOCKING SOLUTION---------------------
	//private volatile static ChocolateBoiler uniqueBoiler;
	private static ChocolateBoiler uniqueBoiler = new ChocolateBoiler();
	private boolean empty;
	private boolean boiled;
	
	private ChocolateBoiler(){//PRIVATE constructor doesn't allow to instantiate the class externally
		empty = true;
		boiled = false;
	}
	
	public static ChocolateBoiler getInstance(){
		return uniqueBoiler;
	}
	
	/*----------------DOUBLE CHECKED LOCKING SOLUTION---------------------
	
	public static ChocolateBoiler getInstance(){   //generates a unique instance of the class
		if(uniqueBoiler == null){                  //if there is no instance of the class, proceed
			synchronized(ChocolateBoiler.class){
				if(uniqueBoiler == null){
					uniqueBoiler = new ChocolateBoiler();
				}
			}
		}
		return uniqueBoiler;
	}
	*/
	public void fill(){
		if(empty){
			empty = false;
			boiled = false;
		}
	}
	
	public void drain(){
		if(!empty && boiled){
			empty = true;
			boiled = false;
		}
	}
	
	public void boil(){
		if(!empty && !boiled){
			boiled = true;
		}
	}
}
