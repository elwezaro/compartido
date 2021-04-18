package comparadores;

import java.util.Scanner;

public class ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double nota=0;
		Scanner sn= new Scanner (System.in);
		System.out.println("introduce una nota");
		nota=sn.nextDouble();
		if(nota<0 || nota>10) {
			System.out.println("error tienen que ser entre 0 y 10 ");
		}else {
			if(nota>=0 && nota<5) {
				System.out.println("insuficiente");
			}
			if(nota>=5 && nota<6) {
				System.out.println("suficiente");
			}
			if(nota>=6 && nota<7) {
				System.out.println("bien");
			}
			if(nota>=7 && nota<8) {
				System.out.println("notable");
			}
			if(nota>=8 && nota<10) {
				System.out.println("excelente");
			}
			
		}

	}

}
