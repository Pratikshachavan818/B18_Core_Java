package string;
import java.util.Scanner;
public class String {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		 
			  Scanner sc= new Scanner(System.in);
			  int size = sc.nextInt();
			  int arr[] = new int [size];
			  for(int i=0;i<size;i++)
			  	arr[i]=sc.nextInt();
			  for(int i=0;i<size;i++)
			    System.out.println(arr[i]);
			  }
	}


