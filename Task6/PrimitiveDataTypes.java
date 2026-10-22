class PrimitiveDataTypes {
	public static void main (String args[]){
		byte b1;
		b1=12;
		System.out.println("byte: "+b1);
		
		short s1;
		s1=32000;
		System.out.println("short: "+s1);
		
		int i;
		i=1217;
		System.out.println("int: "+i);
		
		long l;
		l=121714180408L;
		System.out.println("long: "+l);
		
		float f1;
		f1=25.6f;
		System.out.println("float: "+f1);
		
		double db;
		db=12.17D;
		System.out.println("double: "+db);
		
		boolean bool;
		bool=true;
		System.out.println("boolean: "+bool);
		
		char ch;
		ch='K';
		System.out.println("char: "+ch);
		
		char ch1;
		ch1=65;//decimal value
		System.out.println("char: "+ch1);
		
		char ch2;
		ch2=0101;//octal value
		System.out.println("char: "+ch2);
		
		char ch3;
		ch3=0x41;//hexadecimal value
		System.out.println("char: "+ch3);
		
		char ch4;
		ch4=0b1000001;//binary value
		System.out.println("char: "+ch4);
		
		char ch5;
		ch5='\u0041';//Unicode Value
		System.out.println("char: "+ch5);
	}
}