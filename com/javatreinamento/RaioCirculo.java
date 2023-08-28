package com.javatreinamento;

import java.util.Scanner;

public class RaioCirculo {
	
	public static void main (String [] args){
		
		Scanner metodoscan = new Scanner(System.in);
		
		System.out.println("Entre com o raio do círculo :");
		double raio = metodoscan.nextDouble();
		
		double area = Math.PI * Math.pow (raio, 2);
		
		System.out.println("Resultado :" + area);
		
		
	}

}
