package comparadores;

import java.util.Scanner;

public class ej11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0;
		Scanner sn= new Scanner (System.in);
		System.out.println("introduce un numero");
		num1=sn.nextInt();
		System.out.println("al numero le faltan "+(100-num1)+" para leggar al 100");
	}

}
