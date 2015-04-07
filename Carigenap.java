package cariganjil;

import java.util.Scanner;

public class Carigenap {

	public static void main (String[] args) {
		int x,a=0;
		Scanner input = new Scanner (System.in);
		System.out.println("Masukan angka yang ada mau : ");
		a =input.nextInt();
		
		
		for (x=1;x<=a;x++) 
		{
			if (x%2==0)
			{
				System.out.print("   "+ x);
			}
		}	
	 
		// TODO Auto-generated constructor stub
	}

}
