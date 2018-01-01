package chocolate;

public class ChocolateBoiler {
	
	private boolean empty;
	private boolean boiled;
	
	public ChocolateBoiler(){
		empty = true;
		boiled = false;
	}
	
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
