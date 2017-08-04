import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class SortBoxes extends JFrame{
   JButton button1;
   Container c;
   //Here are the text boxes
   JTextField field1,field2,field3,field4,field5;
   JLabel label;
   public SortBoxes(){
       c = getContentPane();
       c.setLayout(new FlowLayout());
       field1 = new JTextField(30);
       field2 = new JTextField(30);
       field3 = new JTextField(30);.
       field4 = new JTextField(30);
       field5 = new JTextField(30);
       label = new JLabel();
       button1 = new JButton("Sort");
       c.add(field1);
       c.add(field2);
       c.add(field3);
       c.add(field4);
       c.add(field5);
   c.add(button1);
   c.add(label);
   setSize(400, 400);
   setVisible(true);
   Button1Listener button1Listener = new Button1Listener();

   button1.addActionListener(button1Listener);
  
   }
   private class Button1Listener implements ActionListener{

       public void actionPerformed(ActionEvent e) {
           int a[] = new int[5];
           a[0] = Integer.parseInt(field1.getText());
           a[1] = Integer.parseInt(field2.getText());
           a[2] = Integer.parseInt(field3.getText());
           a[3] = Integer.parseInt(field4.getText());
           a[4] = Integer.parseInt(field5.getText());
           bubbleSort(a);
           String s = "";
           for(int i=0; i<a.length; i++){
               if(i == a.length-1){
                   s = s + a[i];
               }
               else{
               s = s + a[i]+", ";
               }
           }
           label.setText(s);
       }
      
   }
   public static void main(String[] args) {
   new SortBoxes();  
   }
   private static void bubbleSort(int[] a) {
int n = a.length;
int temp = 0;

for(int i=0; i < n; i++){
for(int j=1; j < (n-i); j++){

if(a[j-1] > a[j]){
//swap the elements!
temp = a[j-1];
a[j-1] = a[j];
a[j] = temp;
}
}
}
}
}