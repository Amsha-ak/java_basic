import java.util.Scanner;
class ArraySum{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int [] x = new int [5];
		int sum = 0;
		
		System.out.println("Enter 5 numbers");
		
		for(int i=0; i<5; i++){
			x[i]=sc.nextInt();
			sum = sum+x[i];
		}
		System.out.println("Sum of array elements: "+sum);
	}
}