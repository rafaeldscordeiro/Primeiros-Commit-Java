package com.javatreinamento;

import java.util.*;

public class MetroCent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scandaporratoda = new Scanner(System.in);
		
		double centimetros = 0;
		double metro = 0;
		
		System.out.println("Digite o valor em metros :");
		metro = scandaporratoda.nextDouble();
		
		centimetros = (metro * 100);
		
		System.out.println("Esse valor em centimetros e equivalente a : " + centimetros);

	}
}
