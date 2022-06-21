public class Financiamento {

    //regras: 1 -> o valor da entrada tem que ser no mínimo 20% do valor total
    //        2 -> o número de parcelas deve ser de no mínimo 6

    private double amount; //valorTotal
    private double inputValue; // valorEntrada
    private int installments; // parcelas

    public Financiamento(double amount, double inputValue, int installments) throws FinanciamentoException {
        if (inputValue < amount * 0.2) {
            throw new FinanciamentoException("O valor de entrada deve ser de, no mínimo, 20% do valor total!");
        }
        else if (installments < 6){
            throw new FinanciamentoException("Desculpe, mas o valor mínimo de parcelas = 6");
        }
        this.amount = amount;
        this.inputValue = inputValue;
        this.installments = installments;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getInputValue() {
        return inputValue;
    }

    public void setInputValue(double inputValue) {
        this.inputValue = inputValue;
    }

    public int getInstallments() {
        return installments;
    }

    public void setInstallments(int installments) {
        this.installments = installments;
    }
}
