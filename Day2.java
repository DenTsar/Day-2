import java.util.ArrayList;
public class Day2{
	public static void main(String[]args){
		System.out.println(convertToArrayList(8950));
		System.out.println(reconstruct(convertToArrayList(8950)));
	}
	public static ArrayList<Integer> convertToArrayList(int a){
		ArrayList<Integer> b = new ArrayList<>();
		b.add(0,a%10);
		if(a/10!=0)
			convertToArrayList(a/10);
		return b;
	}
}