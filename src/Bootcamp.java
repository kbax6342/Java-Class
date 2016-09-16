import java.util.Scanner;


public class Bootcamp {

	public static void main(String[] args) {
		
		//Create  a Scanner
		Scanner input = new Scanner(System.in);
		
		//Declare Variables
		String[] [] classArray = new String [15] [3];
		int userInput = 0;
		boolean answer = true;
		boolean cont = true;
		int optionAnswer;
		String contQuestion;
		
		
		
		
		//Create Welcome to the user
		System.out.println("Welcome to our Java Class");
		while(cont){	
		//Prompt the user to input a number for a Student
		System.out.println("Which student would you like to learn more about (enter a number 1-14):");
		
		//try the code to see if it works
		try{
			//Getting user input
			userInput = input.nextInt();
			//Print out the number of student and the name
			System.out.println("Student " +userInput + " is " + Methods.studentArray(userInput));
			
		//Catching the error if there is one	
		}catch(ArrayIndexOutOfBoundsException e){
			
		//While loop to continue to ask for the number until the user puts in a number 1-14	
		while(answer){
			System.out.println("That student does not exist. Please enter a number between 1-14:  ");
			userInput = input.nextInt();
			
			if(userInput <  1){
				answer = true;
			}else{
				answer = false;
			}
		}
		}
		//Prompting the user to ask for the student home-town or favorite food
		System.out.println("What would you like to know about" + Methods.studentArray(userInput) + "?" + 
					"(enter 'hometown' or 'favorite food':" );
		 input.nextLine();
		 
		//Storing the input  from the user
		String userInputFoodOrTown = input.nextLine();
		
		//Giving an if/else state if the user is looking for favorite food or home-town
		if(userInputFoodOrTown.equalsIgnoreCase("favorite food")){
			//assigning a variable to the number in the array
			 optionAnswer = 0;
			 //print out student name and option answer and prompt to continue
			System.out.println(Methods.studentArray(userInput) + " is from "  +  Methods.foodAndHometownArray(optionAnswer, userInput) + ". \n "
					+ "Would you like to know more? (enter 'yes' or 'no'): " );
					//assigning input to the continue variable
					contQuestion = input.nextLine();
					
		//Giving an if/else state if the user is looking for favorite food or home-town		
		}else if(userInputFoodOrTown.equalsIgnoreCase("hometown")){
			
			optionAnswer = 1;
			System.out.println(Methods.studentArray(userInput) + " is " + Methods.foodAndHometownArray(optionAnswer, userInput) + ". \n"
					+ "Would you like to know more? (enter 'yes' or 'no'): ");
					contQuestion = input.nextLine();
		}else{
			System.out.println("That data does not exist. Please try again.");
			System.out.println("What would you like to know about" + Methods.studentArray(userInput) + "?" + 
					"(enter 'hometown' or 'favorite food':" );
			contQuestion = input.nextLine();
			
		}
		
		if(contQuestion.equals("yes")){
			cont = true;
		}else if(contQuestion.equals("no")){
			cont = false;
			System.out.println("Thank you for searching the students!");
		}
		
		
		}
		
		
		
	
			

	}

	}

