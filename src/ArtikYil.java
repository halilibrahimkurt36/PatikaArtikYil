import java.util.Scanner;

public class ArtikYil {

	public static void main(String[] args) {
		int year;
		try (Scanner giris = new Scanner(System.in)) {
			System.out.println("Lütfen Yıl Giriniz : ");
			year=giris.nextInt();
		}
		
		if( (year>100) &&  (year % 400 == 0) && (year % 100==0)) {
				System.out.println("Bu Yıl Artık Yıldır");
				}
				else if(year%100!=0 && year%4==0 ) {
					System.out.println("Bu Yıl Artık Yıldır");
		}
		else {
			System.out.println("Bu Yıl Artık Yıl DEĞİLDİR!");
		}
		}
	}


