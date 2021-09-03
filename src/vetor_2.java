
public class vetor_2 {

	public static void main(String[] args) {

		int[] dado = new int[10];
		int soma = 0;

		int maior = 0;
		int ocorrencia = 0;
		int media = 0;

		for (int i = 1; i < dado.length; i++) {// gerar numeros aleatorios
			dado[i] = (int) ((Math.random() * (6 - 1)) + 1);
			System.out.println(dado[i]);

			soma += dado[i];// valor total para media

			if (dado[i] > maior) {// definir maior
				maior = dado[i];
			}
		}

		for (int i = 1; i < dado.length; i++) {// contar ocorrencia do maior
			if (dado[i] == maior) {
				ocorrencia++;
			}
		}

		media = soma / dado.length;

		System.out.println("|Média: " + media);
		System.out.println("|Maior valor: " + maior + " > Ocorrencias: " + ocorrencia);

	}

}
