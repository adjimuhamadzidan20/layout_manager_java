package layout_manager;
import javax.swing.JOptionPane;

public class joptionpane {
    public static void main(String[] args) {
        
        // JOptionPane.showMessageDialog(null, "halo..", "Jendela Percobaan", JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null, "halo..", "Jendela Percobaan", JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "halo..", "Jendela Percobaan", JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "halo..", "Jendela Percobaan", JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showMessageDialog(null, "halo..", "Jendela Percobaan", JOptionPane.ERROR_MESSAGE);

        // JOptionPane.showConfirmDialog(null, "Masih Semangat?", "Try", JOptionPane.YES_NO_CANCEL_OPTION);
        String nama = JOptionPane.showInputDialog("Siapa nama anda?");
        System.out.println("Hallo " + nama);


    }
}
