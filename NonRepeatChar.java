import java.util.*;
public class NonRepeatChar {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		str=str.toLowerCase();
		int count=0;
		System.out.println("Index of non-repeating characters..");
		System.out.println("char\tindex");
		for(char ch='a';ch<='z';ch++){
			count=0;
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)==ch){
					count++;
				}
			}
			if(count==1){				
				System.out.println(ch+"\t"+str.indexOf(ch));
			}
		}
	}
}
