package sem.graphicalInterfaces1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingWindow extends JFrame {
    private static final int WIDTH = 350;
    private static final int HEIGHT = 230;
    private static final int PVC = 0;
    private static final int PVP = 1;

    JButton btnStart = new JButton("Start new Game");

    SettingWindow(GameWindow gameWindow) {
        setLocationRelativeTo(gameWindow);
        setSize(WIDTH, HEIGHT);

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameWindow.startNewGame(0, 3, 3, 3);
                setVisible(false);
            }
        });



        setLayout(new GridLayout(10, 1));
        add(new JLabel("Выберите режим игры"));
        ButtonGroup bg = new ButtonGroup();
        JRadioButton pvc = new JRadioButton("Человек портив компьютера");
        JRadioButton pvp = new JRadioButton("Человек портив человека");
        bg.add(pvc);
        bg.add(pvp);
        add(pvc);
        add(pvp);

        add(new JLabel("Выберите размер поля"));
        add(new JLabel("Установленный размер поля: "));
        add(new JSlider(3, 10,3));
        add(new JLabel("Выберите длину для победы"));
        add(new JLabel("Установленная длина: "));
        add(new JSlider(3, 10,3));
        add(btnStart);
    }
}
