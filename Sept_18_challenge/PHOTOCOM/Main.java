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
			int h1, w1, h2, w2, H, W;
			h1 = scan.nextInt();
			w1 = scan.nextInt();
			boolean arr1[][] = new boolean[h1][w1];
			String temp = scan.next();
			for(int i=0; i<h1; i++){
				for(int j=0; j<w1; j++){
					arr1[i][j] = temp.charAt(i*w1+j) == '0' ? false : true;
					// if(temp<=0){
					// 	break;
					// }
					// else{
					// 	arr1[i][j] = temp%10;
					// 	temp = temp/10;
					// }
				}
			} 
			h2 = scan.nextInt();
			w2 = scan.nextInt();
			boolean arr2[][] = new boolean[h2][w2];
			temp = scan.next();
			for(int i=0; i<h2; i++){
				for(int j=0; j<w2; j++){
					arr2[i][j] =  temp.charAt(i*w2+j) == '0' ? false : true;
					// if(temp<=0){
					// 	break;
					// }
					// else{
					// 	arr2[i][j] = temp%10;
					// 	temp = temp/10;
					// }
				}
			} 
			H = calc_LCM(h1, h2);
			W = calc_LCM(w1, w2);
			int factor_h1 = H/h1;
			int factor_h2 = H/h2;
			int factor_w1 = W/w1;
			int factor_w2 = W/w2;

			long similarity_count = 0;

			for(int i=0; i<H; i++){
				for(int j=0; j<W; j++){
					if((arr1[i/factor_h1][j/factor_w1]) == arr2[i/factor_h2][j/factor_w2]){
						similarity_count++;
					}
				}
			}
			t--;
			System.out.println(similarity_count);
		}
	}

	public static int calc_LCM(int a, int b){
		int temp;
		if(a == b){
			temp = a;
		}
		else if(a>b){
			temp = a;	
			while(((temp%a)!=0)||((temp%b)!=0)){
				temp+=a;
			} 
		}
		else{
			temp = b;
			while(((temp%a)!=0)||((temp%b)!=0)){
				temp+=b;
			}
		}
		return temp;
	}
}