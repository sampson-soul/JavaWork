import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class index {
    public static void main(String[] args) {
        JFrame frame = new JFrame("超级贪吃俄罗斯玛丽子游玩系统");
        JButton mario = new JButton("超级玛丽");
        JButton box = new JButton("推箱子");
        JButton snake = new JButton("贪吃蛇");
        JButton tetris = new JButton("俄罗斯方块");
        JButton exit = new JButton("退出");

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(null);
        contentPane.setBackground(Color.white);

        frame.getContentPane().add(mario);
        frame.getContentPane().add(box);
        frame.getContentPane().add(snake);
        frame.getContentPane().add(tetris);
        frame.getContentPane().add(exit);

        mario.setBounds(100,40,100,50);
        mario.setFont(new Font("宋体",Font.BOLD,10));
        box.setBounds(300,40,100,50);
        box.setFont(new Font("宋体",Font.BOLD,10));
        snake.setBounds(100,120,100,50);
        snake.setFont(new Font("宋体",Font.BOLD,10));
        tetris.setBounds(300,120,100,50);
        tetris.setFont(new Font("宋体",Font.BOLD,10));
        exit.setBounds(210,200,80,40);
        exit.setFont(new Font("宋体", Font.BOLD, 16));

        exit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });

        mario.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Runtime.getRuntime().exec("Run.java");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });

        box.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Runtime.getRuntime().exec("");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });

        snake.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Runtime.getRuntime().exec("");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });

        tetris.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Runtime.getRuntime().exec("");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });

        frame.setSize(500,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
