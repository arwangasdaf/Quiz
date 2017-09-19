import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String line = cin.nextLine();
		String[] tar = line.split(" ");
		int[] res = new int[tar.length];
		for (int i=0; i<tar.length; i++) {
		    res[i] = Integer.parseInt(tar[i]);
		}
		
	}
}