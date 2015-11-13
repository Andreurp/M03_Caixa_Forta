package caixa;

import java.util.Scanner;

public class App {

	private static Scanner llegir;

	public static void main(String[] args) {
		int DinersTreure, DinersTotals, DinersIgresar, opcio;
		DinersTotals=452;
		
		do{
			System.out.println("1: Treure dires.");
			System.out.println("2: Ingresar deners.");
			System.out.println("0: Finalitza.");
			llegir = new Scanner(System.in);
			opcio = llegir.nextInt();
			
			if (opcio == 1) {
				System.out.println("Quants diners vol treure?");
				DinersTreure = llegir.nextInt();
				if ( DinersTotals>= DinersTreure){
					DinersTotals = DinersTotals - DinersTreure;
					System.out.println(DinersTotals + " € ");
					System.out.println();
				}else{
					System.out.println("La cantitat que vols treure es superior el teu saldo actual!!!");
					System.out.println();
				}
				
			}
			if (opcio == 2) {
				System.out.println("Quants diners vol ingresar?");
				DinersIgresar = llegir.nextInt();
				DinersTotals = DinersTotals + DinersIgresar;
				System.out.println(DinersTotals + " € ");
				System.out.println();
			}
		}while( opcio != 0);
	}
}