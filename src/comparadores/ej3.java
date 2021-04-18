package comparadores;

import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre="";
		int edad=0;
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		
		System.out.println("introduce su nombre: ");
		nombre=sc.nextLine();
		System.out.println("introduce su edad");
		edad=sn.nextInt();
		if(edad>=30 && nombre.equalsIgnoreCase("manuel")) {
			System.out.println("no todos los dias conocemos a un manuel de 30 años o mas");
		}
	}

}
