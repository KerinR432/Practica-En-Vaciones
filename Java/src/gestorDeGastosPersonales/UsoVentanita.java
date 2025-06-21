package src.gestorDeGastosPersonales;

public class UsoVentanita {
    public static void main(String[] args) {
        VentanitaPrincipal v1 = new VentanitaPrincipal();
        VentanitaIngresos v2 = new VentanitaIngresos();
        VentanitaAnalisis v3 = new VentanitaAnalisis();

        v1.setVentanaIngreso(v2);
        v1.setVentanaAnalisis(v3);

        v2.setVentanaPrincipal(v1);
        v3.setVentanaPrincipal(v1);

        v1.setVisible(true);
    }
}
