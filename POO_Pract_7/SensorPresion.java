public class SensorPresion extends Sensor {

    private double valorActual;

    public SensorPresion(String modelo, String fabricante,double consumoEnergia, boolean encendido, String unidadMedida, boolean estaCalibrado) {

        super(modelo, fabricante, consumoEnergia, encendido,unidadMedida, estaCalibrado);

        valorActual = 0.0;
    }

    @Override
    public double leerValor() {
        System.out.println("Leyendo presion.");

        double valorMinimo = 900.0;
        double valorMaximo = 1100.0;

        double numeroAleatorio = Math.random();
        double rango = valorMaximo - valorMinimo;
        double parteAleatoria = numeroAleatorio * rango;

        valorActual = valorMinimo + parteAleatoria;

        System.out.println("La presion es: " + valorActual + " hPa.");

        return valorActual;
    }
}
