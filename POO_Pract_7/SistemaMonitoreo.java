import java.util.ArrayList;

public class SistemaMonitoreo {

    public static void main(String[] args) {

        ArrayList<Sensor> listaSensores = new ArrayList<>();

        SensorTemperatura temperaturaUno = new SensorTemperatura(
                "DTH11", "Fabricante Temperatura", 2.0,
                false, "grados", false);

        SensorTemperatura temperaturaDos = new SensorTemperatura(
                "DTH22", "Fabricante Temperatura", 2.5,
                false, "grados", false);

        SensorPresion presionUno = new SensorPresion(
                "BMP180", "Fabricante Presion", 1.5,
                false, "hPa", false);

        SensorPresion presionDos = new SensorPresion(
                "BMP280", "Fabricante Presion", 1.8,
                false, "hPa", false);

        SensorAceleracion aceleracionUno = new SensorAceleracion(
                "MPU6050", "Fabricante Aceleracion", 3.0,
                false, "m/s2", false);

        SensorAceleracion aceleracionDos = new SensorAceleracion(
                "ADXL345", "Fabricante Aceleracion", 3.5,
                false, "m/s2", false);

        listaSensores.add(temperaturaUno);
        listaSensores.add(temperaturaDos);
        listaSensores.add(presionUno);
        listaSensores.add(presionDos);
        listaSensores.add(aceleracionUno);
        listaSensores.add(aceleracionDos);

        System.out.println("INICIO DEL SISTEMA DE MONITOREO");
        System.out.println("");

        for (Sensor sensor : listaSensores) {
            System.out.println("Preparando un sensor.");

            sensor.encender();
            sensor.calibrar();

            double lectura = sensor.leerValor();

            System.out.println("Resultado final de la lectura: " + lectura);
            System.out.println("");
        }

        System.out.println("FINALIZADO SISTEMA DE MONITOREO");
    }
}
