public class PrincipalFinanciamento {

    public static void main(String[] args) {

        try{
            Financiamento f1 = new Financiamento(10000, 6000, 6);
            System.out.printf("%s%.2f%n","O seu financiamento foi de: ", f1.getInputValue());
            System.out.println("Você parcelou em: " + f1.getInstallments() + "x");
        }catch (FinanciamentoException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Agradecemos a sua confiança.");
        }

    }
}
