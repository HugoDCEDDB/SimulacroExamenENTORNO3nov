public class Ejercicio2 {
    public static void main(String[] args) {
        int p1 = 7;
        int p2 = 4;
        int n = 2;
        double m = calcular(p1, p2, n);
        System.out.println("Media de puntos por partido: " + m);


        int largo = 8;
        int ancho = 3;
        int area = medir(largo, ancho);
        System.out.println("Area del campo: " + area);
    }



    public static double calcular(int a, int b, int c) {
        double s = a + b;
        double r = s / c;
        return r;
    }
    public static int medir(int x, int y) {
        return x * y;
    }
}