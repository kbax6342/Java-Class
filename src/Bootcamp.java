import java.util.Scanner;


public class Bootcamp {

	public static void main(String[] args) {
		//Create  a Scanner
		Scanner input = new Scanner(System.in);
		
		//Declare Variables
		String[] [] classArray = new String [15] [3];
		int userInput;
		boolean answer = true;
		int foodAnswer;
		
		
		//Create Welcome to the user
		System.out.println("Welcome to our Java Class");
		
		//Create a String Array
		
		
		
		System.out.println("Which student would you like to learn more about (enter a number 1-14):");
		userInput = input.nextInt();
		
		//Assign value to the String Array
		classArray[0] [0] = "Please enter a number above 0";
		classArray[0] [1] = "Armani";	
		classArray[0] [2] = "Yazmin";
		classArray[0] [3] = "Tyler";
		classArray[0] [4] = "Nicole";
		classArray[0] [5] = "Daniel";
		classArray[0] [6] = "David";
		classArray[0] [7] = "Dominique E.";
		classArray[0] [8] = "Elle";
		classArray[0] [9] = "Clark";
		classArray[0] [10] = "Kevin";
		classArray[0] [11] = "Jennifer";
		classArray[0] [12] = "Zalika";
		classArray[0] [13] = "Johhny";
		classArray[0] [14] = "Dominique B.";
		
		classArray[1] [0] = "Please enter a number above 0";
		classArray[1] [1] = "Salmon";
		classArray[1] [2] = "Pizza";
		classArray[1] [3] = "Tacos";
		classArray[1] [4] = "Mexican";
		classArray[1] [5] = "Chinese";
		classArray[1] [6] = "Steak";
		classArray[1] [7] = "Shrimp";
		classArray[1] [8] = "Salmon";
		classArray[1] [9] = "Pizza";
		classArray[1] [10] = "Tacos";
		classArray[1] [11] = "Italian";
		classArray[1] [12] = "Pasta";
		classArray[1] [13] = "Thai";
		classArray[1] [14] = "Pizza";
		
		classArray[2] [0] = "Please ener a number above 0";
		classArray[2] [1] = "Detroit";
		classArray[2] [2] = "Detroit";
		classArray[2] [3] = "Monroe";
		classArray[2] [4] = "Detroit";
		classArray[2] [5] = "Hamtramck";
		classArray[2] [6] = "Detroit";
		classArray[2] [7] = "Detroit";
		classArray[2] [8] = "Detroit";
		classArray[2] [9] = "Detroit";
		classArray[2] [10] = "Detroit";
		classArray[2] [11] = "Detroit";
		classArray[2] [12] = "Detroit";
		classArray[2] [13] = "Detroit";
		classArray[2] [14] = "Detroit";
		
		

//		classArray[info][personPicked];
		//We are going to out put the selection if correct and catch the error for the wrong input
		try{
			System.out.println("Student " +userInput + " is " + classArray[userInput]);
		
		}catch(ArrayIndexOutOfBoundsException e){
			
		while(answer){
			System.out.println("That student does not exist. Please enter a number between 1-14:  ");
			
			userInput = input.nextInt();
			
			if(userInput <  1){
				answer = true;
			}else{
				answer = false;
			}
			// What would you like to know about number of classmate ? enter hometown or favortie food
			System.out.println("What would you like to know about" + classArray[userInput] + "?" + 
			"(enter 'hometown' or 'favorite food':" );
			String food = input.nextLine();
			
			
			
			if(food.equalsIgnoreCase("food")){
				 foodAnswer = 1;
				System.out.println(classArray [userInput] + " is from "  +  classArray[foodAnswer][userInput] + ". \n "
						+ "Would you like to know more? (enter 'yes' or 'no'): " );
			}else if(food.equalsIgnoreCase("hometown")){
				foodAnswer = 2;
				System.out.println(classArray [userInput] + "is from " + classArray[foodAnswer][userInput] + ". \n"
						+ "Would you like to know more? (enter 'yes' or 'no'): ");
			}
			
			
		}
			
		}
		
		
		
		
		
	}
			

	}


