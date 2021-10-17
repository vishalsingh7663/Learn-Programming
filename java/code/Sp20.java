package pattern;

import java.util.Scanner;

public class Sp20 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n :- ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				if((i+j)%2 == 0) System.out.print("@");
				else System.out.print("#");
			}
			System.out.println();
		}
	}
}

/*

Output :-
Enter n :- 5
@
#@
@#@
#@#@
@#@#@ 

*/