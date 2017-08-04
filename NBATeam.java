
class NBATeam {
   // instance variables
   private String sTeamName;
   private int nWin;
   private int nLoss;
   private String [] playerArray = new String[10];
   private int number_of_players;
   // constructor
   public NBATeam(String s, int w, int l) {
       sTeamName = s; nWin = w; nLoss = l;
       number_of_players = 0;
   }
   // Instance method
   public String getTeamName(){
       return sTeamName;
   }
   public void setTeamName(String s){
       sTeamName = s;
   }
   public String toString(){
       String s= sTeamName + " win #: " + nWin + " los : " +nLoss;
       return s;
   }
   public void winAgame(NBATeam teamB){
       nWin++;
       teamB.lossAgame();
   }
   public void lossAgame(NBATeam teamB){
       nLoss++;  
       teamB.winAgame();
   }
   public void winAgame(){
       nWin++;
   }
   public void lossAgame(){
       nLoss++;
   }
   public void addAPlayer(String playerName) 
   {
   if(number_of_players == 15) 
   System.out.println("Can't Add more Players array is full :");
   else
    playerArray[number_of_players++] = playerName;
   }
}