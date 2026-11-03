public class Ejercicio1 {

    public static void main(String[] args) {
        //hab1
        double litrosH1 = calcularLitros(5.0, 4.0);
        double eurosH1 = calcularEuros(litrosH1);
        imprimirHabitacion("Habitacion 1", litrosH1, eurosH1);

        //hab2
        double litrosH2 = calcularLitros(6.0, 2.5);
        double eurosH2 = calcularEuros(litrosH2);
        imprimirHabitacion("Habitacion 2", litrosH2, eurosH2);

        //Total litros
        double totalLitros = getTotal(litrosH1, litrosH2);
        System.out.println("Total de litros: " + totalLitros);

        //Total euros
        double totalEuros = getTotal(eurosH1, eurosH2);
        System.out.println("Total de euros: " + totalEuros);
    }


    // Calcula los litros usando el lado y el ancho una sola vez
    private static double calcularLitros(double lado, double ancho) {
        double superficie = lado * ancho;
        return superficie / 10;
    }

    // Calcula los euros multiplicando los litros por el precio (4)
    private static double calcularEuros(double litros) {
        return litros * 4;
    }

    private static void imprimirHabitacion(String nombre, double litros, double euros) {
        System.out.println(nombre + ": " + litros + " litros, " + euros + " euros");
    }

    private static double getTotal(double valor1, double valor2) {
        return valor1 + valor2;
    }
}
