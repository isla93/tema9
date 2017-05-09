package tema_10EjerClase;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;

public class DatosClientes extends JFrame {

    private JLabel jlbDNI, jlbNombre, jlbApellido, jlbDirec, jlbLoc, jlbProv,
            jlbTlf, jlbEdad;
    private JTextField jtxtDNI, jtxtNombre, jtxtApellido, jtxtDirec, jtxtLoc,
            jtxtProv, jtxtTlf, jtxtEdad;
    private JButton jbtnPrimero, jbtnAnterior, jbtnSiguiente, jbtnUltimo,
            jbtnNuevo, jbtnAlta, jbtnBaja, jbtnModificar;
    private JPanel jpPanel;
    private ImageIcon iconoGeneral, iconoPrimero, iconoAnterior, iconoSiguiente,
            iconoUltimo;
    private ClienteColeccionDAO<Cliente> lista;
    public DatosClientes() {
        super("Datos Cliente");
        inicializar();
        meteElementos();
        crearOyentes();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void inicializar() {
        iconoGeneral = new ImageIcon(getClass().getResource("/tema_10EjerClase/bomb.png"));
        iconoPrimero = new ImageIcon(getClass().getResource("/tema_10EjerClase/application_side_contract.png"));
        iconoAnterior = new ImageIcon(getClass().getResource("/tema_10EjerClase/arrow_left.png"));
        iconoSiguiente = new ImageIcon(getClass().getResource("/tema_10EjerClase/arrow_right.png"));
        iconoUltimo = new ImageIcon(getClass().getResource("/tema_10EjerClase/application_side_expand.png"));
        jbtnPrimero = new JButton();
        jbtnPrimero.setIcon(iconoPrimero);
        jbtnAnterior = new JButton();
        jbtnAnterior.setIcon(iconoAnterior);
        jbtnSiguiente = new JButton();
        jbtnSiguiente.setIcon(iconoSiguiente);
        jbtnUltimo = new JButton();
        jbtnUltimo.setIcon(iconoUltimo);
        jlbDNI = new JLabel("DNI");
        jlbNombre = new JLabel("Nombre");
        jlbApellido = new JLabel("Apellido");
        jlbDirec = new JLabel("Dirección");
        jlbLoc = new JLabel("Localidad");
        jlbProv = new JLabel("Provincia");
        jlbTlf = new JLabel("Teléfono");
        jlbEdad = new JLabel("Edad");
        jtxtDNI = new JTextField(15);
        jtxtNombre = new JTextField(15);
        jtxtApellido = new JTextField(15);
        jtxtDirec = new JTextField(15);
        jtxtLoc = new JTextField(15);
        jtxtProv = new JTextField(15);
        jtxtTlf = new JTextField(15);
        jtxtEdad = new JTextField(15);
        jbtnNuevo = new JButton("Nuevo");
        jbtnAlta = new JButton("Alta");
        jbtnBaja = new JButton("Baja");
        jbtnModificar = new JButton("Modificar");
        jpPanel = new JPanel(new GridLayout(6, 4));
    }

    private void meteElementos() {
        this.add(jpPanel);
        jpPanel.add(jbtnPrimero);
        jpPanel.add(jbtnAnterior);
        jpPanel.add(jbtnSiguiente);
        jpPanel.add(jbtnUltimo);
        jpPanel.add(jlbDNI);
        jpPanel.add(jtxtDNI);
        jpPanel.add(jlbNombre);
        jpPanel.add(jtxtNombre);
        jpPanel.add(jlbApellido);
        jpPanel.add(jtxtApellido);
        jpPanel.add(jlbDirec);
        jpPanel.add(jtxtDirec);
        jpPanel.add(jlbLoc);
        jpPanel.add(jtxtLoc);
        jpPanel.add(jlbProv);
        jpPanel.add(jtxtProv);
        jpPanel.add(jlbTlf);
        jpPanel.add(jtxtTlf);
        jpPanel.add(jlbEdad);
        jpPanel.add(jtxtEdad);
        jpPanel.add(jbtnNuevo);
        jpPanel.add(jbtnAlta);
        jpPanel.add(jbtnBaja);
        jpPanel.add(jbtnModificar);
        this.pack();
    }

    private void crearOyentes() {
        jbtnNuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickBotonNuevo();
            }
        });
        jbtnAlta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickBotonAlta();
            }
        });
        jbtnBaja.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickBotonBaja();
            }
        });
        jbtnModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickBotonModificar();
            }
        });
    }

    private void clickBotonNuevo() {
        jtxtDNI.setText("");
        jtxtNombre.setText("");
        jtxtApellido.setText("");
        jtxtDirec.setText("");
        jtxtLoc.setText("");
        jtxtProv.setText("");
        jtxtTlf.setText("");
        jtxtEdad.setText("");
    }

    private void clickBotonAlta() {
        
        
        JOptionPane.showMessageDialog(this, "Alta realizada", "Alta", JOptionPane.INFORMATION_MESSAGE);

    }

    private void clickBotonBaja() {
        
        JOptionPane.showMessageDialog(this, "Baja realizada", "Baja", JOptionPane.INFORMATION_MESSAGE);

    }

    private void clickBotonModificar() {
        JOptionPane.showMessageDialog(this, "Modificar realizada", "Modificar", JOptionPane.INFORMATION_MESSAGE);

    }
    private Cliente rellenar(){
        try{
            Cliente cli= new Cliente();
            cli.setDNI(jtxtDNI.getText());
            cli.setNombre(jtxtNombre.getText());
            cli.setDireccion(jtxtDirec.getText());
            cli.setEdad(jtxtEdad.getText());
            cli.setLocalidad(jtxtLoc.getText());
            cli.setProvincia(jtxtLoc);
        }
        catch()
    }
}