
public abstract class Person extends Passenger {
	private int numOffspring;
	
	public Person() {
		super();
		numOffspring = 0;
		}

	public Person(int numOffspring) {
        super();
        setNumOffspring(numOffspring);
    }

    public Person(String name, int birthYear, double weight, double height, char gender, int numCarryOn, int numOffspring) {
        super(name, birthYear, weight, height, gender, numCarryOn, 0, 0);
        setNumOffspring(numOffspring);
    }

		public int getNumOffspring() {
		    return numOffspring;
		}

		public void setNumOffspring(int numOffspring) {
			if(numOffspring < 0) {
				numOffspring = 0;
			}
			else {
		        this.numOffspring = numOffspring;
			}			
		}
		
		

		@Override
		public void printDetails()
		{
		   super.printDetails();
		   System.out.printf("Person: Number of offspring: %4d\n ");
		}

		@Override
		public String toString() {
			return super.toString() + String.format("Person: Number of Offspring: %4d\n", numOffspring);
		}
		
		@Override		
		 public boolean equals(Object o){
				if(o==null){return false;}
				if(this == o){return true;}
				if (super.equals(o)) {
				if(o instanceof Person){
					Person otherC = (Person)o;
					if(numOffspring == otherC.numOffspring){
									return true;
						}
					}
				}
				return false;
			}
	
		
		
		
		
		
	}

