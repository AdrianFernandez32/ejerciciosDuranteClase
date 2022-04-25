package Interfaz;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame MainFrame = new JFrame("Mi primer GUI");
        MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainFrame.setSize(300, 300);

        JLabel Texto1 = new JLabel("Hola mundo c:");
        Texto1.setBounds(10, 10, 1000, 20);

        JTextField Nombre = new JTextField("Escribe tu nombre");
        Nombre.setBounds(10, 20, 200, 20);

        JButton boton1 = new JButton("Saludar");
        boton1.setBounds(10, 30, 80, 20);
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Texto1.setText("Hola " + Nombre.getText());
            }
        });
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        JLabel textt = new JLabel("Si bueno hola");
        textt.setBounds(10, 40, 80, 20);

        JTextField frase1 = new JTextField("Escribe algo");
        frase1.setBounds(10, 50, 200, 20);

        JTextField frase2 = new JTextField("Escribe otra cosa");
        frase2.setBounds(10, 60, 200, 20);

        JButton botonP = new JButton("Fusión");
        botonP.setBounds(10, 70, 200, 10);
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                textt.setText(frase1.getText() + frase2.getText());
            }
        });

        MainFrame.add(Texto1);
        MainFrame.add(Nombre);
        MainFrame.add(boton1);
        MainFrame.setLayout(null);
        MainFrame.setVisible(true);

        MainFrame.add(textt);
        MainFrame.add(frase1);
        MainFrame.add(frase2);
        MainFrame.add(botonP);
        MainFrame.setLayout(null);
        MainFrame.setVisible(true);
    }

}
