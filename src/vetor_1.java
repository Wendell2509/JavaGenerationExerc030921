import java.util.Scanner;

public class vetor_1 {

/*
Fa�a um programa que crie um vetor por 
leitura com 5 valores de pontua��o de uma atividade e o
 escreva em seguida. Encontre ap�s a maior pontua��o e a apresente. 
 */
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int[] num = new int[5];
		int maior = 0;		
		
		for (int i = 1; i < num.length; i++) {
			System.out.print("Pontua��o da atividade: ");
			num[i] = read.nextInt();
			
			if (num[i]>maior) {
				maior = num[i];
			}
		}
		
		System.out.println("-----\nMaior: " + maior);
		
		read.close();
	}

}
