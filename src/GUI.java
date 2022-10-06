import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.BorderFactory;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class GUI implements ActionListener {

    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private int count = 0;

    public GUI(){

        frame = new JFrame();

        JButton button = new JButton("Clique Aqui!");
        button.addActionListener(this);

        label = new JLabel("Número de Clicks: "+ count);

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 10, 50));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Contador de Clicks");
        frame.pack();
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        count++;
        label.setText("Número de Clicks: " +count);

    }
    public static void main(String []args){
        new GUI();
    }


}
