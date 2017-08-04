import javax.swing.JFrame;

public class Itunes {
public static void main(String [] args){
	JFrame frame = new JFrame("Chris D Itunes");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().add(new ItunesControls());
	frame.pack();
	frame.setVisible(true);
}
}
