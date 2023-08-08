
public class Elder extends Person implements Mover{

	
	@Override
	public String move() {
		// TODO Auto-generated method stub
		return "ouch my back wait for me";
	}

	@Override
	public String move(int count) {
		// TODO Auto-generated method stub
		String t = "";
		
		for(int i = 0; i < count - 1; i++) {
			t += "ouch my back wait for me\n";
		}
		
         t += "ouch my back wait for me";
		
		return t;
	}
		

	@Override
	public double metabolizeAccumulatedCalories() {
		double weightGained = getCaloriesAccumulator() / 300.0;
        setWeight(getWeight() + weightGained);
        
        setCaloriesAccumulator(0);
        
        return weightGained;
	}

}
