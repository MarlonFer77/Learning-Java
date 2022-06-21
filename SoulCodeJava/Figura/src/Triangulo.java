public class Triangulo extends Figura{

    private double base;
    private double altura;

    public Triangulo(String nome, String cor, double base, double altura) {
        super(nome, cor);
        if (base <= 0 || altura <= 0){
            throw new RuntimeException("Não pode números negativos");
        }
        this.base = base;
        this.altura = base;
    }

    @Override
    public double calcularArea() throws FiguraException {
        if ((base % 2) != 0 || (altura % 2) != 0) {
            throw new FiguraException("Não pode números ímpares");
        }
        double areaTriangulo;
        areaTriangulo = (base * altura) / 2;
        System.out.println("A área do Triangulo é: " + areaTriangulo);
        return areaTriangulo;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
