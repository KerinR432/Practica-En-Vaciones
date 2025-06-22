package src.gestorDeGastosPersonales;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;

import static java.lang.Integer.parseInt;

public class Ingresos {
    private String fecha;
    private int saldo;
    private String fileCsv;

    public Ingresos(JTextField fecha, JTextField saldo){
        this.fecha = fecha.getText();
        this.saldo = parseInt(saldo.getText());
        this.fileCsv = "datos.csv";
    }

    public boolean esNegativo(){
        if (saldo > 0){
            return true;
        }
        return false;
    }

    public boolean fechaExacta(){
        if (fecha.contains("/")){
            return true;
        }
        return false;
    }

    public void ingresarDatos(){
        try(FileWriter writer = new FileWriter(fileCsv)){
            writer.append(this.fecha);
            writer.append((char) this.saldo);
            writer.append("\n");
            System.out.println("Archivo CSV creado exitosamente: " + fileCsv);


        } catch (IOException e) {
            System.err.println("Error al crear el archivo CSV: " + e.getMessage());
        }
    }


}
