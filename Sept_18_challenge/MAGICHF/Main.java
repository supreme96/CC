import java.lang.*;
import java.util.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//java.io.BufferedReader r = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		Scanner scan = new Scanner(System.in);
		int t;
		t = scan.nextInt();
		while(t>0){
			int curr_pos, init_pos, swaps;
			scan.nextInt();
			init_pos = scan.nextInt();
			swaps = scan.nextInt();
			curr_pos = init_pos;
			int A, B;
			while(swaps>0)
			{
				A=scan.nextInt();
				B=scan.nextInt();
				if(A==curr_pos){
					curr_pos = B;
				}
				else if(B==curr_pos){
					curr_pos = A;
				}
				swaps--;
			}
			t--;
			System.out.println(curr_pos);
		}
	}
}