import javax.swing.*;
import java.awt.*;


public class calculadora {
    //se declara la clase calculadora con sus campos
    private JFrame frame; //ventana
    private JTextField num1Field;
    private JTextField num2Field;
    private JLabel resultLabel;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> { //asegura la cracion
            try {
                calculadora window = new calculadora();
                window.frame.setVisible(true);//hace visible la calculador
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public calculadora() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setTitle("Calculadora ");
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        ImageIcon icon = new ImageIcon("img.pmg");
        JLabel iconLabel = new JLabel(icon);
        iconLabel.setBounds(10, 10, 50, 50);
        frame.getContentPane().add(iconLabel);

        JLabel lblNum1 = new JLabel("Nombre 1:");
        lblNum1.setFont(new Font("Serif", Font.BOLD, 16));
        lblNum1.setForeground(Color.BLUE);
        lblNum1.setBounds(70, 30, 80, 25);
        frame.getContentPane().add(lblNum1);

        num1Field = new JTextField();
        num1Field.setBounds(160, 30, 200, 25);
        frame.getContentPane().add(num1Field);
        num1Field.setColumns(10);

        JLabel lblNum2 = new JLabel("Nombre 2:");
        lblNum2.setFont(new Font("Serif", Font.BOLD, 16));
        lblNum2.setForeground(Color.RED);
        lblNum2.setBounds(70, 70, 80, 25);
        frame.getContentPane().add(lblNum2);

        num2Field = new JTextField();
        num2Field.setBounds(160, 70, 200, 25);
        frame.getContentPane().add(num2Field);
        num2Field.setColumns(10);

        JLabel lblResult = new JLabel("Resultat:");
        lblResult.setFont(new Font("Serif", Font.BOLD, 16));
        lblResult.setForeground(Color.GREEN);
        lblResult.setBounds(70, 110, 80, 25);
        frame.getContentPane().add(lblResult);

        resultLabel = new JLabel("");
        resultLabel.setFont(new Font("Serif", Font.BOLD, 16));
        resultLabel.setBounds(160, 110, 200, 25);
        frame.getContentPane().add(resultLabel);


        JButton btnSumar = new JButton("+");
        btnSumar.setFont(new Font("Serif", Font.BOLD, 16));
        btnSumar.setBounds(70, 150, 50, 25);
        frame.getContentPane().add(btnSumar);
        btnSumar.addActionListener(e -> calcular("+"));

        JButton btnRestar = new JButton("-");
        btnRestar.setFont(new Font("Serif", Font.BOLD, 16));
        btnRestar.setBounds(130, 150, 50, 25);
        frame.getContentPane().add(btnRestar);
        btnRestar.addActionListener(e -> calcular("-"));

        JButton btnMultiplicar = new JButton("*");
        btnMultiplicar.setFont(new Font("Serif", Font.BOLD, 16));
        btnMultiplicar.setBounds(190, 150, 50, 25);
        frame.getContentPane().add(btnMultiplicar);
        btnMultiplicar.addActionListener(e -> calcular("*"));

        JButton btnDividir = new JButton("/");
        btnDividir.setFont(new Font("Serif", Font.BOLD, 16));
        btnDividir.setBounds(250, 150, 50, 25);
        frame.getContentPane().add(btnDividir);
        btnDividir.addActionListener(e -> calcular("/"));


        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        JMenu mnQuantA = new JMenu("Quant a...");
        menuBar.add(mnQuantA);

        JMenuItem mntmCreador = new JMenuItem("Creador");
        mnQuantA.add(mntmCreador);
        mntmCreador.addActionListener(e -> mostrarInfoCreador());
    }

    private void calcular(String operacio) {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double resultat = 0;

            switch (operacio) {
                case "+":
                    resultat = num1 + num2;
                    break;
                case "-":
                    resultat = num1 - num2;
                    break;
                case "*":
                    resultat = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        throw new ArithmeticException("Divisió per zero no permesa");
                    }
                    resultat = num1 / num2;
                    break;
            }
            resultLabel.setText(String.valueOf(resultat));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Si us plau, introdueix nombres vàlids", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(frame, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void mostrarInfoCreador() {
        String info = "Creador:\n" +
                "Nom: Iñaki\n" +
                "Cognoms: Borrego Bau\n" +
                "1 D.A.W Programacion";
        JOptionPane.showMessageDialog(frame, info, "Quant a...", JOptionPane.INFORMATION_MESSAGE);
    }
}
