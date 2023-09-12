import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<ContaTerminal> conta = new ArrayList<>();
        Integer numConta = 0;
        String agencia;
        String nomeCliente;
        double saldo;
        int operacao;
        do {
            System.out.println("Menu: \n" +
                    "1. Cadastrar Nova conta. \n" +
                    "2. Imprimir contas cadastradas \n" +
                    "0. Sair \n");
            operacao = scan.nextInt();
            switch (operacao) {
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    System.out.println("Cadastro");
                    System.out.println("Por favor, digite o número da Agência !");
                    agencia = scan.nextLine();
                    scan.nextLine(); //esvazia o buffer do teclado
                    System.out.println("Por favor, digite o nome do cliente !");
                    nomeCliente = scan.nextLine();
                    //scan.nextLine();
                    System.out.println("Por favor, digite o Saldo da conta !");
                    saldo = Double.parseDouble(scan.nextLine().replace(",", "."));
                    //scan.nextLine(); //esvazia o buffer do teclado
                    conta.add(new ContaTerminal(numConta, agencia, nomeCliente, saldo));
                    numConta++;
                    System.out.println("Cadastro realizado com sucesso! \n");
                    break;
                case 2:
                    System.out.println("Contas cadastradas:");
                    System.out.println(conta.toString());
                    break;
                default:
                    System.out.println("Opção invalida, selecione uma opção valida:");
                    break;

            }
        } while (operacao != 0);

    }
}