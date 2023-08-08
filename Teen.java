
public class Teen extends Person implements Mover{
    
	
	@Override
	public double metabolizeAccumulatedCalories() {
		// TODO Auto-generated method stub
		double weightGained = getCaloriesAccumulator() / 5000.0;
        setWeight(getWeight() + weightGained);
        
        setCaloriesAccumulator(0);
        
        return weightGained;
	}

	@Override
	public String move() {
		// TODO Auto-generated method stub
		return "run fast and jump";
	}

	@Override
	public String move(int count) {
		// TODO Auto-generated method stub
		String t = "";
		
		for(int i = 0; i < count - 1; i++) {
			t += "run fast and jump\n";
		}
		
		t += "run fast and jump";
		
		return t;
	}



}
