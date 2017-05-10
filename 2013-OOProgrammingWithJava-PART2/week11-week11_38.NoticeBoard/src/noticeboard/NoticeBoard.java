package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {

        frame = new JFrame();
        frame.setPreferredSize(new Dimension(400, 300));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);

    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);

        JTextField textTop = new JTextField("I was copied here from the JTextArea.");
        JLabel labelBot = new JLabel();
        JButton moveButton = new JButton("Copy!");

        ActionEventListener mover = new ActionEventListener(textTop, labelBot);
        moveButton.addActionListener(mover);

        container.add(textTop);
        container.add(moveButton);
        container.add(labelBot);

    }
}
