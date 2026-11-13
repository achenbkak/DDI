import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

public class Nintendo {
    public static void main(String[] args) {
        JFrame a = new JFrame("Ventana");
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setSize(600, 800);
        a.setLayout(new BorderLayout());
        JPanel panel = new JPanel(new GridBagLayout());
        titulo titulo = new titulo();
        panel.add(titulo);
        panelBotones pB = new panelBotones();
        panelBotones pB2 = new panelBotones();
        panelPantalla pP = new panelPantalla();
        JPanel centro = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridy = 0;
        gbc.weighty = 1.0;

        // Teclado numérico: 66 %
        gbc.gridx = 0;
        gbc.weightx = 0.165;
        gbc.insets = new Insets(0, 0, 0, 10);
        centro.add(pB, gbc);

        // Operadores: 33 %
        gbc.gridx = 1;
        gbc.weightx = 0.67;
        gbc.insets = new Insets(0, 0, 0, 0);
        centro.add(pP, gbc);

        gbc.gridx = 2;
        gbc.weightx = 0.165;
        gbc.insets = new Insets(0, 0, 0, 0);
        centro.add(pB2, gbc);

        a.add(centro, BorderLayout.CENTER);

        panelOpciones pO = new panelOpciones();
        a.add(pO, BorderLayout.SOUTH);

        a.setLocationRelativeTo(null);
        a.setVisible(true);
    }
}
