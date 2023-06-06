package Atividade3;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vetorDaVivência = new int[5];
		int ajudinha=0,ajudinha2=1;
		Scanner Babaca2 = new Scanner(System.in);     

	       for(int i=0;i<5;i++) {

	           System.out.println("Digite um valor");
	           vetorDaVivência[i]=Babaca2.nextInt();
	       }
	       for(int i=0;i<5;i++) {
	    	   ajudinha = ajudinha +  vetorDaVivência[i];
	       }
	       for(int i1=0;i1<5;i1++) {
	       ajudinha2 = vetorDaVivência[i1];
	       }
	       if(ajudinha/5<7){
	    	   System.out.println("Sua média final será de "+ ajudinha/5 +". Você é um fracassado!" );
	       }else if(ajudinha/5>=7){
	    	   System.out.println("Sua média final será de "+ ajudinha/5 +". Meus Parabéns meu rei você passou!");
	       }
	       if(ajudinha2>=7) {
	    	   System.out.println(ajudinha2>=7);
	       }
	       if(ajudinha2<7) {
	    	   System.out.println(ajudinha2<7);

	       }

	}
}