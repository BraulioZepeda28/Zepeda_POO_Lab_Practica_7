public class DispositivoElectronico {






    private String modelo;
    private String fabricante;
    private double consumoEnergia;
    private boolean encendido;








    public DispositivoElectronico(String modelo, String fabricante,double consumoEnergia, boolean encendido) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.consumoEnergia = consumoEnergia;
        this.encendido = encendido;
    }





    

    public void encender() {
        System.out.println("El dispositivo " + modelo + " se esta encendiendo.");
        encendido = true;
    }










    public void apagar() {
        System.out.println("El dispositivo " + modelo + " se esta apagando.");
        encendido = false;
    }














    public String obtenerEstado() {
        String estado;
        if (encendido == true) {
            estado = "encendido";
        } else {
            estado = "apagado";
        }
        return "Modelo: " + modelo + ", Fabricante: " + fabricante + ", Consumo de energia: " + consumoEnergia + " W" + ", Estado: " + estado;
    }









}
