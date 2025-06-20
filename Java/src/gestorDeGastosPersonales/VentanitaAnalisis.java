package src.gestorDeGastosPersonales;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanitaAnalisis extends JFrame implements ActionListener {

    JPanel panel;
    JLabel etq1,etq2;
    JButton btoAnalisis,btoGenerarCvs,btovolver;
    public VentanitaAnalisis(){
        super("Ventana Analisis");
        this.setBounds(0,0,450,450);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        constructorPanel();
        this.setVisible(true);

    }

    public void constructorPanel(){
        panel = new JPanel(new BorderLayout());

        panel.setBackground(Color.GRAY);
        panel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));

        etq1 = new JLabel("Analisis de tu Ingresos y gastos");
        etq1.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(etq1);
        etq1.setFont(new Font("Time new Roman",Font.BOLD,25));

        etq2 = new JLabel(" ");
        etq2.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(etq2);
        etq2.setFont(new Font("Time new Roman",Font.BOLD,14));


    }


    public void actionPerformed(ActionEvent e) {

    }
}
