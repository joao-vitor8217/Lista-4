import java.util.Scanner;

public class ValidacaoDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // validação da nota
        double nota;
        do {
            System.out.print("Digite a nota (entre 0 e 10): ");
            nota = scanner.nextDouble();
        } while (nota < 0 || nota > 10);

        // validação do salário
        double salario;
        do {
            System.out.print("Digite o salário (maior que zero): R$ ");
            salario = scanner.nextDouble();
        } while (salario <= 0);

        // validação do sexo
        char sexo;
        do {
            System.out.print("Digite o sexo (m ou f): ");
            sexo = scanner.next().charAt(0);
        } while (sexo != 'm' && sexo != 'f');

        // validação da idade
        int idade;
        do {
            System.out.print("Digite a idade (entre 0 e 120): ");
            idade = scanner.nextInt();
        } while (idade < 0 || idade > 120);

        // mensagem de sucesso
        System.out.println("Dados inseridos com sucesso!");

        scanner.close();
    }
}