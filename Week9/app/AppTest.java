package app;

import java.util.*;

public class AppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = s.nextLine();
		App a = new App();
		String k = a.removeAChars(str);
		System.out.println(k);
		s.close();
		

	}

}
