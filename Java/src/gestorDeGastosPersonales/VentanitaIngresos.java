package src.gestorDeGastosPersonales;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanitaIngresos extends JFrame implements ActionListener {
    JPanel panel;
    JLabel etq1;
    JTextField campo1;
    JButton btoIngresar,btoEliminar,btoVolver;
    VentanitaPrincipal vPrincipal;

    public VentanitaIngresos(){
        super("Ingresos");
        this.setBounds(0,0,450,450);
        this.setBackground(Color.CYAN);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        constructorPanel();
    }

    public void setVentanaPrincipal(VentanitaPrincipal vP){
        vPrincipal = vP;
    }

    private void constructorPanel(){
        panel = new JPanel();
        panel.setBackground(Color.CYAN);
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));


        etq1 = new JLabel("Aqui puedes Ingresar tu dinero");
        etq1.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(etq1);
        etq1.setFont(new Font("time new roman",Font.BOLD,14));

        campo1 = new JTextField(10);
        campo1.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(campo1);

        panel.add(Box.createRigidArea(new Dimension(0,20)));

        JPanel panelBto = new JPanel();
        panelBto.setLayout(new FlowLayout(FlowLayout.CENTER,10,0));

        btoIngresar = new JButton("Ingresa");
        panelBto.add(btoIngresar);
        btoIngresar.setFont(new Font("Arial",Font.BOLD,14));

        btoEliminar = new JButton("Limpiar");
        btoEliminar.setFont(new Font("Arial",Font.BOLD,14));
        panelBto.add(btoEliminar);

        btoVolver = new JButton("Volver al inicio");
        btoVolver.setFont(new Font("Arial",Font.BOLD,14));
        panelBto.add(btoVolver);
        btoVolver.addActionListener(this);

        panel.add(panelBto);

        this.add(panel);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btoIngresar){

        }
        if(e.getSource()==btoEliminar){

        }
        if(e.getSource()==btoVolver){
            this.setVisible(false);
            vPrincipal.setVisible(true);
        }
    }
}
