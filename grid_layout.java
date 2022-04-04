package layout_manager;
import javax.swing.*;
import java.awt.*;

public class grid_layout {
    public static void main(String [] args) {

        // membuat frame / window
        JFrame container = new JFrame("Grid Layout");
        container.setSize(500, 250);
        container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        container.setLocationRelativeTo(null);
        container.setLayout(null);

        // membuat button
        JButton btn1 = new JButton("button 1");
        JButton btn2 = new JButton("button 2");
        JButton btn3 = new JButton("button 3");
        JButton btn4 = new JButton("button 4");

        // membuat layout grid
        GridLayout grid = new GridLayout(2,2,5,5);
        container.setLayout(grid);

        // menambahkan layout grid ke dalam container
        container.add(btn1);
        container.add(btn2);
        container.add(btn3);
        container.add(btn4);

        // menampilkan frame
        container.setVisible(true);

    }
}
