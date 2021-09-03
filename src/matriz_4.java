import java.util.Scanner;

public class matriz_4 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int[][] mat = new int[3][3];
		int soma = 0;
		int somaDiagonal = 0;

		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat[l].length; c++) {
				mat[l][c] = read.nextInt();
				soma+=mat[l][c];
			}
		}

		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat[l].length; c++) {
				System.out.print("[" + mat[l][c] + "]");
			}
			System.out.println("");
		}

		for (int l = 0, c = 0; l < mat.length; l++, c++) {
			somaDiagonal += mat[l][c];
		}
		System.out.println("Soma: " + soma);
		System.out.println("Soma Diagonal: " + somaDiagonal);

		read.close();
	}

}
