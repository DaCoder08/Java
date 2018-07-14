import java.util.ArrayList;
import java.util.Arrays;
public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] al = {3,4,2,7};
		ArrayList<Integer> aa = Sort(al);
		System.out.println(aa);
	}
	public static ArrayList<Integer> Sort(int[] a1) {
		ArrayList<Integer> a = new ArrayList<>();
		for(int i = 0;i<a1.length;i++) {
			a.add(a1[i]);
		}
		ArrayList<Integer> arrayList = new ArrayList<>();
		while(a.size()>0) {
			int min_val = 0;
			for(int i = 0;i<a.size();i++) {
				if(a.get(i)<min_val) {
					min_val = a.get(i);
				}
				else if(i == 0) {
					min_val = a.get(i);
				}else {
					continue;
				}
			}
			arrayList.add(min_val);
			a.remove(a.indexOf(min_val));
		}
		return arrayList;
	}

}
