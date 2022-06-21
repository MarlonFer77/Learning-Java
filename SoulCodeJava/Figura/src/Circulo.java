public class Circulo extends Figura{
    private double raio;
    private final double pi = Math.PI;

    public Circulo(String nome, String cor, double raio) {
        super(nome, cor);
        if (raio <= 0){
            throw new RuntimeException("Não pode números negativos");
        }
        this.raio = raio;
    }

    @Override
    public double calcularArea() throws FiguraException {
        if ((raio % 2) != 0) {
            throw new FiguraException("Não pode números ímpares");
        }
        double areaCirculo;
        areaCirculo = pi * (Math.pow(raio, 2));
        System.out.println("A área do Circulo é: " + areaCirculo);
        return areaCirculo;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getPi() {
        return pi;
    }
}
