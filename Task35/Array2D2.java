class Array2D2{
	public static void main(String args[]){
		int [][] x = new int [5][2];
	
		x[0][0] = 10;
		x[0][1] = 20;
	
		x[1][0] = 30;
		x[1][1] = 40;
	
		x[2][0] = 50;
		x[2][1] = 60;
	
		x[3][0] = 70;
		x[3][1] = 80;
	
		x[4][0] = 90;
		x[4][1] = 100;
	
		for(int a=0; a<=4; a++){
			for(int k=0; k<=1; k++){
				System.out.println(x[a][k]);
			}
			System.out.println(" ");
		}
	
	
	}
}