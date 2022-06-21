import java.util.ArrayList;
import java.util.List;

public class Matematica {

    public static void main(String[] args) throws FiguraException {

        List<Figura> listaFormas = new ArrayList<Figura>();

        try{
            Retangulo r1 = new Retangulo("Retangulo", "azul", 3, 2);

            r1.calcularArea();

            listaFormas.add(r1);
        }catch(FiguraException e){
            System.out.println(e.getMessage());
        }catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try{
            Circulo c1 = new Circulo("Circulo", "azul", -2);
            c1.calcularArea();

            listaFormas.add(c1);
        }catch (FiguraException e){
            System.out.println(e.getMessage());
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        try {
            Triangulo t1 = new Triangulo("Triangulo", "azul", 2, 3);

            t1.calcularArea();

            listaFormas.add(t1);
        }catch (FiguraException e){
            System.out.println(e.getMessage());
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
