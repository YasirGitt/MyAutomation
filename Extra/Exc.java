package Extra;

public class Exc {
	
	public static void main(String[] args) {
		
//		int a=20; 
//		int b=0;
//		int c=a/b;  // arithmetic exception raised here bcx we provide wrong input
//		
//		System.out.println(c);
		
//		int a[]=new int[5];
//		for(int i=1; i<=5; i++) {
//			System.out.println(a[i]); // arrayoutofbounds exception raised here bcx we try to read element out of range
//		}
		
		int a[]=new int[-5];
		for(int i=1; i<=a.length;i++) {
			System.out.println(a[i]);  // negativearraysizeexception bcx we provide negative array size
		}
	}

}
