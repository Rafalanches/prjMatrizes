package Atividade5;

public class Atividade5 {
	public static void main(String[] args) {

		String [][] Treco = new String [3][5];
	
		Treco [0][0] = "a)";
		Treco [0][1] = "  a  b  c  d  e ";
		Treco [0][2] = "  f  g  h  i  j";
		Treco [0][3] = "  l  m  n  o  p";
		Treco [0][4] = "  q  r  s  t  u ";
		Treco [1][0] = "b)";
		Treco [1][1] = "  19  25  100  99";
		Treco [1][2] = "  10  7   25   14";
		Treco [1][3] = "  35  2   47   74";
		Treco [1][4] = "";
		Treco [2][0] = "c)";
		Treco [2][1] = "  1.9  2.5  10.0";
		Treco [2][2] = "  1.0  7.8  2.5";
		Treco [2][3] = "  3.5  2.2  4.7";
		Treco [2][4] = "";
	
		for (int i = 0; i < 3; i++) {
			
				System.out.println(Treco[i][0]);
				System.out.println(Treco[i][1]);
				System.out.println(Treco[i][2]);
				System.out.println(Treco[i][3]);
				System.out.println(Treco[i][4]);
				System.out.println();
		}

	}

}
