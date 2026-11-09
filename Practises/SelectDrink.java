import java.util.Scanner;
class SelectDrink{
	public static void main(String args[]){
		System.out.println("1. Tea, 2. Coffee, 3. Juice, Enter your choice");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		switch(choice){
			case 1:
			System.out.println("You have selected Tea");
			break;
			
			case 2:
			System.out.println("You have selected Coffee");
			break;
			
			case 3:
			System.out.println("You have selected Juice");
			break;
			
			default:
			System.out.println("Invalid input");
			break;
		}
	}
}