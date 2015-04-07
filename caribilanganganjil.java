package cariganjil;//tambah komment di atas
import java.util.Scanner;
public class caribilanganganjil {

	public static void main (String[] args) {
		int x,a=0;
		Scanner input = new Scanner (System.in);
		System.out.println("Masukan angka yang ada mau : ");
		a =input.nextInt();
		//untuk mengetahui bilangan genap
		System.out.print("genap = ");
		for (x=1;x<=a;x++) 
		{
			if (x%2!=0)
			{
				System.out.print("   "+ x);
			}
		}	
	 
		System.out.println(" ");
		//untuk mengetahui bilangan ganjil
		System.out.print("ganjil = ");
		
		for (x=1;x<=a;x++) 
												{
													if (x%2==1)
													{
										
													System.out.print("   "+ x);
													}
							}	
		
		// TODO Auto-generated constructor stub
	}

}
