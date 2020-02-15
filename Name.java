import java.util.Scanner;

public class Name {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String[] arr=str.split("\\s");
		if(arr.length==3)
			System.out.println(arr[2]+" "+arr[1].charAt(0)+"."+arr[0].charAt(0));
		if(arr.length==2)
			System.out.println(arr[1]+" "+arr[0].charAt(0));
		s.close();
	}
}