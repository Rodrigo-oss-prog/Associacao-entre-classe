public class Main {
    public static void main(String[] args) {


        Conta conta = new Conta("2256", 1000.00);
        Pessoa pessoa = new Pessoa("José Rodrigo", "216.445.986-11");

        // associação entre as classes
        conta.setPropritario(pessoa);
        pessoa.setConta(conta);


        System.out.println("O saldo da conta é de R$: " + pessoa.getConta().getSaldo());
        System.out.println("O proprietário da conta é o: " + conta.getPropritario().getNome());

    }
}