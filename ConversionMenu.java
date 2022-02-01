/*Khizer Mahmud
  Prof. Kamal Kamal
  CSC 200
  Assignment 3*/
import java.util.Scanner; /*allows for the input of characters*/

public class ConversionMenu {

public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);/*allows for the imported java scanner above to work*/

int menuChoice; /*gives the user the option of choosing from a range of numbers*/
String order; /*the order of the user input does not matter. Allows the user to input any number from the given range*/

do {//beginning of the do-while loop. Creates a loop of the code below

System.out.println("Conversion Menu");//displays the phrase
System.out.println("1.Centimeters to Inches"); //displays the phrase
System.out.println("2.Meters to Feet");//displays the phrase
System.out.println("3.Kilograms to Pounds");//displays the phrase
System.out.println("4.Ounces to Grams");//displays the phrase
System.out.println("5.Kilometers to Miles");//displays the phrase
System.out.println("9.Exit");//displays the phrase
System.out.println("Select an Option");//displays the phrase

menuChoice = scan.nextInt();//allows for the input of the desired option listed above

switch (menuChoice) {
	case 1:
		System.out.println("Enter a value in centimeters");	//displays the phrase to user
		int input = scan.nextInt(); //allows the user to input a value for centimeters
		System.out.println(input+ " centimeters = "+ input/2.54 + " inches");//equation convert cm to in
		break;
	case 2:
		System.out.println("Enter a value in meters");//displays the phrase to the user
		int input1 = scan.nextInt(); //allows the user to input a value for meters
		System.out.println(input1 + " meters = "+ input1*3.281 + " feet");//equation to convert m to ft
		break;
	case 3:	
		System.out.println("Enter a value in kilograms");//displays the phrase to the user
		int input2 = scan.nextInt();//allows the user to input a value for centimeters
		System.out.println(input2 + " kilograms = "+ input2*2.205 + " pounds"); //equation to convert kg to lbs
		break;
	case 4:	
		System.out.println("Enter a value in ounces");//displays the phrase to the user
		int input3 = scan.nextInt();//allows the user to input a value to ounces
		System.out.println(input3 + " ounces = " + input3*28.35+ " grams");//equation to convert ounces to grams
		break;
	case 5:	
		System.out.println("Enter a value in kilometers");//displays the phrase to the user                   
		int input4 = scan.nextInt();//allows the user to input a value for centimeters                        
		System.out.println(input4 + " kilometers = "+ input4/1.609 + " miles"); //equation to convert km to m 
		break;		
}
} while(menuChoice!=9);//end of do-while loop
  System.out.println("Terminate Menu");//stops menu 
}}
