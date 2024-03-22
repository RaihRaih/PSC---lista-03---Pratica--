/*Raissa Rodrigues - Sistemas de Informação 
 * 4. Avalie o código abaixo e determine se suas saídas estão corretas. Primeiro, tente identificar a falha sem 
 * executar o programa; Em seguida, implemente e veja se acertou.Se houver erros, aponte-os e proponha e implemente 
 * as correções. Obs.: Somente um aumento pode ser aplicado por vez! */

import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double salario = 0.0;
        double taxaAumento1 = 1.1;
        double taxaAumento2 = 1.2;
        double taxaAumento3 = 1.5;

        System.out.print("Por favor, informe o valor do salário atual: ");
        salario = entrada.nextDouble();

        if (salario <= 1088) {
            salario *= taxaAumento3;
        }
        if (salario <= 2006) {
            salario *= taxaAumento2;
        }
        if (salario <= 3086) {
            salario *= taxaAumento1;
        }
        if (salario <= 4000) {
            taxaAumento1 = 1.1;
            salario = (salario * taxaAumento1) + 288;
        }
        System.out.println();
        System.out.printf("Novo Salário: R$ %.2f\n\n", salario);

        entrada.close();
    }
}
