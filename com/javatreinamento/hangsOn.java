package com.javatreinamento;

import java.util.Scanner;

public class hangsOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Alo Mundo");
		
		/*Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe um numero");
		int NumeroInformado = scanner.nextInt();
		System.out.println("O numero informado foi: " + NumeroInformado);*/
		
		Scanner scanner = new Scanner(System.in);
			
		System.out.println("Informe um numero para soma : ");
		int Numero1 = scanner.nextInt();
		
		System.out.println("Informe outro numero para soma : ");
		int Numero2 = scanner.nextInt();
		
		int Resultado = Numero1 + Numero2;
		System.out.println("A somado dos valor informados são :" + Resultado);
		

	}

}
