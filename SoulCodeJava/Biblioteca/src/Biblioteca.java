public class Biblioteca {

    public static void main(String[] args) {

        LivroFisico l1 = new LivroFisico("Harry Potter RM 1", 2);
        Ebook l2 = new Ebook("Harry Potter RM 2");

        System.out.println(l1.verificarDisponibilidade());
        l1.emprestarLivro();
        l1.emprestarLivro();
        System.out.println(l1.verificarDisponibilidade());

        l2.emprestarLivro();
    }
}
