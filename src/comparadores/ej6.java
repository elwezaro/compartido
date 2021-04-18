package comparadores;

import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0,num2=0,num3;
		
		Scanner sn= new Scanner (System.in);
		System.out.println("introduce un numero entero");
		num1=sn.nextInt();
		System.out.println("introduce otro numero entero");
		num2=sn.nextInt();
		System.out.println("introduce otro numero entero");
		num3=sn.nextInt();
		if(num1==num2 && num1==num3) {
			System.out.println(num1+" = " +num2 +" = "+num3);
			
		}else if(num1==num2 && num1!=num3){
			if(num1>num3) {
				System.out.println(num1+" = "+num2 +" > "+ num3);
			}else {
				System.out.println(num3+" > "+num1+" = "+num2);
			}
		}else if(num2==num3 && num2!=num1){
			if(num2>num1) {
				System.out.println(num3+" = "+num2 +" > "+ num1);
			}else {
				System.out.println(num1+" > "+num3+" = "+num2);
			}
		}
		else if(num1==num3 && num1!=num2){
			if(num1>num2) {
				System.out.println(num3+" = "+num1 +" > "+ num2);
			}else {
				System.out.println(num2+" > "+num3+" = "+num1);
			}
		}
		if(num1!=num2 && num1!=num3 && num2!=num3) {
			if(num1>num2 && num1>num3) {
				if(num2>num3) {
					System.out.println(num1 +" > "+num2 +" > "+ num3);
				}else {
					System.out.println(num1 +" > "+num3 +" > "+ num2);	
				}
			}
			if(num2>=num1 && num2>num3) {
				if(num1>num3) {
					System.out.println(num2 +" > "+num1 +" > "+ num3);
				}else {
					System.out.println(num2 +" > "+num3 +" > "+ num1);	
				}
			}
			if(num3>num2 && num3>num1) {
				if(num2>num1) {
					System.out.println(num3 +" > "+num2 +" > "+ num1);
				}else {
					System.out.println(num3 +" > "+num1 +" > "+ num2);	
				}
			}
		}
	}

}
