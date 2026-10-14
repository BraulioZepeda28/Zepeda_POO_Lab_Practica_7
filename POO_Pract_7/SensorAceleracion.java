public class SensorAceleracion extends Sensor {

    private double valorEjeX;
    private double valorEjeY;
    private double valorEjeZ;

    public SensorAceleracion(String modelo, String fabricante,double consumoEnergia, boolean encendido, String unidadMedida, boolean estaCalibrado) {

        super(modelo, fabricante, consumoEnergia, encendido, unidadMedida, estaCalibrado);

        valorEjeX = 0.0;
        valorEjeY = 0.0;
        valorEjeZ = 0.0;
    }

    @Override
    public double leerValor() {
        System.out.println("Leyendo aceleracion.");

        double numeroAleatorioX = Math.random();
        double numeroAleatorioY = Math.random();
        double numeroAleatorioZ = Math.random();

        valorEjeX = numeroAleatorioX * 20.0 - 10.0;
        valorEjeY = numeroAleatorioY * 20.0 - 10.0;
        valorEjeZ = numeroAleatorioZ * 20.0 - 10.0;

        System.out.println("Lectura del eje X: " + valorEjeX);
        System.out.println("Lectura del eje Y: " + valorEjeY);
        System.out.println("Lectura del eje Z: " + valorEjeZ);

        double ejeXAlCuadrado = valorEjeX * valorEjeX;
        double ejeYAlCuadrado = valorEjeY * valorEjeY;
        double ejeZAlCuadrado = valorEjeZ * valorEjeZ;

        double suma = ejeXAlCuadrado + ejeYAlCuadrado + ejeZAlCuadrado;

        double magnitud = Math.sqrt(suma);

        System.out.println("La magnitud es: " + magnitud);

        return magnitud;
    }
}
