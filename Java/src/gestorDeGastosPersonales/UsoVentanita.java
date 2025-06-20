package src.gestorDeGastosPersonales;

public class UsoVentanita {
    public static void main(String[] args) {
        VentanitaPrincipal v1 = new VentanitaPrincipal();

        VentanitaIngresos v2 = new VentanitaIngresos();

        v1.setVentanaIngreso(v2);
        v2.setVentanaPrincipal(v1);
    }
}
