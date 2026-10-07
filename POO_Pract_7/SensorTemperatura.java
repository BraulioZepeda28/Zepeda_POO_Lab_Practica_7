public class SensorTemperatura extends Sensor {

    private double valorActual;
    //En el constructor tiene lo que tiene el sensor y por lo tanto tambien lo de dispositico electronicos.
    public SensorTemperatura(String modelo, String fabricante, double consumoEnergia, boolean encendido,String unidadMedida, boolean estaCalibrado) {
        super(modelo, fabricante,  consumoEnergia, encendido,unidadMedida, estaCalibrado);
        valorActual = 0.0;
    }





    //eL override esta porque es aquel metodo abstracto que tuvo del sensor pero ya le dio uso.
    @Override
    public double leerValor() {
        System.out.println("Leyendo temperatura");
        double valorMinimo = 20.0;
        double valorMaximo = 35.0;
        double numeroAleatorio = Math.random();
        double diferencia = valorMaximo - valorMinimo;
        valorActual = valorMinimo + (numeroAleatorio * diferencia);
        System.out.println("La temperatura actual es: " + valorActual + " " + "grados");
        return valorActual;
    }

}
