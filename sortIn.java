package Other;
import java.util.*;
import java.io.*;
public class sortIn {
	public static void main(String[] args) throws IOException{
		File file = new File("C:\\Users\\Alden\\eclipse-workspace\\Personal Project\\src\\Other\\in.txt");
		Scanner sc = new Scanner(file);
		String data = sc.nextLine();
		String[] split = data.split(" ");
		int[] a = new int[split.length];
		for (int i=0; i<split.length; ++i) {
			a[i] = Integer.parseInt(split[i]);
		}
		Arrays.sort(a);
		for (int i: a) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}