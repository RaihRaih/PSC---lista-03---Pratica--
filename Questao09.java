/*Raissa Rodrigues - Sistemas de Informação
9. (Decom/UFOP - Adaptado) A permissão para uma pessoa votar ou não é determinado pela idade dela, conforme a tabela:
Crie um programa capaz de ler a idade de uma pessoa e imprimir sua classificação eleitoral. Entrada: QUAL A IDADE DA PESSOA?: 17
Saída: ELEITOR FACULTATIVO*/
import java.util.Scanner;

public class Questao09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double idade;

        System.out.println(" QUAL A IDADE DA PESSOA?:");
        idade = scanner.nextDouble();

        if (idade < 16) {
            System.out.println("Menor que 16: Não é eleitor");
        } else if (idade == 16 || idade == 17) {
            System.out.println("De 16 a 17: Eleitor facultativo");
        } else if (idade == 18 || idade < 66) {
            System.out.println("De 18 a 65: Eleitor obrigatório");
        } else {
            System.out.println("Acima de 65: Eleitor facultativo");
        }
        scanner.close();

    }
}
