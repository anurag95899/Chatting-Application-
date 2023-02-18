package Chatting_application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Server extends JFrame  implements ActionListener {
    JTextField text;
    JPanel textbox;
    Box vertical = Box.createVerticalBox();
    Server(){
        setLayout(null);
        JPanel pl=new JPanel();
        pl.setBackground(new Color(25, 85, 25));
        pl.setBounds(0,0,450,70);
        pl.setLayout(null);
        add(pl);

        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource(""));
        Image i2 = il.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel back = new JLabel(i3);
        back.setBounds(5,20,25,25);
        pl.add(back);
        back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent ae) {
                System.exit(0);
            }
        });


        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource(""));
        Image i5 = i4.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel profile = new JLabel(i6);
        profile.setBounds(40,10,50,50);
        pl.add(profile);

        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource(""));
        Image i8 = i7.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel video = new JLabel(i9);
        video.setBounds(200,20,30,30);
        pl.add(video);

        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource(""));
        Image i11 = i10.getImage().getScaledInstance(35,30,Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel phone = new JLabel(i12);
        phone.setBounds(260,20,35,30);
        pl.add(phone);


        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource(""));
        Image i14 = i13.getImage().getScaledInstance(10,25,Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        JLabel morevert = new JLabel(i15);
        morevert.setBounds(320,20,10,25);
        pl.add(morevert);

        JLabel name = new JLabel("Anurag");
        name.setBounds(110,20,100,20);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("SAN SERIF",Font.BOLD,18));
        pl.add(name);

        JLabel status = new JLabel("Active Now");
        status.setBounds(110,40,100,20);
        status.setForeground(Color.WHITE);
        status.setFont(new Font("SAN SERIF",Font.BOLD,10));
        pl.add(status);

        textbox = new JPanel();
        textbox.setBounds(5,75,440,570);
        add(textbox);

//        JTextField text =new JTextField();
        text = new JTextField();
        text.setBounds(5,655,310,40);
        text.setFont(new Font(" SAN_SERIF",Font.PLAIN,16));
        add(text);

        JButton send = new JButton("Send");
        send.setBounds(320,655,123,40);
        send.setBackground(new Color(25, 85, 25));
        send.setForeground(Color.WHITE);
        send.setFont(new Font(" SAN_SERIF",Font.PLAIN,16));
        send.addActionListener(this);
        add(send);

     setSize(450,700);
     setLocation(120,20);
     setUndecorated(true);
     getContentPane().setBackground(new Color(255,255,255));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
      String out = text.getText();
//      System.out.println(out);
        JLabel output = new JLabel(out);
        JPanel p2=new JPanel();
        p2.add(output);

        textbox.setLayout(new BorderLayout());

        JPanel right = new JPanel(new BorderLayout());
        right.add(p2,BorderLayout.LINE_END);
        vertical.add(right);
        vertical.add(Box.createVerticalStrut(15));
    }
    public static void main(String[] args) {
        //anonamus object
        new Server();

    }
}
