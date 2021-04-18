package comparadores;

import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0;
		Scanner sn= new Scanner (System.in);
		System.out.println("introduce un numero entero");
		num1=sn.nextInt();
		
		if(num1<=0) {
	System.out.println("no puede ser negativos o el 0");
		}else {
			if(num1%2==0) {
				System.out.println("el numero es par");
			}else {
				System.out.println("el numero es impar");
			}		
		}
	}

}
