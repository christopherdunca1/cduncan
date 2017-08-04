
public class TheTreeLinkedList
{
   private class Node
   {
       Node ThisIsTheRight;
       Node ThisIsTheLeft;
       int ThisIsTheNodeValue;
      
       
       /**
	     * @param This is a constructor that is going to initialize.
	     */
       Node(int NodeValue)
       {
           ThisIsTheNodeValue = NodeValue;
           ThisIsTheLeft = null;
       }
   }

   private Node ThisIsTheRoot; 
 
   /**
   *
   * @param This is the constructor being used with the class itself.
   * */
   public TheTreeLinkedList()
   {
       ThisIsTheRoot = null;   
   }
   
   /**
   *
   * @param This method is going to take the node and call the recursive method with the usage of the left and right nodes.
   * This is the recursive method that will return our information.
   */
   private String InfixRecursive(Node a)
   {
       if(a != null)
           return InfixRecursive(a.ThisIsTheLeft) +" "+ a.ThisIsTheNodeValue +" "+ InfixRecursive(a.ThisIsTheRight);
       return ",";
   }
  
   /**
   *
   * @param This method is going to add the values to our binary tree.
   */
   public void AddingToTree(int TheValueBeingAdded)
   {
       if (ThisIsTheRoot == null)
       {
           ThisIsTheRoot = new Node(TheValueBeingAdded);
       }
       else
       {
           Node TemporaryValue = ThisIsTheRoot;
           while(true)
           {
               if(TheValueBeingAdded < TemporaryValue.ThisIsTheNodeValue)
                   if(TemporaryValue.ThisIsTheLeft == null)
                   {
                	   TemporaryValue.ThisIsTheLeft = new Node(TheValueBeingAdded);
                       break;
                   }
                   else
                	   TemporaryValue = TemporaryValue.ThisIsTheLeft;
               else
                   if(TemporaryValue.ThisIsTheRight == null)
                   {
                	   TemporaryValue.ThisIsTheRight = new Node(TheValueBeingAdded);
                       break;
                   }
                   else
                	   TemporaryValue = TemporaryValue.ThisIsTheRight;
           }
       }
   }
  
  
   /**
   *
   * @param This basic toString method that will show the infix. I have initialized the output and the temporary root.
   */
   public String ThisWillShowTheInfix(){
	   Node TemporaryRoot = ThisIsTheRoot;
       String InfixOutput;
       InfixOutput = InfixRecursive(TemporaryRoot);
       return InfixOutput;
   }
}