public class Ejercicio1 {
    public static void main(String[] args) {
        double l1 = 5.0;
        double a1 = 4.0;
        double s1 = l1 * a1;
        double x1 = s1 / 10;
        double y1 = x1 * 4;
        System.out.println("Habitacion 1: " + x1 + " litros, " + y1 + " euros");
        double l2 = 6.0;
        double a2 = 2.5;
        double s2 = l2 * a2;
        double x2 = s2 / 10;
        double y2 = x2 * 4;
        System.out.println("Habitacion 2: " + x2 + " litros, " + y2 + " euros");
        double tl = x1 + x2;
        System.out.println("Total de litros: " + tl);
        double te = y1 + y2;
        System.out.println("Total de euros: " + te);
    }
}
