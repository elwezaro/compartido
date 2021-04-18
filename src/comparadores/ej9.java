package comparadores;

import java.util.Scanner;

public class ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia=0;
		Scanner sn= new Scanner (System.in);
		System.out.println("introduce un numero entre el 1 y el 7");
		dia=sn.nextInt();
		if(dia<1 || dia>7) {
			System.out.println("error tienen que ser entre 1 y 7 ");
		}else {
			if(dia>=1 && dia<=5) {
				System.out.println("es una dia lavoral");
			}else {
				System.out.println("es fin de semana");
				}
			}
		
	}

}
