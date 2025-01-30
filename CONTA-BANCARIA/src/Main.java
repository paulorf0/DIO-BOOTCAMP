import java.math.BigDecimal;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do usuário: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o numero da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o saldo da conta: ");
        BigDecimal saldo = scanner.nextBigDecimal();

        ContaTerminal conta = new ContaTerminal(numero, saldo, agencia, nome);

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", conta.getNome(), conta.getAgencia(), conta.getNumero(), conta.getSaldo());
    }
}