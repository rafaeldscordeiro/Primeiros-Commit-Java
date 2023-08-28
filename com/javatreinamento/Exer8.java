package com.javatreinamento;

import java.util.Scanner;


public class Exer8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quando voce ganha por hora? ");
		double recebidoPorHora = scan.nextDouble();
		
		System.out.println("Digite quantas horas trabalhou no mes :");
		double horasTrabalhadasNoMes = scan.nextDouble();
		
		System.out.println("Então vai receber esse mes " + (recebidoPorHora * horasTrabalhadasNoMes));
		
	}

}
