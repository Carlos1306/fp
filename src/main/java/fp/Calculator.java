package fp;

import java.util.List;

public class Calculator {
	/*
	 * este metodo calcula el seno de un angulo
	 */
	static Double sin(double n) {
		return Math.rint(Math.sin(Math.toRadians(n))*10)/10;
	}

	/*
	 * Escribir todos los números del number al 0 de step en step.
	 */
	static int[] stepThisNumber(int number, int step) {
		int[] arrayNum=null;
		int cont=0;
		while(number > step){
			number -= step;
			arrayNum[cont]=number;
			cont++;
		}
		System.out.println(arrayNum);
		return arrayNum;
	}

	/*
	 * Módulo al que se le pasa un número entero del 0 al 20 y devuelve los
	 * divisores que tiene.
	 */
	static int[] divisors(int n) {
		int[] arrayDiv=null;
		if(n!=0){
			int contArray=0;
			for (int i=0;i<n;i++){
				if(n%i==0){
					
				}
			}
		
		}
		
		return arrayDiv;
	}
	
	/*
	 * Toma como parámetros dos listas. La primera con los 6 números de una
	 * apuesta de la primitiva, y la segunda con los 6 números ganadores. La
	 * función debe devolver el número de aciertos.
	 */
	static Integer checkMyBet(List<Integer> apuesta, List<Integer> aciertos) {
		Integer contAciertos=0;
		if(apuesta!=null && aciertos!=null){
			for(int cont1=0;cont1<aciertos.size();cont1++){
				if(apuesta.get(cont1).equals(aciertos.get(cont1)))contAciertos++;
			}
		}
		return contAciertos;
		
	}

	/*
	 * Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56
	 * mostrar: cincuenta y seis
	 */
	static String speakToMe(int n) {
		String [] arrayUnidades = {"Cero","Uno","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve"};
		String [] arrayDecenas = {"Veinte","Treinta","Cuarenta","Cincuenta","Sesenta","Setenta","Ochenta","Noventa"};
		String [] arrayDecenasAux = {"Diez","Once","Doce","Trece","Catorce","Quince"};
		String resp = null;
		int decenas = n/10;
		int unidades = n%10;
		switch(decenas){
			case 0: resp = arrayUnidades[unidades];
					break;
			case 1: 
					if(unidades < 6){
						resp = arrayDecenasAux[unidades];
					}else if(unidades >= 6){
						resp = "Dieci" + arrayUnidades[unidades];
					};
					break;
			case 2:
					switch(unidades){
						case 0: resp = arrayDecenas[decenas-2];
								break;
						default: resp = "Veinti" + arrayUnidades[unidades].toLowerCase();
								break;
					}
					break;
			case 3: case 4: case 5: case 6: case 7: case 8: case 9:
					switch(unidades){
						case 0: resp = arrayDecenas[decenas-2];
								break;
						default: resp = arrayDecenas[decenas-2] + " y " + arrayUnidades[unidades].toLowerCase();
								break;
					}
					break;
			default: resp = "Numero no valido";
					break;
		}
		return resp;
	}
	
	/*
	 * este metodo devuelve cierto si el año de la fecha es bisiesto fecha
	 * dd-MM-yyyy
	 */
	static boolean isLeapYear(String fecha) {
		return false;
	}

	/*
	 * este metodo calgula la tangente de un angulo
	 */
	static boolean isValidDate(String date) {
		return false;
	}
}
