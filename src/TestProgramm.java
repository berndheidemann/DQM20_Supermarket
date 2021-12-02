public class TestProgramm {


    public static void main(String[] args) {

        Food f1=new Food(1, "Duplo", 0.69, "01.01.2022");
        f1.setStock(10);

        Food f2 = new Food(2, "Atom Snickers", 1.59, "10.10.2072");


        NonFood n1=new NonFood(89, "RTX 3090", 1500.99);
        NonFood n2=new NonFood(89, "Putzlappen Ultra - AntiAlles", 34.99);

        Supermarket s=new Supermarket(1, "Penny", 7, 22);

        s.addArticle(f1);
        s.addArticle(f2);
        s.addArticle(n1);
        s.addArticle(n2);

        System.out.println(s);


    }
}
