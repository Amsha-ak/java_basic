class IrregularArray{
	public static void main(String args[]){
		int x [][] = new int [4][];
		
		x [0] = new int [3];
		x [1] = new int [4];
		x [2] = new int [2];
		x [3] = new int [1];
		
		x [0][0] = 10;
		x [0][1] = 10;
		x [0][2] = 10;
		
		x [1][0] = 10;
		x [1][1] = 10;
		x [1][2] = 10;
		x [1][3] = 10;
		
		x [0][0] = 10;
		x [0][0] = 10;
		
		x [0][0] = 10;
	}
}