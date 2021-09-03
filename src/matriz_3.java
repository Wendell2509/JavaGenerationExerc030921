
public class matriz_3 {

	public static void main(String[] args) {

		int[][] N1 = new int[4][6];
		int[][] N2 = new int[4][6];
		int[][] M1 = new int[4][6];
		int[][] M2 = new int[4][6];

		System.out.println(">>N1<<");
		// gerar numeros da matriz N1
		for (int l = 0; l < N1.length; l++) {// linha
			for (int c = 0; c < N1[l].length; c++) {// coluna
				N1[l][c] = (int) ((Math.random() * (100 - 0)) + 0);
				System.out.print("[" + N1[l][c] + "]");
			}
			System.out.println("");
		}

		System.out.println(">>N2<<");
		// gerar numeros da matriz N2
		for (int l = 0; l < N2.length; l++) {// linha
			for (int c = 0; c < N2[l].length; c++) {// coluna
				N2[l][c] = (int) ((Math.random() * (100 - 0)) + 0);
				System.out.print("[" + N2[l][c] + "]");
			}
			System.out.println("");
		}
		
		System.out.println(">>M1<<");
		//gerar numeros matriz M1
		for (int l = 0; l < M1.length; l++) {// linha
			for (int c = 0; c < M1[l].length; c++) {// coluna
				M1[l][c] = N1[l][c] + N2[l][c];
				System.out.print("[" + M1[l][c] + "]");
			}
			System.out.println("");
		}
		
		System.out.println(">>M2<<");
		//gerar numeros matriz M2
		for (int l = 0; l < M2.length; l++) {// linha
			for (int c = 0; c < M2[l].length; c++) {// coluna
				M2[l][c] = N1[l][c] - N2[l][c];
				System.out.print("[" + M2[l][c] + "]");
			}
			System.out.println("");
		}
		
		
	}

}
