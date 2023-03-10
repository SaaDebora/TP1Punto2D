package tp1D;

public class Ejercicio2Dtp1Class {

	public static void main(String[] args) {
		// //Ejercicio 2-d
		
		//Variables de entrada.
		 double canastaBasica = 489083;
		 int cantidadVehiculos = 3;
		 int cantidadInmuebles = 3;
		 boolean embarcacionAeronave = true; //(verdadero);//false (falso) 
		
		//Verificar si pertenece al segmento de ingresos alto
		if(canastaBasica >= 489083 && cantidadVehiculos >= 3 && cantidadInmuebles >= 3 && embarcacionAeronave == true) {
			System.out.println("Segmento de ingresos Altos - I.");
		}
		
		//Verificar si pertenece al segmento de ingresos medio
		if((canastaBasica >= 163.539 && canastaBasica <= 489083) && cantidadVehiculos >= 2 && cantidadInmuebles >= 1 && embarcacionAeronave == false) {
			System.out.println("Segmento de ingresos Medio - II.");
		}
		
		//Verificar si pertenece al segmento de menores ingresos
		if(canastaBasica <= 163.539 && cantidadVehiculos < 1 && cantidadInmuebles <= 1 && embarcacionAeronave == false) {
			System.out.println("Segmento de Menores ingresos - III.");
		}
	}

	}

