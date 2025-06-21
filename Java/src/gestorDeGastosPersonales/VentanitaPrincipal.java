package src.gestorDeGastosPersonales;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanitaPrincipal extends JFrame implements ActionListener {

    JPanel panel;
    JLabel etq1;
    JButton btoIngreso,btoAnalisis,btogastos;
    VentanitaIngresos vIngresos;
    VentanitaAnalisis vAnalisis;

    public VentanitaPrincipal(){
        super("Ventana Principal");
        this.setBounds(0,0,450,450);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        constructorPanel();
    }


    public void setVentanaIngreso(VentanitaIngresos vI){
        vIngresos = vI;
    }

    public void setVentanaAnalisis(VentanitaAnalisis vAnalisis){
        this.vAnalisis = vAnalisis;
    }


    private void constructorPanel(){

        panel = new JPanel(new GridLayout(3, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

        btoIngreso = new JButton("Ingresar Dinero");
        btoIngreso.setFont(new Font("Arial",Font.BOLD,14));
        panel.add(btoIngreso,BorderLayout.NORTH);
        btoIngreso.addActionListener(this);

        btoAnalisis = new JButton("Analisis");
        btoAnalisis.setFont(new Font("Arial",Font.BOLD,14));
        panel.add(btoAnalisis,BorderLayout.CENTER);
        btoAnalisis.addActionListener(this);

        btogastos = new JButton("Gastos de semana");
        btogastos.setFont(new Font("Arial",Font.BOLD,14));
        panel.add(btogastos,BorderLayout.SOUTH);

        this.add(panel);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
            if (e.getSource() == btoIngreso){
                this.setVisible(false);
                vIngresos.setVisible(true);
            }else if (e.getSource()==btoAnalisis){
                this.setVisible(false);
                vAnalisis.setVisible(true);
            }
    }

}
