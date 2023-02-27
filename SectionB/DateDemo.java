package SectionB;

import java.sql.Date;

public class DateDemo {
	
	public static void main(String[] args) {
//		String s= "i am a good boy";
//		
//		String[]x=s.split(" ");
//		
//		System.out.println(x.length);
		
		Date da= new Date(0);
		
		String[]x=da.toString().split(" ");
		
		System.out.println(x[2]+"/"+x[1]+"/"+x[5]);
		
		
	}

}
