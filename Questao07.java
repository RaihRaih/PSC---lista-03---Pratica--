/*Raissa Rodrigues - Sistemas de Informação
 * 7. Escreva um programa em Java para ler: a descrição do produto (nome), a 
 * quantidade adquirida e o preço unitário. Calcular e escrever o total (total = quantidade adquirida * preço unitário), 
 * o desconto e o total a pagar (total a pagar = total - desconto), sabendo-se que:
- Se quantidade <= 5, o desconto será de 2%
- Se quantidade > 5 e quantidade <=10, o desconto será de 3%
- Se quantidade > 10 e quantidade <30, o desconto será de 5%
- Se quantidade >= 30 o desconto será de 10% */

import java.util.Scanner;

public class Questao07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total, precoUnitario, desconto = 0.0, totalPagar;
        int quantidade;
        String descricao;

        System.out.print("Digite a descrição do produto: ");
        descricao = scanner.nextLine();

        System.out.print("Digite a quantidade adquirida: ");
        quantidade = scanner.nextInt();

        System.out.print("Digite o preço unitário: ");
        precoUnitario = scanner.nextDouble();

        total = quantidade * precoUnitario;

        if (quantidade <= 5) {
            desconto = total * 0.02;
        } else if (quantidade > 5 && quantidade <= 10) {
            desconto = total * 0.03;
        } else if (quantidade > 10 && quantidade < 30) {
            desconto = total * 0.05;
        } else {
            desconto = total * 0.1;
        }

        totalPagar = total - desconto;

        System.out.println("Descrição do Produto: " + descricao);
        System.out.println("Total: R$ " + total);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Total a Pagar: R$ " + totalPagar);

        scanner.close();
    }
}
