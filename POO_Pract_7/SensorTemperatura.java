public class SensorTemperatura extends Sensor {

    private double valorActual;

    public SensorTemperatura(String modelo, String fabricante,double consumoEnergia, boolean encendido,String unidadMedida, boolean estaCalibrado) {

        super(modelo, fabricante, consumoEnergia, encendido,unidadMedida, estaCalibrado);

        valorActual = 0.0;
    }

    @Override
    public double leerValor() {
        System.out.println("Leyendo temperatura.");

        double valorMinimo = 20.0;
        double valorMaximo = 35.0;

        double numeroAleatorio = Math.random();
        double rango = valorMaximo - valorMinimo;
        double parteAleatoria = numeroAleatorio * rango;

        valorActual = valorMinimo + parteAleatoria;

        System.out.println("La temperatura es: " + valorActual + " grados.");

        return valorActual;
    }
}
