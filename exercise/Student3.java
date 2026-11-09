class Student3{
	int id;
	String name;
	int marks[];
	
	Student(int id, String name){
	this.id=id;
	this.name=name;
	}
	
	void setmarks( int marks[]){
		this.marks = marks;
	}
	
	int calTotal(){
		int total = 0;
		for(int i=0; i<marks.length; i++){
			total = total +marks[i];
		}
		return total;
	}
	
	double calAverage(int total){
		double avg =total/(marks.length +1);
		return avg;
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
	
	String[] subjectResult(){
		String setResult[] = new String[this.marks.length];

		for(int i =0; i < this.marks.length; i++){
		if (this.marks[i]> 45 ){
		setResult[i] = "Pass";
		}
		else{
		setResult[i] = "Fail";
		}
		}
		return setResult;
	}
	
	void display(){
		int total = this.calTotal();
		
		double avg = this.calAverage(total);
		String subjects[] ={
			"Maths", "English", "ICT", "Science", "Tamil"
		};
		String setResult() = this.subjectResult();
		System.out.println("ID: "+this.id);
		System.out.println("Name: "+this.name);
		
		for (int i=0; i<marks.length; i++){
			char grade = getResult(marks[i]);
			System.out.println(subjects[i] +": "+ marks[i]+" Grade: "+grade);
		}
		
		System.out.println("Total: "+total);
		System.out.println("Average: "+avg);
		System.out.println("Overall Grade: "+ getResult((int)avg));
	}
}