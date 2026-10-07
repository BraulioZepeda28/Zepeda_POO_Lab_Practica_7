public abstract class Sensor extends DispositivoElectronico {

    private String unidadMedida;
    private boolean estaCalibrado;








    //El super tendra lo que pedi del dispositivo electronico
    public Sensor(String modelo, String fabricante, double consumoEnergia, boolean encendido, String unidadMedida, boolean estaCalibrado) {
        super(modelo, fabricante, consumoEnergia, encendido);
        this.unidadMedida = unidadMedida;
        this.estaCalibrado = estaCalibrado;
    }








    public void calibrar() {
        System.out.println("El sensor se esta calibrando.");
        estaCalibrado = true;
        System.out.println("El sensor ya esta calibrado.");
    }












    //El abtract es para el uso del que se va a especializar
    public abstract double leerValor();
}
