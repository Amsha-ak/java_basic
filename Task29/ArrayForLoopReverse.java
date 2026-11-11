class ArrayForLoopReverse{
	public static void main(String args[]){
		int [] x = {10, 20, 30, 40, 50};
		for(int i=x.length - 1; i<5; i--){
			System.out.println(x[i]);
		}
	}
}