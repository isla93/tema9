package tema10prac1;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import tema10prac1.LinkedHashSetDAO;
/**
 *
 * @author Vespertino
 */
public class DatosCLiente extends JFrame {
    private LinkedHashSetDAO<Cliente> lista;
    private JButton jbtn1, jbtn2, jbtn3, jbtn4, jbtnNuevo, jbtnAlta, jbtnBaja, jbtnModificar;
    private JLabel jlbDNI, jlbNombre, jlbApellido, jlbDireccion, jlbLocalizacion, jlbProvincia, jlbTelefono, jlbEdad;
    private JTextField jtxtDNI, jtxtNombre, jtxtApellido, jtxtDirecicon, jtxtLocalizacion, jtxtProvincia, jtxtTelefono,jtxtEdad;
    private ImageIcon image1, image2, image3, image4;
    private JPanel jpPanel;

    public DatosCLiente() {
        super("Datos cliente ...");
        lista = new LinkedHashSetDAO();
        
        inicializar();
        meteElementos();
        establecerOyentes();
        
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Presentar el primero
        presentar((Cliente) lista.primero());
    }

    private void inicializar() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/tema10prac1/book_edit.png")));
//        new ImageIcon(getClass().getResource("/tema10/book_edit.png")));
        jbtn1 = new JButton();
        jbtn1.setIcon(new ImageIcon(getClass().getResource("/tema10prac1/application_side_contract.png")));

        jbtn2 = new JButton();
        jbtn2.setIcon(new ImageIcon(getClass().getResource("/tema10prac1/arrow_left.png")));

        jbtn3 = new JButton();
        jbtn3.setIcon(new ImageIcon(getClass().getResource("/tema10prac1/arrow_right.png")));

        jbtn4 = new JButton();
        jbtn4.setIcon(new ImageIcon(getClass().getResource("/tema10prac1/application_side_expand.png")));

        jlbDNI = new JLabel("DNI");
        jtxtDNI = new JTextField(10);

        jlbNombre = new JLabel("Nombre");
        jtxtNombre = new JTextField();

        jlbApellido = new JLabel("Apellido");
        jtxtApellido = new JTextField("");

        jlbDireccion = new JLabel("Direccion");
        jtxtDirecicon = new JTextField("");

        jlbLocalizacion = new JLabel("Localizacion");
        jtxtLocalizacion = new JTextField("");

        jlbProvincia = new JLabel("Provincia");
        jtxtProvincia = new JTextField("");

        jlbTelefono = new JLabel("Telefono");
        jtxtTelefono = new JTextField("");

        jlbEdad = new JLabel("Edad");
        jtxtEdad = new JTextField("");
        
        jtxtTelefono = new JTextField("");

        jbtnNuevo = new JButton("Nuevo");

        jbtnAlta = new JButton("Alta");

        jbtnBaja = new JButton("Baja");

        jbtnModificar = new JButton("Modificar");

        jpPanel = new JPanel(new GridLayout(6, 4, 5, 5));
    }
    
    private void meteElementos() {
        this.add(jpPanel);
        jpPanel.add(jbtn1);
        jpPanel.add(jbtn2);
        jpPanel.add(jbtn3);
        jpPanel.add(jbtn4);
        jpPanel.add(jlbDNI);
        jpPanel.add(jtxtDNI);
        jpPanel.add(jlbNombre);
        jpPanel.add(jtxtNombre);
        jpPanel.add(jlbApellido);
        jpPanel.add(jtxtApellido);
        jpPanel.add(jlbDireccion);
        jpPanel.add(jtxtDirecicon);
        jpPanel.add(jlbLocalizacion);
        jpPanel.add(jtxtLocalizacion);
        jpPanel.add(jlbProvincia);
        jpPanel.add(jtxtProvincia);
        jpPanel.add(jlbTelefono);
        jpPanel.add(jtxtTelefono);
        jpPanel.add(jlbEdad);
        jpPanel.add(jtxtEdad);
        jpPanel.add(jbtnNuevo);
        jpPanel.add(jbtnAlta);
        jpPanel.add(jbtnBaja);
        jpPanel.add(jbtnModificar);
        this.pack();
    }

    private void establecerOyentes() {
        jbtnNuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Creamos un metodo a parte
                clickBoton(e);
            }

        });

        jbtnAlta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Creamos un metodo a parte
                clickBoton(e);
            }

        });
        jbtnBaja.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Creamos un metodo a parte
                clickBoton(e);
            }
        });

        jbtnModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Creamos un metodo a parte
                clickBoton(e);
            }
        });

        jbtn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Creamos un metodo a parte
                clickBoton(e);
            }
        });

        jbtn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Creamos un metodo a parte
                clickBoton(e);
            }
        });

        jbtn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Creamos un metodo a parte
                clickBoton(e);
            }
        });

        jbtn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Creamos un metodo a parte
                clickBoton(e);
            }
        });

    }

    private void clickBoton(ActionEvent e) {
        if (e.getSource() == jbtnNuevo) {
            jtxtDNI.setText("0");
            jtxtNombre.setText("");
            jtxtApellido.setText("");
            jtxtDirecicon.setText("");
            jtxtLocalizacion.setText("");
            jtxtProvincia.setText("");
            jtxtTelefono.setText("0");
            jtxtEdad.setText("");

        }
        if (e.getSource() == jbtnBaja) {
            Cliente aux = new Cliente();
            aux.setDni(Integer.parseInt(jtxtDNI.getText()));
            lista.baja(aux);
            JOptionPane.showMessageDialog(this, "Baja realizada!!!");
        }
        if (e.getSource() == jbtnModificar) {
            Cliente v = new Cliente();
            v.setDni(Integer.parseInt(jtxtDNI.getText()));
            Cliente aux = rellenar();            
            lista.modificacion(v, aux);
            JOptionPane.showMessageDialog(this, "Modificacion realizada!!!");
        }

        if (e.getSource() == jbtnAlta) {
            Cliente aux = rellenar();
            if(aux!=null) // Si no hay error realizo el alta
            {
                lista.alta(aux);
                JOptionPane.showMessageDialog(this, "Alta realizada!!!");
            } 
        }

        if (e.getSource() == jbtn1) {
            Cliente aux = new Cliente();
            presentar((Cliente) lista.primero());
        }

        if (e.getSource() == jbtn2) {
            Cliente aux = new Cliente();
            aux.setDni(Integer.parseInt(jtxtDNI.getText()));
            presentar((Cliente) lista.anterior(aux));
        }

        if (e.getSource() == jbtn3) {
            Cliente aux = new Cliente();
            aux.setDni(Integer.parseInt(jtxtDNI.getText()));
            presentar((Cliente) lista.siguiente(aux));
        }

        if (e.getSource() == jbtn4) {
            Cliente aux = new Cliente();
            presentar((Cliente) lista.ultimo());
        }

    }
    
    private void presentar(Cliente aux) {
        try {
        jtxtDNI.setText(aux.getDni() + "");
        jtxtApellido.setText(aux.getApellido());
        jtxtDirecicon.setText(aux.getDireccion());        
        jtxtLocalizacion.setText(aux.getLocalizacion());
        jtxtNombre.setText(aux.getNombre());
        jtxtProvincia.setText(aux.getProvincia());
        jtxtTelefono.setText(aux.getTelefono() + "");
        jtxtEdad.setText(aux.getEdad());
        } 
        catch (Exception e) 
        {
        }
    }
    private Cliente rellenar() {
        
        try {
            Cliente aux = new Cliente();
            aux.setDni(Integer.parseInt(jtxtDNI.getText()));
            aux.setNombre(jtxtNombre.getText());
            aux.setApellido(jtxtApellido.getText());
            aux.setDireccion(jtxtDirecicon.getText());
            aux.setEdad(jtxtEdad.getText());
            aux.setLocalizacion(jtxtLocalizacion.getText());
            aux.setProvincia(jtxtProvincia.getText());
            aux.setTelefono(Integer.parseInt(jtxtTelefono.getText()));
            return aux;
        } catch (NumberFormatException e) {            
            JOptionPane.showMessageDialog(this, "Los campos numericos (telefono, dni) no pueden quedarse en blanco");
            return null;
        }
    }
}