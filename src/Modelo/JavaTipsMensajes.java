package Modelo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaTipsMensajes implements ActionListener {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("JavaTipsMensajes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JButton button1 = createButton("Bot�n 1", "Este es el Tip del Bot�n 1");
        JButton button2 = createButton("Bot�n 2", "Este es el Tip del Bot�n 2");
        JButton button3 = createButton("Bot�n 3", "Este es el Tip del Bot�n 3");

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        frame.getContentPane().add(panel);

        frame.setSize(300, 200);

        frame.setVisible(true);
    }

    private static JButton createButton(String text, String toolTip) {
        JButton button = new JButton(text);
        button.setToolTipText(toolTip);
        button.addActionListener(new JavaTipsMensajes());
        return button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	
    	JButton source = (JButton) e.getSource();
        
        System.out.println("Bot�n pulsado: "+source.getText());
        
        JOptionPane.showMessageDialog(null, "Has pulsado el bot�n: " + source.getText(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
    }
}

