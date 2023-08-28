package com.javatreinamento;

import java.util.Scanner;

public class Exec10 {
	

	public static void main (String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Entre com sua altura :");
	double altura = scan.nextDouble();
	
	double pesoIdeal = (72.7 * altura) - 58;
	
	System.out.println("Seu peso ideal seria :" + pesoIdeal);
	
	}

}
