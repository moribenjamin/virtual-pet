Wow...I must say that this project was very challenging
I did just what the assignment said.  I took it in little chunks
I started out by doing the setup exercises first
Then I proceeded with the project

//The console 

For the instance variable i used hunger, thirst, waste and boredom

For the constructor, I created an initialized constructor to match the class of VirtualPet
	with the this. keyword to refer the current instance of the method on which it is used.
	
For the methods of behavior, i created public methods to provide the client access to the 
	values for hunger, thirst, waste, and boredom
	
	In addition, I initialized a tick method that updated the energy levels of the pet (his name is Spott)
	so as choice is not 0 or less and 6 or greater the energy levels will tick from the initial levels and each time the loop is passed

//The Application

After creating the class, main method, and the Scanner object, I created a spottsLevels Object that invoked the VirtualPet constructor from the console and its parameter
	with the initial values for the parameters of hunger, thirst, waste, and boredom

To create the image for Spott, I went to http://www.glassgiant.com/ascii which generated the picture in ASCII code
	I attached parenthesis, quotations, plus signs and escape sequences in the appropriate places and pasted into the application
	
I used some print statements to introduce my pet an initialized the menu choice variables as strings

I started a do loop for the game loop to include print statements for menu options

I used the input method from the Scanner class to accept input form the user about their selection numbers

I then initialized and declared amount variable as an integer with an initial value of 0 that would represent the amount to increase or decrease the variables in the tick method

Within the do loop i created if else statements specify the amounts for the tick methods and the output for the various menu choices

	Because my choices variables  were initialized as strings I parsed them to initialize them as amount variables to become integers
	I assigned the amount variables to invoke tick methods based on the choice selections
	I used print statement to communicate what happened based upon the menu choice
	Finally, I used print statements to show the values of the energy levels based upon their choice
	
	If the user chose five, I used a print statement and break statement to end the program 
	If the user chose any number other than that offered print statements and break statements were used to end the program
	
The while loop held the condition for the  loop

Input was closed

References
GlassGiant.com - http://www.glassgiant.com/ascii
Stackoverflow - https://stackoverflow.com/questions/3728062/what-is-the-meaning-of-this-in-java
Carrano, F.M. and Henry, T. M - Data Structures and Abstractions with Java, Appendix C	
 	