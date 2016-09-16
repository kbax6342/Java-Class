
public class Methods {
	
	
	
	public static String studentArray(int userInput){
		
		String [] studentArray = new String [15];
		
		studentArray [0] = "Please enter a number above 0";
		studentArray [1] = "Armani";	
		studentArray [2] = "Yazmin";
		studentArray [3] = "Tyler";
		studentArray [4] = "Nicole";
		studentArray [5] = "Daniel";
		studentArray [6] = "David";
		studentArray [7] = "Dominique E.";
		studentArray [8] = "Elle";
		studentArray [9] = "Clark";
		studentArray [10] = "Kevin";
		studentArray [11] = "Jennifer";
		studentArray [12] = "Zalika";
		studentArray [13] = "Johhny";
		studentArray [14] = "Dominique B.";
		
		String studentName = studentArray[userInput];
		return studentName;
	}
	
	
	public static String foodAndHometownArray(int optionAnswer ,int userInput){
		
		String [] [] classArray = new  String [2] [15];
		
		classArray[0] [0] = "Please enter a number above 0";
		classArray[0] [1] = "Salmon";
		classArray[0] [2] = "Pizza";
		classArray[0] [3] = "Tacos";
		classArray[0] [4] = "Mexican";
		classArray[0] [5] = "Chinese";
		classArray[0] [6] = "Steak";
		classArray[0] [7] = "Shrimp";
		classArray[0] [8] = "Salmon";
		classArray[0] [9] = "Pizza";
		classArray[0] [10] = "Tacos";
		classArray[0] [11] = "Italian";
		classArray[0] [12] = "Pasta";
		classArray[0] [13] = "Thai";
		classArray[0] [14] = "Pizza";
		
		classArray[1] [0] = "Please ener a number above 0";
		classArray[1] [1] = "Detroit";
		classArray[1] [2] = "Detroit";
		classArray[1] [3] = "Monroe";
		classArray[1] [4] = "Detroit";
		classArray[1] [5] = "Hamtramck";
		classArray[1] [6] = "Detroit";
		classArray[1] [7] = "Detroit";
		classArray[1] [8] = "Detroit";
		classArray[1] [9] = "Detroit";
		classArray[1] [10] = "Detroit";
		classArray[1] [11] = "Detroit";
		classArray[1] [12] = "Detroit";
		classArray[1] [13] = "Detroit";
		classArray[1] [14] = "Detroit";
		
		String studentOption = classArray[optionAnswer][userInput];
		return studentOption;
		
	}

}
