package Daily_practice_questions;
import java.util.*;
public class CountingCharcInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		int count=0;
		for(int i=0;i<st.length();i++) {
			if(st.charAt(i)==' ') continue;
			else count++;
		}
System.out.println(count);
	}

}
