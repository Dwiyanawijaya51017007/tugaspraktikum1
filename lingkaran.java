/**
 * @(#)lingkaran.java
 *
 *
 * @author
 * @version 1.00 2019/9/18
 */

import java.util.Scanner;
public class lingkaran {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
		double luaslingkaran, jarijari;
		System.out.println("=====Menghitung Luas Lingkaran=====");
		System.out.print("inputkan jari-jari: ");
		jarijari=input.nextInt();
		System.out.println();
		luaslingkaran=3.14*jarijari*jarijari;
		System.out.println("luas Lingkaran adalah: "+luaslingkaran);

    }


}