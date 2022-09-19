import java.util.Scanner;
public class VücütKitleEndeksi {

	public static void main(String[] args) {
		
		int kilo  ;	
		double vkitle , boy;
		
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.println("kilonuzu giriniz: ");
		kilo = input.nextInt();
		
		System.out.println("boyunuzu metre cinsinden giriniz: ");
		boy = input.nextDouble();
		
		vkitle = kilo/(boy*boy);
		
		System.out.println("vücüt kitle endeksiniz: " + vkitle);
	}

}
