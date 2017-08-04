import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Email {
	  
	private JFrame mainFrame;
	private JPanel controlPanel;
	private JLabel output;

	public Email(){
	createForm();
	}

	public static void main(String[] args){
	Email emailprog = new Email();
	emailprog.sendButton();
	}

	private void createForm(){
	mainFrame = new JFrame("Email");
	mainFrame.setSize(600,600);
	mainFrame.setLayout(new GridLayout(2,2));
	mainFrame.addWindowListener(new WindowAdapter() {
	public void windowClosing(WindowEvent windowEvent){
	System.exit(0);
	}
	});   

	   output = new JLabel("Output: ");
	  
	controlPanel = new JPanel();
	controlPanel.setLayout(new GridLayout(10,2));
	  
	mainFrame.add(controlPanel);
	   mainFrame.add(output);
	mainFrame.setVisible(true);
	}

	private void sendButton(){

	   JLabel to = new JLabel("To: ");
	   JLabel cc = new JLabel("Cc: ");
	   JLabel bcc = new JLabel("Bcc: ");
	   JLabel subject = new JLabel("Subject: ");
	   JLabel msg = new JLabel("Message: ");
	final JTextField toText = new JTextField(50);
	   final JTextField ccText = new JTextField(50);
	   final JTextField bccText = new JTextField(50);
	   final JTextArea subjectText = new JTextArea(10,50);
	   final JTextArea msgText = new JTextArea(20,50);
	JButton send = new JButton("SEND");   

	send.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	String data = "To " + toText.getText() + "<br/>Cc " + ccText.getText() + "<br/>Bcc " + bccText.getText() + "<br/>Subject " + subjectText.getText() + "<br/>Message " + msgText.getText();
	           output.setText("<html>"+data+"</html>");
	}
	});
	   controlPanel.add(to);
	controlPanel.add(toText);
	   controlPanel.add(cc);
	controlPanel.add(ccText);
	   controlPanel.add(bcc);
	controlPanel.add(bccText);
	   controlPanel.add(subject);
	controlPanel.add(subjectText);
	   controlPanel.add(msg);
	controlPanel.add(msgText);
	controlPanel.add(send);

	mainFrame.setVisible(true);
	}
	}



