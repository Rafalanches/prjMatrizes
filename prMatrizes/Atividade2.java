package Atividade2;

public class Atividade2 {

	public static void main(String[] args) {

		String [][] Clientela = new String [3][4];
	
		Clientela [0][0] = "João";
		Clientela [0][1] = "Rua das Flores, 123";
		Clientela [0][2] = "572.473.654-9";
		Clientela [0][3] = "15 99835-7788";
		Clientela [1][0] = "Maria";
		Clientela [1][1] = "Avenida dos Anjos,456";
		Clientela [1][2] = "785.234.654-9";
		Clientela [1][3] = "15 99123-2244";
		Clientela [2][0] = "Pedro";
		Clientela [2][1] = "Praça da Liberdade,789";
		Clientela [2][2] = "765.543.987-9";
		Clientela [2][3] = "15 99763-7755";
	
		for (int i = 0; i < 3; i++) {
			
				System.out.println("Nome: "+Clientela[i][0]);
				System.out.println("Endereço: "+Clientela[i][1]);
				System.out.println("CPF: "+Clientela[i][2]);
				System.out.println("Telefone: "+Clientela[i][3]);
				System.out.println();
		}

	}
}

