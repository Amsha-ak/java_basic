class ElseIfMarks{
	public static void main(String args[]){
		int marks = 74;
		if((marks>=75) && (marks<=100)){
			System.out.println("Grade: A");
		}
		else if(marks>=65){
			System.out.println("Grade: B");
		}
		else if(marks>=55){
			System.out.println("Grade: C");
		}
		else if(marks>=45){
			System.out.println("Grade: S");
		}
		else if(marks>=0){
			System.out.println("Grade: F");
		}
		else{
			System.out.println("Invalid input. Please enter a valid marks between 0 to 100");
		}
	}
}