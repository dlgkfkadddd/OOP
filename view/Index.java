package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Index extends JFrame {
    Index() {
        this.setDefaultCloseOperation(3);
        this.setTitle("홈페이지");
        this.setLayout(new GridLayout(3, 3, 10, 10));
        JButton joinBtn = new JButton("회원가입");
        joinBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        this.add(joinBtn);
        JButton accountBtn = new JButton("통장생성");
        accountBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        this.add(accountBtn);
        JButton listSeeBtn = new JButton("목록보기");
        accountBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        this.add(listSeeBtn);
        this.setSize(600, 600);
        this.setLocation(100, 100);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Index();
    }
}