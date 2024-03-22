/*Raissa Rodrigues - Sistemas de Informação
5. Escreva um programa em Java para determinar se o indivíduo está com um peso favorável. Essa situação é 
determinada através do IMC (Índice de Massa Corpórea), que é definida pela equação: 
IMC = pesoaltura2. A situação do peso é determinada pela tabela abaixo: */

import java.util.Scanner;

public class Questao05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double imc, pesoAtual, altura;
        String sexo;
        char pessoa;

        System.out.print("Digite o peso Atual (em Kg): ");
        pesoAtual = scanner.nextFloat();

        System.out.print("Digite a Altura (em Cm): ");
        altura = scanner.nextFloat();

        imc = pesoAtual / Math.pow(altura, 2);

        System.out.print("Se você for uma mulher biológica, digite [m]" + "\nSe voce for um homem biologico, digite [h]: ");
        sexo = scanner.next();
        pessoa = sexo.charAt(0);

        if (pessoa == 'm' || pessoa == 'M') {
            if (imc < 20) {
                System.out.println("Abaixo do peso");
            } else if (imc >= 20 && imc < 25) {
                System.out.println("Peso Normal");
            } else if (imc >= 25 && imc < 30) {
                System.out.println("Sobrepeso");
            } else if (imc >= 30 && imc < 40) {
                System.out.println("Obeso");
            } else {
                System.out.println("Obeso Mórbido");
            }
        } else if (pessoa == 'h' || pessoa == 'H') {
            if (imc < 20) {
                System.out.println("Abaixo do peso");
            } else if (imc >= 20 && imc < 25) {
                System.out.println("Peso Normal");
            } else if (imc >= 25 && imc < 30) {
                System.out.println("Sobrepeso");
            } else if (imc >= 30 && imc < 40) {
                System.out.println("Obeso");
            } else {
                System.out.println("Obeso Mórbido");
            }
        } else {
            System.out.println("Opção inválida. Digite 'm' ou 'h'.");
        }

        scanner.close();
    }
}
