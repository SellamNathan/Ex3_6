import java.util.*;
import java.util.Scanner;

public class EX_3_6 {
		public static void main(String[] args) {
			int[] div;
			div= new int[10001];
			for (int i=0; i<=10000; i++){ // init
				div[i]=0;
			}
			int max=0;
			for (int i=2; i<=10000; i++){ 
				for (int j=1; j<i; j++){ 
					if (i%j==0) div[i]++;
				}
				if (max < div[i]){
					max=div[i];
				}
			}
			for (int i=2; i<=10000; i++){
				if (div[i]==max){
					System.out.println(i);
				}
			}
			
		}

}
