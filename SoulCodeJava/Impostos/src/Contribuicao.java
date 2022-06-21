import java.util.ArrayList;
import java.util.List;

public class Contribuicao  {

    public static void main(String[] args) {

        PessoaFisica pf1 = new PessoaFisica("Marlon", 10000, 500);
        PessoaFisica pf2 = new PessoaFisica("Thiago", 50000, 2000);

    //   System.out.printf("%s%s%.2f%n", pf1.getNome(), " vai pagar o valor de: R$", pf1.calcularImposto());

        PessoaJuridica pj1 = new PessoaJuridica("SoulCode", 500000, 45);
        PessoaJuridica pj2 = new PessoaJuridica("TNT", 1000000, 150);

    //    System.out.printf("%s%s%.2f%n", pj1.getNome(), " vai pagar o valor de: R$", pj1.calcularImposto());

        List<Pessoa> listaPessoas = new ArrayList<Pessoa>();

        listaPessoas.add(pf1);
        listaPessoas.add(pf2);
        listaPessoas.add(pj1);
        listaPessoas.add(pj2);

        double soma = 0;

        for (Pessoa p:
             listaPessoas) {
            System.out.printf("%s%s%.2f%n", p.getNome() ," vai pagar de imposto o valor de: R$", p.calcularImposto());
            soma += p.calcularImposto();
        }

        System.out.printf("%s%.2f","O total de imposto a ser pago é de: R$ ", soma);
    }
}
