public class Calculatrice {

    // Additionne deux entiers
    public static int addition(int a, int b) {
        return a + b;
    }

    // Soustrait b de a
    public static int soustraction(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        System.out.println("3 + 4 = " + addition(3, 4));
        System.out.println("10 - 6 = " + soustraction(10, 6));
    }
}
