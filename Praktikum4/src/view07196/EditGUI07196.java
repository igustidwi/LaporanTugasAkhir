
package view07196;

import entity07196.PekerjaanEntity07196;
import entity07196.PegawaiEntity07196;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class EditGUI07196 {

    JFrame edit = new JFrame();
    JButton ubah;
    JLabel top, labelpassword;
    JTextField textpassword;

    public EditGUI07196(int index) {
        edit.setSize(500, 400);
        edit.setLayout(null);
        edit.getContentPane().setBackground(Color.LIGHT_GRAY);
        top = new JLabel("UPDATE PASSWORD");
        top.setBounds(40, 10, 500, 50);
        top.setFont(new Font("Times New Roman", Font.BOLD, 40));
        edit.add(top);

        labelpassword = new JLabel("Password Baru");
        labelpassword.setBounds(140, 130, 100, 30);
        edit.add(labelpassword);

        textpassword = new JPasswordField();
        textpassword.setBounds(140, 180, 200, 30);
        edit.add(textpassword);

        ubah = new JButton("Edit");
        ubah.setBounds(190, 220, 100, 40);
        ubah.setBackground(Color.YELLOW);
        edit.add(ubah);

        edit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        edit.setVisible(true);
        edit.setLocationRelativeTo(null);
        
        

        ubah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    String newpass = textpassword.getText();
                    AllObjectctrl07196.pegawai.showDaftarkerja(index).getPegawai().setPassword(newpass);
                    JOptionPane.showMessageDialog(null, "Input Sukses", "Information", JOptionPane.INFORMATION_MESSAGE);
                    edit.dispose();
                    AtasanGUI07196 PenjualGUI = new AtasanGUI07196();
                } catch (Exception exception) {

                    JOptionPane.showMessageDialog(null, "Format Salah", "Information", JOptionPane.INFORMATION_MESSAGE);

                }
            }
        });
    }
}
