import java.util.Scanner;

public class VirtualPetApp {

	

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		VirtualPet spottsLevels = new VirtualPet(55, 40, 25, 10);

		
		
		System.out.println("~~~~~~~~~~~~~~~~~~==============================================================\n" +
				"~~~~~~~~~~~~~~~~~===============================================================\n" +
				"~~~~~~~~~~~~~~~~~~~===++========I?==============================================\n" +
				"~~~~~~~~=~~=~=I77OMMMMMMMM+===~NDMM~============================================\n" +
				"~~~~~~~~~=ZMMMN77?$~. ~++DMMMD+===$7============================================\n" +
				"~~~~~~NMMM+.................,DMMM+~=============================================\n" +
				"~~~~=MN:....  .. . ...   .  .. +MMMI============================================\n" +
				"~~~DM8 .                     .  .:$MM$~=========================================\n" +
				"~ZMM,                           ....IMMMI=======================================\n" +
				"7M,....                        ....... NMMM7+===================================\n" +
				"M? .                        ~Z$=..    .  =DMMMMMMMMMMM8$7?======================\n" +
				"I.                      . .?M+,M8....   . .....,.......,I+IMMMDI================\n" +
				"   ..                     ?M~...,M...     ....................~7MNI~============\n" +
				"                         .M$    .7$ .  =NMZ.                   .,=MMZ===========\n" +
				"                        .$M..    .,.   M7..Z.                   ....NM8=========\n" +
				"                         DM7M$ .     . M8=.                       ....DM7=======\n" +
				"                         8MMMM.       +MMM,                     .......IM8======\n" +
				"                        .8MMMM.       NMMM,.                         ...$MZ=====\n" +
				"                        .7MMMM.      .=MMD.                             .ZMN====\n" +
				"                        ..,+=  .      ...                            . ....M8===\n" +
				"                                                     ...   ..             .NM?==\n" +
				"                                                     ~DMMMMMN,..          ..MM+=\n" +
				"~.                                                ..~MM$MMMMMMD.          ..$M+=\n" +
				"M...   .                                          ..~MMMMMMMMMM           ..~M+=\n" +
				"MD..                                                 +MMMMMMMM7           ...DI=\n" +
				"MMZ.ZN:                                                  . ,, .           ..:M?=\n" +
				"MMM  ,M:.                                            .  .  ... .          ..ID==\n" +
				"MMMD,..NZ                ..                                                .M7==\n" +
				"MMMMMMZ.M?.             . NM:                             ...           ...7M7==\n" +
				"MMMMMMM7.O$             .IMN                               I              +MZ===\n" +
				"MMMMMMMN ?M..            DON.                            . M:. .     ....?MM====\n" +
				"MMMMMMMM,:M:            .M,:Z. .                          +MO...     ..+MMZ~====\n" +
				"MMMMMMMM=.7N            :M,.D~.                          .NNZ    . ,OMMM7~======\n" +
				"MMMMMMMM$.NN             8NOMM .                     . ..7MZZ ...~MMMO==========\n" +
				"MMMMMMMMM?~M=           .+M. ZM+.                    ...NDIN7NMMMD?==~==========\n" +
				"MMMMMMMMM7.M8  .          ZM8.7MNI+      ....  ......,DMMMMMN7+~=~~~=~~=========\n" +
				"MMMMMMMMM~.MD.          ..  NMMI.  8I,:. .. .~7~~Z8MMMMD+~~~=~~~~~~~~~~~========\n" +
				"MMMMMMMMM, MZ                +MMI. .M8O8MMMMNMMMMMMM+=~~~~~~~~~~~~~~~===========\n" +
				"MMMMMMMMM~.MD...           ..  .DMMMZ,..,87:?NMMM$~~~~~~~~~~~~~~~~~~~~~===~=====\n" +
				",8MMMMM,  OMMMND7+. . .. . .    ...:?~7O$?,.,MMZ~~~~~~~~~~~~~~~~~~~~~~~~~=~~~===\n" +
				"~.,..I. .ZMM=~==IDMMMMMMMMM+...... ..     ..,M8~~~~~~~~~~~~~~~~~~~~~~~~~~~======\n" +
				"MMMDDMMMMMN~~~~~~~~~~~~~~~?MMMD..   .     ..OI~~~~~~~~~~~~~~~~~~~~~~~~~~~~~=====\n" +
				":~?$DD888O+~~~~~~~~~~~~~~~~~~~~8MZ:  .     ..M$~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~=\n" +
				"::::::::::~~~:~~~~~~~~~~~~~~~~~~7MM:.     ..~MIZ?~~~~~~~~~~~~~~~~~~~~~~~~~~~~~==\n" +
				"::::::::::::~~~~~~~~~~~~~~~~~~~~~=MM. . ..7MMMMM~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
				":::::::::::::~~~~~~~~~~~~~~~~~~~~~7MDOMMMMMMI.,MMO~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
				":::::::::::::::~~~~~~~~~~~~~~~~~~8MMMMNI~.. . ..~MM+~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
				"::::::::::::::::~~~~:~~~~~~~~~~~~I$MZ..         ..DM$~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
				"::::::::::~:::::::~~~~~~~~~~~~~~~~~M~          ....+MM=~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
				"::::::::::::::::::::~~~~~~~~~~~~~~OM.             ...DMI~~~~~~~~~~~~~~~~~~~~~~~~\n" +
				":::::::::::::~::::::~~:~~~~~~~~~~+MN.             ...,MM7~~~~~~~~~~~~~~~~~~~~~~~\n");
				                                                                
		
		
		
		System.out.println("Here's my pet Spott and his energy levels are:\n" + "Hunger: " + spottsLevels.getHunger() + "\n" 
				+ "Thirst: " + spottsLevels.getThirst() + "\n" + "Waste: " + spottsLevels.getWaste() + "\n" + "Boredom: " 
				+ spottsLevels.getBoredom());
		System.out.println("");
		System.out.println("What would you like to do?");

		String choice;
		
		do {

			System.out.println("Press 1 to feed Spott");
			System.out.println("Press 2 to water Spott");
			System.out.println("Press 3 to let Spott out into the yard");
			System.out.println("Press 4 to pet Spott");
			System.out.println("Press 5 if you're not into pets");

			
			choice = input.nextLine();
			int amount = 0;
			
			if (choice.equals("1")) {
				amount = Integer.parseInt("1");
				spottsLevels.tick(amount);
				System.out.println("You fed Spott.\n");
				System.out.println(spottsLevels.energyLevels());
				
			} else if (choice.equals("2")) {
				amount = Integer.parseInt("2");
				spottsLevels.tick(amount);
				System.out.println("You watered Spott.\n");
				System.out.println(spottsLevels.energyLevels());
				
			} else if (choice.equals("3")) {
				amount = Integer.parseInt("3");
				spottsLevels.tick(amount);
				System.out.println("You let Spott out into the yard.\n");
				System.out.println(spottsLevels.energyLevels());
				
			} else if (choice.equals("4")) {
				amount = Integer.parseInt("4");
				spottsLevels.tick(amount);
				System.out.println("You petted Spott.\n");
				System.out.println(spottsLevels.energyLevels());
				
			} else if (choice.equals("5")) {
				System.out.println("Then walk away....very slowly or he'll bite!");
				break;		
				
			} else {
				System.out.println("Really?!");
				System.out.println("Ok. We're done.");
				break;
				
			}
		} while (!choice.contentEquals("5")); {
			
		}
		input.close();


	}
}


		
	