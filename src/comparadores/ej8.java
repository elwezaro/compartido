package comparadores;

import java.util.Scanner;

public class ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia=0;
		Scanner sn= new Scanner (System.in);
		System.out.println("introduce un numero entre el 1 y el 7");
		dia=sn.nextInt();
		if(dia<1 || dia>7) {
			System.out.println("error tienen que ser entre 1 y 7 ");
		}else {
			if(dia==1) {
				System.out.println("es lunes");
			}
			if(dia==2) {
				System.out.println("es martes");
			}
			if(dia==3) {
				System.out.println("es miercoles");
			}
			if(dia==4) {
				System.out.println("es jueves");
			}
			if(dia==5) {
				System.out.println("es viernes");
			}
			if(dia==6) {
				System.out.println("es sabado");
			}
			if(dia==7) {
				System.out.println("es domingo");
			}
		}
	}

}
