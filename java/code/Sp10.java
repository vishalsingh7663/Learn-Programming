package pattern;

import java.util.Scanner;

public class Sp10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n :- ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=n-1;j>i;j--) {
				System.out.print(" ");
			}
			System.out.print("/");
			for(int k=0;k<2*i;k++) {
				if(k%2 == 0) System.out.print("/");
				else System.out.print("\\");
			}
			System.out.println("\\");
		}
	}
}

/*
 
Output :-
Enter n :- 5
    /\
   //\\
  //\/\\
 //\/\/\\
//\/\/\/\\
 
*/  