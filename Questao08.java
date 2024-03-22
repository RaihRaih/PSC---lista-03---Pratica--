/*Raissa Rodrigues - Sistemas de Informação
 * 8.Você está trabalhando em uma startup voltada para educação, e ficou responsável por criar a lógica de uma das atividades. 
 * Seu programa deve receber o valor dos três valors de um triângulo, e informar se ele é equilátero, isósceles ou escaleno.
 *  Restrição: Em um triângulo, o comprimento de um lado é sempre menor do que a soma dos outros dois! */

import java.util.Scanner;

public class Questao08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double valor1, valor2, valor3, comprimento;

        System.out.println("Digite o valor dos três lados de um triângulo e descubra se eh equilatero, isosceles ou escaleno\nValor 1:");
        valor1 = scanner.nextDouble();

        System.out.println("Digite o valor dos três lados de um triângulo e descubra se eh equilatero, isosceles ou escaleno\nValor 2: ");
        valor2 = scanner.nextDouble();

        System.out.println("Digite o valor dos três lados de um triângulo e descubra se eh equilatero, isosceles ou escaleno\nValor 3: ");
        valor3 = scanner.nextDouble();

        if (valor1 <= 0 || valor2 <= 0 || valor3 <= 0 || valor1 + valor2 <= valor3 || valor1 + valor3 <= valor2 || valor2 + valor3 <= valor1) {
            System.out.println("Os valores inseridos não formam um triângulo válido.");

        } else {
            if (valor1 < valor2 + valor3 && valor2 < valor1 + valor3 && valor3 < valor1 + valor2) {

                if (valor1 == valor2 && valor2 == valor3) {
                    System.out.println("O triângulo é equilátero, ou seja, todos os valors são iguais.");
                } else if (valor1 == valor2 || valor1 == valor3 || valor2 == valor3) {
                    System.out.println("O triângulo é isósceles, ou seja, possui dois valors iguais.");
                } else {
                    System.out.println("O triângulo é escaleno, ou seja, todos os valors são diferentes.");
                }
            } else {
                System.out.println("Os valores inseridos não formam um triângulo válido de acordo com a restrição.");
            }
        }
        scanner.close();
    }
}
