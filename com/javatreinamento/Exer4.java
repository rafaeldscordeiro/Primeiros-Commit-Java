package com.javatreinamento;

import java.util.*;

public class Exer4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int i;
		double media = 0, result = 0;
		int[] notas = new int[4];
		
		 System.out.println("Informe suas notas do bimestre : ");
		for (i=0; i < 4; i++ ) {
			notas[i] = scan.nextInt();
			media += notas[i];
		}
         
		 result = media / 4;
		 System.out.println("A media das suas notas no bimestre é :" + result);
		
		
		if (result <= 4) {
		 System.out.println("Voce ficou abaixo da media");
		}
		else if((result > 5) && (result <=7)){
		 System.out.println("Voce ficou na media");
		}
		else {
		 System.out.println("Voce ficou acima da media");
		}
	}
}