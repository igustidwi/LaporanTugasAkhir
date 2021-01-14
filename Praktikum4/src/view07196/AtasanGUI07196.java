
package view07196;

import Controller07196.PegawaiController07196;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class AtasanGUI07196 {

    private static PegawaiController07196 pegawai = new PegawaiController07196();
    JFrame Atasan = new JFrame();
    JTable tabelpegawai = new JTable();
    JScrollPane scrollatasan = new JScrollPane(tabelpegawai);
    JButton tambah, edit, hapus, back;
    JLabel atasan, labelnip, labelnama, labelpassword, labelalamat;
    JTextField niptext, passwordtext;

    public AtasanGUI07196() {
        Atasan.setSize(650, 500);
        Atasan.setLayout(null);
        Atasan.getContentPane().setBackground(Color.LIGHT_GRAY);
        Atasan.setLocationRelativeTo(null);
        Atasan.setVisible(true);
        Atasan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        atasan = new JLabel("ADMIN");
        atasan.setBounds(250, 30, 200, 30);
        atasan.setFont(new Font("Consolas", Font.BOLD, 40));
        Atasan.add(atasan);

        scrollatasan.setBounds(30, 100, 570, 200);

        tabelpegawai.setModel(pegawai.dataTabelpegawai());

        Atasan.add(scrollatasan);

        labelnip = new JLabel("Nomor");
        labelnip.setBounds(50, 320, 100, 30);
        Atasan.add(labelnip);

        niptext = new JTextField();
        niptext.setBounds(50, 350, 100, 30);
        Atasan.add(niptext);

        labelpassword = new JLabel("password");
        labelpassword.setBounds(200, 320, 100, 30);
        Atasan.add(labelpassword);

        passwordtext = new JTextField();
        passwordtext.setBounds(200, 350, 100, 30);
        Atasan.add(passwordtext);

        edit = new JButton("Edit");
        edit.setBounds(200, 400, 100, 30);
        edit.setBackground(Color.YELLOW);
        Atasan.add(edit);

        hapus = new JButton("hapus");
        hapus.setBounds(350, 400, 100, 30);
        hapus.setBackground(Color.YELLOW);
        Atasan.add(hapus);
        
        back = new JButton("back");
        back.setBounds(500, 400, 100, 30);
        back.setBackground(Color.RED);
        Atasan.add(back);

        tambah = new JButton("Tambah");
        tambah.setBounds(50, 400, 100, 30);
        tambah.setBackground(Color.yellow);
        Atasan.add(tambah);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Atasan.dispose();
                GUI07196 men = new GUI07196();
            }
        });
        tambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Atasan.dispose();
                new TambahGUI07196();
            }
        });
        hapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Atasan.dispose();
                String nip = niptext.getText();
                String pass = passwordtext.getText();
                int index = AllObjectctrl07196.pegawai.cekpegawai(nip, pass);
                AllObjectctrl07196.pegawai.remove(index);
                AtasanGUI07196 men = new AtasanGUI07196();
            }
        });

        edit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Atasan.dispose();
                String nip = niptext.getText();
                String pass = passwordtext.getText();
                int index = AllObjectctrl07196.pegawai.cekpegawai(nip, pass);
                new EditGUI07196(index);
            }
        });
        tabelpegawai.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = tabelpegawai.getSelectedRow();
                niptext.setText(AllObjectctrl07196.pegawai.dataTabelpegawai().getValueAt(i, 0).toString());
                passwordtext.setText(AllObjectctrl07196.pegawai.dataTabelpegawai().getValueAt(i, 1).toString());
            }
        });

    }
}
