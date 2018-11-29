import java.util.ArrayList;
public class Day2{
	public static void main(String[]args){
		System.out.println("Akash Jain");
		System.out.println("GOAT");
		System.out.println("Dennis Tsarkov");
	}
	public static ArrayList<Integer> convertToArrayList(int a){
		ArrayList<Integer> b = new ArrayList<>();
		b.add(a%10);
		if(a/10!=0)
			convertToArrayList(a/10);
		return b;
	}
}