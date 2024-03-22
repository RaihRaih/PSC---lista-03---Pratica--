/*Raissa Rodrigues - Sistemas de Informação
6. Escreva um programa que peça ao usuário que insira um número de 1 a 4, correspondendo a 
cada estação do ano (1 para Primavera, 2 para Verão, 3 para Outono, e 4 para Inverno) para identificar
a estação escolhida e imprimir uma mensagem característica daquela estação. */

import java.util.Scanner;

public class Questao06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite algum numero de 1 a 4: \n 1 para Primavera \t2 para Verão \t3 para Outono\t 4 para Inverno");
        int numero = scanner.nextInt(); // Captura o número digitado pelo usuário

        switch (numero) {
            case 1:
                System.out.println("Primavera: Flores desabrochando, dias mais longos e temperaturas amenas.");
                break;
            case 2:
                System.out.println("Verão: Dias quentes, sol intenso e tempo ideal para praia e piscina.");
                break;
            case 3:
                System.out.println("Outono: Folhas caindo das arvores, clima mais fresco e cores vibrantes nas paisagens.");
                break;
            case 4:
                System.out.println("Inverno: Temperaturas frias, possibilidade de neve e clima aconchegante para ficar em casa.");
                break;
            default:
                System.out.println("Número inválido. Por favor, escolha um número de 1 a 4.");
        }

        scanner.close();
    }
}
