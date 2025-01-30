import java.math.BigDecimal;

public class ContaTerminal {
    private final int numero;
    private final String agencia;
    private final String nome;
    private final BigDecimal saldo;

    public ContaTerminal(int numero, BigDecimal saldo, String agencia, String nome) {
        this.numero = numero;
        this.saldo = saldo;
        this.agencia = agencia;
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }
}
