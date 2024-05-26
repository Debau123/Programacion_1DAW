import javax.swing.*;
import java.awt.*;

public class formulario extends JFrame {

    public formulario() {
        setTitle("Formulario de datos Personales");
        setSize(600, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(16, 2, 10, 10));


        formPanel.add(new JLabel("Nombre:"));
        JTextField nombre = new JTextField();
        formPanel.add(nombre);

        formPanel.add(new JLabel("Apellidos:"));
        JTextField apellidos = new JTextField();
        formPanel.add(apellidos);

        formPanel.add(new JLabel("Dirección:"));
        JTextField direccion = new JTextField();
        formPanel.add(direccion);

        formPanel.add(new JLabel("Móvil:"));
        JTextField movil = new JTextField();
        formPanel.add(movil);

        formPanel.add(new JLabel("DNI:"));
        JTextField dni = new JTextField();
        formPanel.add(dni);

        formPanel.add(new JLabel("Código Postal:"));
        JTextField codigoPostal = new JTextField();
        formPanel.add(codigoPostal);

        formPanel.add(new JLabel("Población:"));
        JTextField poblacion = new JTextField();
        formPanel.add(poblacion);

        formPanel.add(new JLabel("Correo Electrónico:"));
        JTextField email = new JTextField();
        formPanel.add(email);

        formPanel.add(new JLabel("Contraseña:"));
        JPasswordField contrasena = new JPasswordField();
        formPanel.add(contrasena);

        formPanel.add(new JLabel("Província:"));
        String[] provinces = {"València", "Alicante", "Castellón", "Almería", "Murcia", "Madrid", "Barcelona", "Ourense", "Burgos", "Sevilla"};
        JComboBox<String> provincia = new JComboBox<>(provinces);
        formPanel.add(provincia);

        formPanel.add(new JLabel("País:"));
        String[] countries = {"España", "Cuba", "Israel", "Ucrania", "Rusia", "Palestina"};
        JComboBox<String> paises = new JComboBox<>(countries);
        formPanel.add(paises);

        formPanel.add(new JLabel("Sexo:"));
        String[] sexes = {"Hombre", "Mujer", "Otros"};
        JComboBox<String> sexo = new JComboBox<>(sexes);
        formPanel.add(sexo);

        formPanel.add(new JLabel("Idiomas:"));
        JPanel idiomasPanel = new JPanel();
        idiomasPanel.setLayout(new GridLayout(0, 1));
        JCheckBox español = new JCheckBox("Español");
        JCheckBox italiano = new JCheckBox("Italiano");
        JCheckBox aleman = new JCheckBox("Alemán");
        JCheckBox ingles = new JCheckBox("Inglés");
        JCheckBox frances = new JCheckBox("Francés");
        JCheckBox otro = new JCheckBox("Otro");
        idiomasPanel.add(español);
        idiomasPanel.add(italiano);
        idiomasPanel.add(aleman);
        idiomasPanel.add(ingles);
        idiomasPanel.add(frances);
        idiomasPanel.add(otro);
        JScrollPane idiomasScroll = new JScrollPane(idiomasPanel);
        formPanel.add(idiomasScroll);

        formPanel.add(new JLabel("Presentación:"));
        JTextArea presentaciones = new JTextArea(10, 20);
        presentaciones.setLineWrap(true);
        presentaciones.setWrapStyleWord(true);
        JScrollPane presentacion = new JScrollPane(presentaciones, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        formPanel.add(presentacion);

        JButton submitButton = new JButton("Aceptar");
        formPanel.add(submitButton);

        panel.add(formPanel, BorderLayout.CENTER);
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new formulario();
    }
}
