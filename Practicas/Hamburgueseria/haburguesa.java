import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class haburguesa {
    private JFrame frame;
    private JComboBox<String> hamburguesaBox;
    private JComboBox<String> paBox;
    private JComboBox<String> creillesBox;
    private JComboBox<String> begudaBox;
    private JCheckBox dobleHamburguesaCheck;
    private JCheckBox extraFormatgeCheck;
    private JCheckBox extraPatatesCheck;
    private JCheckBox ketchupCheck;
    private JCheckBox barbacoaCheck;
    private JCheckBox mostassaCheck;
    private JCheckBox thaiCheck;
    private JCheckBox repartimentCheck;
    private JLabel totalPreuLabel;
    private JLabel ivaLabel;
    private JLabel pvpLabel;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                haburguesa window = new haburguesa();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public haburguesa() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setTitle("Aplicació de Comandes d'Hamburgueses");
        frame.setBounds(100, 100, 500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblHamburguesa = new JLabel("Hamburguesa:");
        lblHamburguesa.setBounds(30, 30, 120, 25);
        frame.getContentPane().add(lblHamburguesa);

        String[] hamburgueses = {"Pollastre", "Porc", "Vedella (+1 €)", "Vegana (+1 €)"};
        hamburguesaBox = new JComboBox<>(hamburgueses);
        hamburguesaBox.setBounds(160, 30, 150, 25);
        frame.getContentPane().add(hamburguesaBox);

        JLabel lblPa = new JLabel("Pa:");
        lblPa.setBounds(30, 70, 120, 25);
        frame.getContentPane().add(lblPa);

        String[] pans = {"Normal", "Integral", "Sègol"};
        paBox = new JComboBox<>(pans);
        paBox.setBounds(160, 70, 150, 25);
        frame.getContentPane().add(paBox);

        JLabel lblCreilles = new JLabel("Creïlles:");
        lblCreilles.setBounds(30, 110, 120, 25);
        frame.getContentPane().add(lblCreilles);

        String[] creilles = {"Fregides", "Grill", "Casolanes (+1 €)"};
        creillesBox = new JComboBox<>(creilles);
        creillesBox.setBounds(160, 110, 150, 25);
        frame.getContentPane().add(creillesBox);

        JLabel lblBeguda = new JLabel("Beguda:");
        lblBeguda.setBounds(30, 150, 120, 25);
        frame.getContentPane().add(lblBeguda);

        String[] begudes = {"Refresc de Cola", "Refresc de Taronja", "Refresc de Llimó", "Aigua", "Cervesa"};
        begudaBox = new JComboBox<>(begudes);
        begudaBox.setBounds(160, 150, 150, 25);
        frame.getContentPane().add(begudaBox);

        dobleHamburguesaCheck = new JCheckBox("Hamburguesa Doble (+2 €)");
        dobleHamburguesaCheck.setBounds(30, 190, 250, 25);
        frame.getContentPane().add(dobleHamburguesaCheck);

        extraFormatgeCheck = new JCheckBox("Extra de Formatge (+0,50 €)");
        extraFormatgeCheck.setBounds(30, 220, 250, 25);
        frame.getContentPane().add(extraFormatgeCheck);

        extraPatatesCheck = new JCheckBox("Extra de Patates (+1 €)");
        extraPatatesCheck.setBounds(30, 250, 250, 25);
        frame.getContentPane().add(extraPatatesCheck);

        ketchupCheck = new JCheckBox("Ketchup (+0,50 €)");
        ketchupCheck.setBounds(30, 280, 250, 25);
        frame.getContentPane().add(ketchupCheck);

        barbacoaCheck = new JCheckBox("Barbacoa (+0,50 €)");
        barbacoaCheck.setBounds(30, 310, 250, 25);
        frame.getContentPane().add(barbacoaCheck);

        mostassaCheck = new JCheckBox("Mostassa (+0,50 €)");
        mostassaCheck.setBounds(30, 340, 250, 25);
        frame.getContentPane().add(mostassaCheck);

        thaiCheck = new JCheckBox("Thai (+0,50 €)");
        thaiCheck.setBounds(30, 370, 250, 25);
        frame.getContentPane().add(thaiCheck);

        repartimentCheck = new JCheckBox("Repartiment a Domicili");
        repartimentCheck.setBounds(30, 400, 250, 25);
        frame.getContentPane().add(repartimentCheck);

        JButton calcularButton = new JButton("Calcular Preu");
        calcularButton.setBounds(320, 30, 150, 25);
        frame.getContentPane().add(calcularButton);
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularPreu();
            }
        });

        totalPreuLabel = new JLabel("Total: ");
        totalPreuLabel.setBounds(320, 70, 150, 25);
        frame.getContentPane().add(totalPreuLabel);

        ivaLabel = new JLabel("IVA: ");
        ivaLabel.setBounds(320, 110, 150, 25);
        frame.getContentPane().add(ivaLabel);

        pvpLabel = new JLabel("PVP: ");
        pvpLabel.setBounds(320, 150, 150, 25);
        frame.getContentPane().add(pvpLabel);
    }

    private void calcularPreu() {
        double preuBase = 8.0;
        double extraCost = 0.0;

        if (hamburguesaBox.getSelectedIndex() == 2 || hamburguesaBox.getSelectedIndex() == 3) {
            extraCost += 1.0;
        }

        if (creillesBox.getSelectedIndex() == 2) {
            extraCost += 1.0;
        }

        if (dobleHamburguesaCheck.isSelected()) {
            extraCost += 2.0;
        }

        if (extraFormatgeCheck.isSelected()) {
            extraCost += 0.5;
        }

        if (extraPatatesCheck.isSelected()) {
            extraCost += 1.0;
        }

        if (ketchupCheck.isSelected()) {
            extraCost += 0.5;
        }

        if (barbacoaCheck.isSelected()) {
            extraCost += 0.5;
        }

        if (mostassaCheck.isSelected()) {
            extraCost += 0.5;
        }

        if (thaiCheck.isSelected()) {
            extraCost += 0.5;
        }

        double total = preuBase + extraCost;
        double iva = total * 0.21;
        double pvp = total + iva;

        totalPreuLabel.setText(String.format("Total: %.2f €", total));
        ivaLabel.setText(String.format("IVA: %.2f €", iva));
        pvpLabel.setText(String.format("PVP: %.2f €", pvp));
    }
}
