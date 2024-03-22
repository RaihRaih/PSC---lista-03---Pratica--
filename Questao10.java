/*Raissa Rodrigues - Sistemas de Informacao
 * 10. */

import java.util.Scanner;

public class Questao10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de compra do produto: R$ ");
        double valorCompra = scanner.nextDouble();
        double lucro, valorVenda;

        if (valorCompra < 10.00) {
            lucro = 0.70; // 70% de lucro
        } else if (valorCompra < 30.00) {
            lucro = 0.50; // 50% de lucro
        } else if (valorCompra < 50.00) {
            lucro = 0.40; // 40% de lucro
        } else {
            lucro = 0.30; // 30% de lucro
        }

        valorVenda = valorCompra * (1 + lucro);

        System.out.printf("Porcentagem de lucro: %.2f%%\n", lucro * 100);
        System.out.printf("Valor de venda: R$ %.2f\n", valorVenda);

        scanner.close();
    }
}
