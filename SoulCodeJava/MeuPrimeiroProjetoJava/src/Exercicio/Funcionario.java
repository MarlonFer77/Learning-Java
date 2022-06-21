package Exercicio;

public class Funcionario {
    private String nome;
    private int idade;
    private String cargo;
    private String situacao;
    private String salario;


    public Funcionario (String nome, int idade, String cargo, String situacao, String salario) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.situacao = situacao;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public int fazerAniversario() {
        return ++this.idade;


    }

    public void demitir(String cargo){
        if (getSituacao() == "Ativo") {
            System.out.println("O Trabalhador " + getNome() + " foi demitido.");
        }
    }

    public void promover (String cargo){
        System.out.println("O Trabalhador " + getNome() + " foi Promovido !");
    }

    public void pagarSalario(String salario) {
        System.out.println("O salário do trabalhador " + getNome() + " foi pago.");
    }
}
