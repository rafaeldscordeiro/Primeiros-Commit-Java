package com.javatreinamento;

import java.util.Scanner;


public class Exerc9 {
	
	public static void main (String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Digite a temperatura em graus Farenheit :");
	double temperaturaEmFarenheit = scan.nextDouble();
	
	double temperaturaEmCelsius = (5 * (temperaturaEmFarenheit-32) / 9); 
	
	System.out.println("Essa temperatura em Celsius e :" + temperaturaEmCelsius);
	
	}
}
