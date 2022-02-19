import java.util.Scanner;

import classeMetodos.metCalcDois;

public class Calculadora {

	private metCalcDois metcalcdois;

	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);

		int escolher;

		while (true) {
			metCalcDois.mensagem("Voc� entrou na calculadora! \n" + "Escolha 1 para somar: \n"
					+ "Escolha 2 para subtrair: \n" + "Escolha 3 para multiplicar: \n" + "Escolha 4 para dividir: \n"
					+ "Escolha 5 para sair da calculador: \n");

			escolher = numero.nextInt();

			if (escolher == 1) {

				metCalcDois.mensagem("Digite um n�mero inteiro para somar: ");
				float valor1 = numero.nextFloat();
				metCalcDois.mensagem("Digite outro n�mero inteiro para somar: ");
				float valor2 = numero.nextFloat();
				float valorTotalSoma = metCalcDois.somar(valor1, valor2);
				metCalcDois.mensagem("O resultado da soma �: " + valorTotalSoma);
				continue;

			} else if (escolher == 2) {
				metCalcDois.mensagem("Digite um n�mero inteiro para subtrair: ");
				float valor3 = numero.nextFloat();
				metCalcDois.mensagem("Digite outro n�mero inteiro para subtrair: ");
				float valor4 = numero.nextFloat();
				float valorTotalSub = metCalcDois.subtrair(valor3, valor4);
				metCalcDois.mensagem("O resultado da subtra��o �: " + valorTotalSub);
				continue;

			} else if (escolher == 3) {
				metCalcDois.mensagem("Digite um n�mero inteiro para multiplicar: ");
				float valor5 = numero.nextFloat();
				metCalcDois.mensagem("Digite outro n�mero inteiro para multiplicar: ");
				float valor6 = numero.nextFloat();
				float valorTotalmult = metCalcDois.multiplicar(valor5, valor6);
				metCalcDois.mensagem("O resultado da multiplica��o �: " + valorTotalmult);
			} else if (escolher == 4) {
				metCalcDois.mensagem("Digite um n�mero inteiro para dividir: ");
				float valor7 = numero.nextFloat();
				metCalcDois.mensagem("Digite outro n�mero inteiro para dividir: ");
				float valor8 = numero.nextFloat();
				float valorTotalDiv = metCalcDois.dividir(valor7, valor8);
				metCalcDois.mensagem("O resultado da divis�o �: " + valorTotalDiv);
				continue;
			} else if (escolher == 5) {
				metCalcDois.mensagem(
						"Voc� optou por sair da calculadora! \n" + "Execute o programa novamente para reiniciar.");
				break;
			} else {
				metCalcDois.mensagem("O n�mero digitado � inv�lido, escolha outra op��o!");
				continue;
			}
		}

	}

}
