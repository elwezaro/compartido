package comparadores;

import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0,num2=0;
		Scanner sn= new Scanner (System.in);
		System.out.println("introduce un numero entero");
		num1=sn.nextInt();
		System.out.println("introduce otro numero entero a comparar");
		num2=sn.nextInt();
		if(num1==num2) {
			System.out.println(num1+" "+num2);
		}else {
			if(num1>num2) {
				System.out.println(num1+" "+num2);
			}else {
				System.out.println(num2+" "+num1);
			}	
		}
	}

}
