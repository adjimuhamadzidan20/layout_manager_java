package layout_manager;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

    public class border_layout {
        public static void main(String [] args) {

            // var ukuran panel
            Dimension ukuran = new Dimension(100,100);
            
            // membuat frame / window
            JFrame container = new JFrame("Border Layout");
            container.setSize(500, 500);
            container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            container.setLocationRelativeTo(null);
            
            // membuat layout border
            BorderLayout border = new BorderLayout(5,5);
            container.setLayout(border);
            
            // membuat panel content
            JPanel sect1 = new JPanel();
            JPanel sect2 = new JPanel();
            JPanel sect3 = new JPanel();
            JPanel sect4 = new JPanel();
            JPanel sect5 = new JPanel();
            
            // memberi warna background & ukuran
            sect1.setBackground(Color.LIGHT_GRAY);
            sect1.setPreferredSize(ukuran);
            
            sect2.setBackground(Color.LIGHT_GRAY);
            sect2.setPreferredSize(ukuran);
            
            sect3.setBackground(Color.LIGHT_GRAY);
            sect3.setPreferredSize(ukuran);
            
            sect4.setBackground(Color.LIGHT_GRAY);
            sect4.setPreferredSize(ukuran);
            
            sect5.setBackground(Color.LIGHT_GRAY);
            sect5.setPreferredSize(ukuran);
            
            // menambahkan kedalam frame container
            container.add(sect1, BorderLayout.NORTH);
            container.add(sect2, BorderLayout.SOUTH);
            container.add(sect3, BorderLayout.WEST);
            container.add(sect4, BorderLayout.EAST);
            container.add(sect5, BorderLayout.CENTER);
            
            // menampilkan frame
            container.setVisible(true);
            
        }
    
}
