package layout_manager;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class flow_layout {
    public static void main(String [] args) {
        
        // membuat frame / window
        JFrame container = new JFrame("Flow Layout");
        container.setSize(500, 500);
        container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        container.setLocationRelativeTo(null);
        
        // membuat layout Flow
        FlowLayout span = new FlowLayout(FlowLayout.CENTER);
                
        // membuat button
        JButton btn1 = new JButton("Submit");
        JButton btn2 = new JButton("Reset");
        JButton btn3 = new JButton("More");
        
        // menambahkan layout flow ke dalam container
        container.setLayout(span); 
        container.add(btn1);
        container.add(btn2);
        container.add(btn3);
        
        // menampilkan frame
        container.setVisible(true);

    }
}
