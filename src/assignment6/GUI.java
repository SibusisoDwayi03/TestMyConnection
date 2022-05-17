/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment6;

import java.awt.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class GUI extends Assignment6 {

    public GUI() {
        // public static void main(String[] args) {
        JPanel panel = new JPanel();

        JFrame frame = new JFrame();
        frame.setSize(450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);

        panel.setLayout(null);

        //JList tittle= new JList();
        final JList<String> list1 = new JList<>();
        JList.addElement("ADV");
        JList.addElement("DR");
        JList.addElement("Miss");
        JList.addElement("Mr");
        JList.addElement("Mrs");
        JList.addElement("Prof");

        JLabel label1 = new JLabel("CPUT RESTAURANT");
        label1.setBounds(10, 80, 80, 25);
        panel.add(label1);

        JLabel namelabel = new JLabel("first name");
        namelabel.setBounds(30, 20, 80, 25);
        panel.add(namelabel);

        JTextField firstname = new JTextField(20);
        firstname.setBounds(100, 20, 165, 25);
        panel.add(firstname);

        JLabel last = new JLabel("last name");
        last.setBounds(40, 20, 80, 25);
        panel.add(last);

        JTextField lastname = new JTextField(20);
        lastname.setBounds(150, 20, 165, 25);
        panel.add(lastname);

        frame.setVisible(true);

    }

    public void actionPerfomed(ActionEvent e) {
        String firstname = firstname.getfirstName();
    }

}
