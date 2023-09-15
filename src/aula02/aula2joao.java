package aula02;

import java.util.Scanner;

public class aula2joao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] numeros = new float[10];
        float maior = Float.MIN_VALUE;
        float menor = Float.MAX_VALUE;
        float soma = 0;

        // Solicita ao usuário que insira dez números float e os armazena no vetor
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextFloat();

            // Atualiza o maior e o menor número enquanto lemos os valores
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }

            soma += numeros[i];
        }

        // Calcula a média
        float media = soma / 10;

        // Exibe o vetor, o maior, o menor e a média
        System.out.println("Vetor completo:");
        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Média: " + media);

        scanner.close();
    }
}