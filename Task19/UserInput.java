import java.util.Scanner;
class UserInput{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String name= "" ;
		System.out.println("Please enter your name : " + name);
		name = scan.next();
		System.out.println("*******");

		int marks = 0;
		System.out.print("Please enter your marks :");
		marks = scan.nextInt();
		System.out.println("Your marks is " + marks);
	}

}