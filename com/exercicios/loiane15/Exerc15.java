package com.exercicios.loiane15;

import java.util.*;


public class Exerc15 {
	
	public static void main (String[] args) {
		Scanner scan = new java.util.Scanner(System.in);
		
		System.out.println("Entre com primeiro numero ");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com segundo numero ");
		int num2 = scan.nextInt();
		
		if (num1 > num2) {
			System.out.println("O num1 é maior: " + num1);			
		}
		else {
			System.out.println("O num2 é maior: " + num2);
		}
	}
}