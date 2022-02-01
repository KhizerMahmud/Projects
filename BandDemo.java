import java.util.Scanner;
public class BandDemo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		Band myFavoriteBand = new Band();
		int option;
		do {
			System.out.println("Press 0 to change the name of your favorite band");
			System.out.println("Press 1 to add the first musician to the band");
			System.out.println("Press 2 to add the second musician to the band");
			System.out.println("Press 3 to add the third musician to the band");
			System.out.println("Press 4 to view all information about the band");
			System.out.println("Press 5 to end the program!");
			
			option = keyboard.nextInt();
			keyboard.nextLine();//go to next line
			
			if (option == 0) {
				System.out.println("What is the name of your favorite band?");
				String newName = keyboard.nextLine();
				myFavoriteBand.setName(newName);
			}	
			else if (option == 1) {	
				System.out.println("What is the name of the first Musician?");
				String newName = keyboard.nextLine();
				
				System.out.println("What instruments does the first Musician play?");
				String newInstruments = keyboard.nextLine();
				
				Musician firstMusician = new Musician(newName, newInstruments);
				myFavoriteBand.setMusician1(firstMusician);
			}	
			else if (option == 2) {	
				System.out.println("What is the name of second Musician?");
				String newName = keyboard.nextLine();
				
				System.out.println("What instrumets does the second Musician play?");
				String newInstruments = keyboard.nextLine();
				
				Musician secondMusician = new Musician (newName, newInstruments);
				myFavoriteBand.setMusician2(secondMusician);
			}	
			else if (option == 3) {	
				System.out.println("What is the name of the third Musician?");
				String newName = keyboard.nextLine();
				
				System.out.println("What instruments does the third Musician play?");
				String newInstruments = keyboard.nextLine();
				
				Musician thirdMusician = new Musician (newName, newInstruments);
				myFavoriteBand.setMusician3(thirdMusician);
			}	
			else if (option == 4) {	
				System.out.println("My favorite Band's Name:" + myFavoriteBand.getName());
				
				Musician m1 = myFavoriteBand.getMusician1();
				if (m1!=null) {
					System.out.println("First Musician's Name:" + m1.getName());
					System.out.println("First Musician's Instruments:" + m1.getInstruments());
				}
				Musician m2 = myFavoriteBand.getMusician2();
				if (m2!=null) {
					System.out.println("Second Musician's Name:"+ m2.getName());
					System.out.println("Second Musician's Instruments" + m2.getInstruments());
				}
				Musician m3 = myFavoriteBand.getMusician3();
				if (m3!=null) {
					System.out.println("Third Musician's Name:" + m3.getName());
					System.out.println("Third Musician's Instruments:" + m3.getInstruments());
				}
				}	
			else if (option == 5) {	
				System.out.println("Thank you for using our Program!");
			}	
			else {	
				System.out.println("Error! Invalid Option! Try again!");
			}
		}while (option !=5);
		
	}

}
