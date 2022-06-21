package Exercicio;

public class Bdados {

    public static void main(String[] args) {

        Funcionario trab1 = new Funcionario("Rafael", 26, "Dev Júnior", "Ativo", "0");
        Funcionario trab2 = new Funcionario("Lucas", 19, "Dev Master", "Ativo", "0");
        Funcionario trab3 = new Funcionario("Pedro", 19, "Dev Trainer", "Ativo", "0");
        Funcionario trab4 = new Funcionario("Bruno", 25, "Dev Júnior", "Ativo", "0");

        trab1.demitir("Ativo");
        trab2.promover(trab2.getCargo());
        System.out.println("O trabalhador " + trab3.getNome() + " fez " + trab3.fazerAniversario() + " anos");
        trab4.pagarSalario(trab4.getSalario());



    }
}
