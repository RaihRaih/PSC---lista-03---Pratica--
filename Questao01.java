/*Raissa Rodrigues - Sistemas de Informaçao
 * 1.Crie um algoritmos que leia dois números e exiba o resultado da divisão entre eles. 
 * O algoritmo deverá seguir todas as regras da divisão de números reais.*/

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero1, numero2, divisão;

        System.out.println("Digite o primeiro numero: ");
        numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero: ");
        numero2 = scanner.nextDouble();

        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Digite um numero diferente de Zero!");
        } else {
            divisão = numero1/numero2;
            System.out.printf("Resultado da divisão: %.2f" , divisão);
        }
    }
}
