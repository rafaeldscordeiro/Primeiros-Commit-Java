package com.javatreinamento;

import java.util.Scanner;

public class DobroAreaDoQuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o lado do quadrado :");
		double lado = scan.nextDouble();
		
		double area = Math.pow(lado, 2);
		
		System.out.println("o Quadrado bla bla bla é " + area);
		System.out.println("E o dobro dela e " + (area * 2));
		
		
	}

}
