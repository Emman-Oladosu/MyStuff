
public class Infant extends Person{

	private InfantToy[] toys;
	private int numInfantToys;
	
	public Infant() {
		super();
		numInfantToys = 0;
		toys = new InfantToy[10];
	}
	
	public Infant(String name, int birthYear, double weight, double height, char gender, int numCarryOn) {
		super(name, birthYear, weight, height, gender, numCarryOn, 0); //0 is for numOffSpring from Person class
		numInfantToys = 0;
		toys = new InfantToy[10];
	}
	
	public void addInfantToy(String infantToyName, int infantToyRating) {
		if(numInfantToys < 10) {
			toys[numInfantToys++] = new InfantToy(infantToyName, infantToyRating);
		}	
	}
	
	public String getInfantToyAsString(int index) {
		if(index < 0 && index > numInfantToys) {
			return  "invalid index "+index;
		}
		
		return toys[index].toString();
		
	}
	
	 public int getNumInfantToys() {
	        return numInfantToys;
	    }
	
	public String getInfantToyName(int index) {
		if(index < 0 && index > numInfantToys) {
			return  "invalid index "+index;
		}
		
		return toys[index].infantToyName;
		
	}
	
	public int getInfantToyRating(int index) {
		if(index < 0 && index > numInfantToys) {
			return  0;
		}
		
		return toys[index].infantToyRating;
		
	}
	
	public int getHighestInfantToyRating() {
        int highestRating = 0;
        for (int i = 0; i < numInfantToys; i++) {
            if (toys[i].infantToyRating > highestRating) {
                highestRating = toys[i].infantToyRating;
            }
        }
        return highestRating;
    }
	
	 @Override
	    public void printDetails() {
	        super.printDetails();
	        System.out.printf("Infant: Number of Toys: %4d | Infant Toys:\n", numInfantToys);
	        for (int i = 0; i < numInfantToys; i++) {
	            System.out.println(toys[i].toString());
	        }
	    }
	 
	 
	
	private class InfantToy{
		
		private String infantToyName;
		private int infantToyRating;
		
		public InfantToy(String infantToyName, int infantToyRating) {
			this.infantToyName = infantToyName;
			this.infantToyRating= infantToyRating; 
			
		}
		
		 @Override
	        public String toString() {
	            return String.format("InfantToy: Toy Name: %20s | Rating: %4d", infantToyName, infantToyRating);
	        }
		 
	}



	@Override
	public double metabolizeAccumulatedCalories() {
		// TODO Auto-generated method stub
		return 0;
	}


}
