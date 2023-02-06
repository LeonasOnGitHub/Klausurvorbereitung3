package grundlagen;

public class BruchTest {
    public static void main(String[] args) {
        Bruch b  = new Bruch(10, 5);
        b.kuerzen();
        System.out.println(b.getNenner());
    }
}
