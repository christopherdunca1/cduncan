import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.*;

public class ModifiedJPanel extends JPanel
{
    private int num1 = 50;
    private JButton push, decrement;
    private JLabel label;
 
public ModifiedJPanel()
{
	int num1;
	push = new JButton ("Increment!");
	decrement = new JButton ("Decrement!");
	push.addActionListener (new ButtonListener());
	decrement.addActionListener(new ButtonListener());
	
	num1 = 50;
	label = new JLabel ("Amount: " + num1);
	add (push);
	add (decrement);
	add (label);
	
	setBackground (Color.white);
	setPreferredSize (new Dimension(275, 100));
}

private class ButtonListener implements ActionListener
{
	public void actionPerformed(ActionEvent event)
	{
		if(event.getSource() == push)
		{
		++num1;
		label.setText("Amount:"+num1);
		}
		else if(event.getSource() == decrement)
		{
		--num1;
		label.setText("Amount:"+num1);
		}
	}
	
}
}
