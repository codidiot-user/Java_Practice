package Daily_practice_questions;
import java.util.*;
public class CountingPuntMarks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		String punc=".,?!{}[]()!?";
		int count=0;
		for(int i=0;i<st.length();i++) {
			if(punc.indexOf(st.charAt(i))!=-1){
			count++;
		}
		}
		System.out.println(count);
	}

}
