package JavaÖdevler;

import java.util.Scanner;

public class SuAnkiSaat {
	public static void main(String[] args) {
		  long nMillis;
	      long n, hours, minutes, seconds;
	     
	      Scanner input = new Scanner(System.in);
	      
	      System.out.println("GMT ye göre zaman diliminizi giriniz.(Örn;+3)");
	      long GMT = input.nextLong();
	      input.close();
	      nMillis = System.currentTimeMillis();

	      n = nMillis/1000;        // Total # Second;

	      seconds = n % 60;        // Seconds

	      n = n / 60;              // Total # minutes;

	      minutes = n % 60;        // Minutes

	      n = n / 60;              // Total # hours;

	      hours = (n % 24) + GMT;

	      System.out.print(hours); 
	      System.out.print(":");
	      System.out.print(minutes); 
	      System.out.print(":");
	      System.out.print(seconds); 
	      System.out.println(" GMT");
	}
}
