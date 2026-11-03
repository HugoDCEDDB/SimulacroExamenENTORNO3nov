public class Ejercicio2 {
    public static void main(String[] args) {
        int puntosPartido1 = 7;
        int puntosPartido2 = 4;
        int numeroPartidos = 2;
        double media = calcularMedia(puntosPartido1, puntosPartido2, numeroPartidos);
        System.out.println("Media de puntos por partido: " + media);

        int largo = 8;
        int ancho = 3;
        int area = calcularArea(largo, ancho);
        System.out.println("Area del campo: " + area);
    }
    public static double calcularMedia(int puntosPartido1, int puntosPartido2, int numeroPartidos) {
        double suma = puntosPartido1 + puntosPartido2;
        double resultado = suma / numeroPartidos;
        return resultado;
    }
    public static int calcularArea(int largo, int ancho) {
        return largo * ancho;
    }