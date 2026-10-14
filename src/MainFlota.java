import java.util.Locale;

public class MainFlota {
    public static void main(String[] args) {
        Vehiculo[] flota = new Vehiculo[3];

        flota[0] = new Camion("AA123BB", "Scania", 450.8771929824561, 18.0);
        flota[1] = new Furgoneta("AF456CD", "Mercedes-Benz", 416.6666666666667, true);
        flota[2] = new MotoEnvios("A099XYZ", "Honda", 180.0);

        double costoTotal = 0;
        double distanciaKm = 150.0;

        System.out.println("=== Reporte de Operaciones de Flota ===");

        for (Vehiculo vehiculo : flota) {
            vehiculo.mostrarFicha();
            double costoViaje = vehiculo.calcularCostoViaje(distanciaKm);
            System.out.printf(Locale.US, "Costo de viaje (%.1f km): $%.1f%n", distanciaKm, costoViaje);
            costoTotal += costoViaje;
            System.out.println("--------------------------------------------------");
        }

        System.out.printf(Locale.US, "Costo total operativo de la flota: $%.1f%n", costoTotal);
    }
}