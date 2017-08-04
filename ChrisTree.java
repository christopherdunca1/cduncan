
public class ChrisTree {
	public static void main(String[] args) 
	{ 
	drawTree(3, 4); 
	System.out.println(); 
	drawTree(2, 5); 
	} 

	public static void drawTree(int segments, int height){ 
	int maxStars = 2*height+2*segments-3;
    // maxStr: master variable string that will be changed and printed for each line
    String maxStr = "";
    // populates maxStr will spaces; will be used with substring to generate needed spaces
    for (int len=0; len < maxStars; len++){
      maxStr+=" ";
    }
    // loops once per segment
    for (int i=1; i <= segments; i++){
      // starStr: variable string that changes perline that holds the stars

      // populates starStr with stars
      // loops through each line
      for (int line=1; line <= height; line++){
        String starStr = "";
        for (int j=1; j <= 2*line+2*i-3; j++){
          starStr+="*";
        }
        for (int space=0; space <= maxStars-(height+line+i); space++){
          starStr = " " + starStr;
        }
        System.out.println(starStr);
      }
    }

    for (int i=0; i <= maxStars/2;i++){
      System.out.print(" ");
    }
    System.out.print("*\n");
    for (int i=0; i <= maxStars/2;i++){
      System.out.print(" ");
    }
    System.out.print("*\n");
    for (int i=0; i <= maxStars/2-3;i++){
      System.out.print(" ");
    }
    System.out.print("*******\n");
  }
}