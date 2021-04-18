package comparadores;

import java.util.Scanner;

public class ej12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0,num2=0,num3=0,num4=0,num5=0,num6=0;
		Scanner sn= new Scanner (System.in);
		System.out.println("introduce un numero");
		num1=sn.nextInt();
		System.out.println("introduce un numero");
		num2=sn.nextInt();
		System.out.println("introduce un numero");
		num3=sn.nextInt();
		System.out.println("introduce un numero");
		num4=sn.nextInt();
		System.out.println("introduce un numero");
		num5=sn.nextInt();
		System.out.println("introduce un numero");
		num6=sn.nextInt();
		if((num1+num2+num3+num4+num5+num6)<=10) {
			System.out.println("la suma no llega a 10 lo siento");
		}else{
			System.out.println(num1+"+"+num2+"+"+num3+"+"+num4+"+"+num5+"+"+num6+"="+(num1+num2+num3+num4+num5+num6));
		}
	}

}
