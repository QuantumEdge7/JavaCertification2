package chapter1.immutabledemo;

import java.util.Date;

public class ImmutableEventTest {

	public static void main(String[] args) {
		Date date = new Date();
		
		ImmutableEvent event = new ImmutableEvent("Conference", date);
		System.out.println(event);
		
		//let's attemt to modify the original date
		date.setTime(date.getTime()+1000000L);
		
		//event date remins unchanged
		System.out.println(event);

	}

}
