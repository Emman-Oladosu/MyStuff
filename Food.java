
import java.util.*;

public class Food {

	private String name;
	private int calories;
	
	public Food(String name, int calories) {
		this.name = name;
		if(calories >= 0) {
			this.calories = calories;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		if(calories >= 0) {
			this.calories = calories;
		}
	}

	@Override
	public String toString() {
		return String.format("Food - name: %10s | calories: %4d",name, calories);
	}

	public boolean equals(Object o){
		if(o==null){return false;}
		if(this == o){return true;}
		if(o instanceof Food){
			Food otherF = (Food)o;
			   if(this.name.equalsIgnoreCase(otherF.name)){
				   if(this.calories == otherF.calories) {
					   return true;
				   }
			   }
		}
		
		return false;
	}
	
	
	
}
