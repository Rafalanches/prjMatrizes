package Atividade4;

import java.util.Scanner;

public class Atividade4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] Matriz = new int [3][3];
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número meu nobre: ");
		Matriz [2][2] = entrada.nextInt();
		System.out.println("Outro número meu consagrado: ");
		Matriz [2][1] = entrada.nextInt();
		System.out.println("Mais um número meu rei: ");
		Matriz [2][0] = entrada.nextInt();
		System.out.println("Adiciona outro número por favor: ");
		Matriz [1][2] = entrada.nextInt();
		System.out.println("Quero outro número: ");
		Matriz [1][1] = entrada.nextInt();
		System.out.println("Digite mais um número, ja está quase acabando eu prometo: ");
		Matriz [1][0] = entrada.nextInt();
		System.out.println("Tenta outro número: ");
		Matriz [0][2] = entrada.nextInt();
		System.out.println("DIGITE OUTRO NÚMERO LOGO!!: ");
		Matriz [0][1] = entrada.nextInt();
		System.out.println("Digite um último número pra acabar: ");
		Matriz [0][0] = entrada.nextInt();
		
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 3; j++) {
				
				System.out.print(""+Matriz[i][j]+" ");
			}
			
			System.out.print(" ");
			System.out.println();
		}

	}


}
