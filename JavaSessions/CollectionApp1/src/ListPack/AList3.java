package ListPack;
import java.util.*;

public class AList3 {

	public static void main(String[] args) {
		List<Integer>  intList = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter a value (-1 to stop) ");
			int n = sc.nextInt();
			
			if(n==-1)
				break;
			
			intList.add(n);
		}
		
		System.out.println(intList);
		System.out.println("------------");
	}

}
