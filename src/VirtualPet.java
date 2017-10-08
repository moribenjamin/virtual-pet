
public class VirtualPet {

	        //Instance Data
			private int hunger;
			private int thirst;
			private int waste;
			private int boredom;
			
			

			//Constructor
			public VirtualPet(int hunger, int thirst, int waste, int boredom) {
				this.hunger=hunger;
				this.thirst=thirst;
				this.waste=waste;
				this.boredom=boredom;
			}
			
			//Method of Behavior

			public int getHunger() {
				return hunger;
			}


			public int getThirst() {
				return thirst;
			}


			public int getWaste() {
				return waste;
			}
			public int getBoredom() {
				return boredom;

			}

			public void tick(int amount) {
				hunger += amount;
				thirst -= amount;
				waste /= amount;
				boredom *= amount;
			}
					
			
			public String energyLevels() {
				return "Spotts Energy Levels are now: \n\n"
						+ "Hunger: "  + hunger  + "\nThirst: " + thirst + "\nWaste: " 
						+ waste + "\nBoredom: " + boredom + "\n";
			
			}
					


			
			
	}
