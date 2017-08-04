import java.util.Scanner;

 public class NBA {
   public static void main(String[] args) {
       NBATeam heat= new NBATeam("Heat", 0, 0);
       System.out.print("How many players the Heat owns: ");
       Scanner input = new Scanner (System.in);
       
       int numberOfPlayers = input.nextInt();
       for (int i = 0; i < numberOfPlayers; i++) {
       System.out.print("\nEnter the name of Player #" + (i + 1) + ": ");
       String playerName = input.next();
       heat.addAPlayer(playerName);
       }
       
       NBATeam spurs= new NBATeam("Spurs", 0, 0);
       System.out.print("\nHow many players Spurs own: ");
       int numberOfPlayer = input.nextInt();
       for (int n = 0; n < numberOfPlayer; n++) {
       System.out.print("\nEnter the name of Player #" + (n + 1) + ": ");
       String player_Name = input.next();
       heat.addAPlayer(player_Name);
       }
       
       System.out.println();
       int flip = 7;      
       while (flip >0){
           if (Math.random() > 0.5)
               heat.winAgame(spurs);
           else
               heat.lossAgame(spurs);
           flip--;
       }
       System.out.println(heat);
       System.out.println(spurs);
   }
}


