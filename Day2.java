import java.util.ArrayList;
public class Day2{
	public static void main(String[]args){

	}
	public static ArrayList<Integer> convertToArrayList(int a){
		ArrayList<Integer> b = new ArrayList<>();
		b.add(a%10);
		if(a/10!=0)
			convertToArrayList(a/10);
		return b;
	}
	public static int reconstruct(ArrayList<Integer> a){
		int original = 0;

		for (int i = 0; i<a.size(); i++){
			if (i==0)
				original+=a.get(i);
			else
				original+=(a.get(i)*10*i);
		}

		return original;

	}
}