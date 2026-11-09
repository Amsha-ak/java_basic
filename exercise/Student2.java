class Student2{
	int id;
	String name;
	int m1;
	int m2;
	int m3;
	
	void setStudent2(int id, String name, int m1, int m2, int m3){
		this.id = id;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	
	int calTotal(){
		int total = 0;
		total = this.m1+this.m2+this.m3;
		return total;
	}
	
	double calAverage(int total){
		double average =0.0;
		average =total/3.0;
		return average;
	}
	
	char getResult(double avg){
		char grade;
		if((avg>=75) && (avg<=100)){
			grade='A';
		}
		else if((avg>=65) && (avg<=74)){
			grade='B';
		}
		else if((avg>=55) && (avg<=64)){
			grade='C';
		}
		else if((avg>=45) && (avg<=54)){
			grade='S';
		}
		else if((avg>=0) && (avg<=44)){
			grade='F';
		}
		else{
			grade='?';
		}
		
		return grade;
		
	}
	
	void display(){
		System.out.println("ID: "+this.id);
		System.out.println("Name: "+this.name);
		System.out.println("Marks1: "+this.m1);
		System.out.println("Marks2: "+this.m2);
		System.out.println("Marks3: "+this.m3);
		int total = this.calTotal();
		System.out.println("Total: "+total);
		double avg = this.calAverage(total);
		System.out.println("Average: "+avg);
		char result =this.getResult(avg);
		System.out.println("Grade: "+result);
		
	}
}