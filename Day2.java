import java.util.ArrayList;
public class Day2{
	public static void main(String[]args){
		System.out.println(convertToArrayList(8950));
		//System.out.println(reconstruct(convertToArrayList(8950)));
	}
	public static ArrayList<Integer> convertToArrayList(int a){
		ArrayList<Integer> b = new ArrayList<>();
		for(;a/10!=0;a/=10)
			b.add(0,a%10);
		b.add(0,a);
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