/*Raissa Rodrigues - Sistemas de Informacao
 * 3 . Escreva um programa em Java para ler o número total de eleitores de um município, 
 * o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.*/

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double eleitoresTotal, votosBrancos, votosNulos, votosValidos, percentualBranco, percentualNulo, percentualValido;

        System.out.println("Total de Eleitores: ");
        eleitoresTotal = scanner.nextDouble();

        System.out.println("Votos Brancos: ");
        votosBrancos = scanner.nextDouble();

        System.out.println("Votos Nulos: ");
        votosNulos = scanner.nextDouble();

        System.out.println("Votos Validos: ");
        votosValidos = scanner.nextDouble();

        percentualBranco = (votosBrancos / eleitoresTotal) * 100;
        percentualNulo = (votosNulos / eleitoresTotal) * 100;
        percentualValido = (votosValidos / eleitoresTotal) * 100;

        System.out.printf("percentual Branco: %.2f porcento \npercentual Nulo: %.2f porcento \npercentual Valido: %.2f porcento", percentualBranco, percentualNulo,percentualValido );
        
        scanner.close();
    }
}
