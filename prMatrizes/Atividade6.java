package Atividade6;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		
		int somac1 = 0,somac2 = 0,somac3 = 0,somac4 = 0,somac5 = 0,somal1 = 0,somal2 = 0,somal3 = 0,somal4 = 0,somal5 = 0, soma = 0;
		
		int [][] Matriz = new int [5][5];
		
		Matriz [0][0]= 1;
		Matriz [0][1]= 2;
		Matriz [0][2]= 3;
		Matriz [0][3]= 4;
		Matriz [0][4]= 5;
		Matriz [1][0]= 6;
		Matriz [1][1]= 7;
		Matriz [1][2]= 8;
		Matriz [1][3]= 9;
		Matriz [1][4]=10;
		Matriz [2][0]=11;
		Matriz [2][1]=12;
		Matriz [2][2]=13;
		Matriz [2][3]=14;
		Matriz [2][4]=15;
		Matriz [3][0]=16;
		Matriz [3][1]=17;
		Matriz [3][2]=18;
		Matriz [3][3]=19;
		Matriz [3][4]=20;
		Matriz [4][0]=21;
		Matriz [4][1]=22;
		Matriz [4][2]=23;
		Matriz [4][3]=24;
		Matriz [4][4]=25;
		
				for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < 5; j++){
				 
				System.out.print(" "+Matriz[i][j]+" ");
					
			}
			
			System.out.print(" ");
			System.out.println();
		}{
				System.out.println("A soma dos números nas colunas:");
				somac1 = Matriz[0][0]+Matriz[1][0]+Matriz[2][0]+Matriz[3][0]+Matriz[4][0];
				System.out.println("A soma dos números na sua coluna 1 é: "+somac1);
				somac2 = Matriz[0][1]+Matriz[1][1]+Matriz[2][1]+Matriz[3][1]+Matriz[4][1];
				System.out.println("A soma dos números na sua coluna 2 é: "+somac2);
				somac3 = Matriz[0][2]+Matriz[1][2]+Matriz[2][2]+Matriz[3][2]+Matriz[4][2];
				System.out.println("A soma dos números na sua coluna 3 é: "+somac3);
				somac4 = Matriz[0][3]+Matriz[1][3]+Matriz[2][3]+Matriz[3][3]+Matriz[4][3];
				System.out.println("A soma dos números na sua coluna 4 é: "+somac4);
				somac5 = Matriz[0][4]+Matriz[1][4]+Matriz[2][4]+Matriz[3][4]+Matriz[4][4];
				System.out.println("A soma dos números na sua coluna 5 é: "+somac5);
				System.out.print(" ");
				System.out.println();
				System.out.println("A soma dos números nas linhas:");
				somal1 = Matriz[0][0]+Matriz[0][1]+Matriz[0][2]+Matriz[0][3]+Matriz[0][4];
				System.out.println("A soma dos números na sua linha 1 é: "+somal1);
				somal2 = Matriz[1][0]+Matriz[1][1]+Matriz[1][2]+Matriz[1][3]+Matriz[1][4];
				System.out.println("A soma dos números na sua linha 2 é: "+somal2);
				somal3 = Matriz[2][0]+Matriz[2][1]+Matriz[2][2]+Matriz[2][3]+Matriz[2][4];
				System.out.println("A soma dos números na sua linha 3 é: "+somal3);
				somal4 = Matriz[3][0]+Matriz[3][1]+Matriz[3][2]+Matriz[3][3]+Matriz[3][4];
				System.out.println("A soma dos números na sua linha 4 é: "+somal4);
				somal5 = Matriz[4][0]+Matriz[4][1]+Matriz[4][2]+Matriz[4][3]+Matriz[4][4];
				System.out.println("A soma dos números na sua linha 5 é: "+somal5);		
		}
				
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++){
						if(Matriz[i][j] % 2 !=0) {
							soma += Matriz[i][j];
							System.out.println("A soma dos números impares é: "+soma);
							
					}
					}
				}

	

	}
}
