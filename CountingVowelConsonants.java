package Daily_practice_questions;
import java.util.*;
public class CountingVowelConsonants {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		int vow=0,cons=0;
		for(int i=0;i<st.length();i++) {
			if(st.charAt(i)=='a' ||st.charAt(i)=='e' ||st.charAt(i)=='i' ||st.charAt(i)=='o' ||
					st.charAt(i)=='u' ||st.charAt(i)=='A' ||st.charAt(i)=='E' ||st.charAt(i)=='O' ||
					st.charAt(i)=='I' ||st.charAt(i)=='U') {
				vow++;
			}
			else if(st.charAt(i)==' ') continue;
			else {
				cons++;
			}
		}
		System.out.println(vow+" "+cons);
	}

}
