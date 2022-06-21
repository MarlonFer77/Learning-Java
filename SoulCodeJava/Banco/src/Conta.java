public abstract class Conta {

    private String titularConta;
    private String numeroConta;
    private String numeroAgencia;
    private double saldo;

    public Conta(String titularConta, String numeroConta, String numeroAgencia, double saldo ) {
        this.titularConta = titularConta;
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (getSaldo() < valor){
            System.out.println(getTitularConta() + " , saldo Insuficiente.");
        }else {
            setSaldo(getSaldo() - valor);
            System.out.println(getTitularConta() + ", saque efetuado com sucesso. Seu saldo novo saldo é: " + getSaldo());
        }
    }

    public void depositar(double valor) {
        if (valor > 20) {
            setSaldo(getSaldo() + valor);
            System.out.println(getTitularConta() + ", depósito realizado com sucesso, seu novo saldo é de: " + getSaldo());
        } else {
            System.out.println(getTitularConta() + ", valor mínimo de depósito é de R$ 20,00 ");
        }
    }

    public void mostrarDados(){
        System.out.println("_____________________");
        System.out.println("O titular da conta é: " + getTitularConta());
        System.out.println("O número da conta é: " + getNumeroConta());
        System.out.println("O agência da conta é: " + getNumeroAgencia());
        System.out.println("O saldo da conta é: R$ " + getSaldo());
    }

    public String getTitularConta() {
        return titularConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
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

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }
}
