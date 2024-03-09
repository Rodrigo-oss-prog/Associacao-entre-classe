public class Conta
{
    private String numeroConta;
    private double saldo;
    private Pessoa propritario;

    public Conta(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;

    }


    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Pessoa getPropritario() {
        return propritario;
    }

    public void setPropritario(Pessoa propritario) {
        this.propritario = propritario;
    }
}

