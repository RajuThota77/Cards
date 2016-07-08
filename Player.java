import java.util.ArrayList.*;

public class Players {
    int gamescore=0;
    
        public Player(char suite){
         this.suite=suite;
        } 

        ArrayList<Interger> player1= new Arraylist<Integer>();
        pipValues = "A23456789TJQK";
        for(int i = 0; i < pipValues.length(); i++) {
            player1.add(new Card(pipValues.charAt(i),suite));
      
        Collections.shuffle(player1);

        
        ArrayLis <String> player2 = new ArrayList<String>();
          pipValues = "A23456789TJQK";
        for(int i = 0; i < pipValues.length(); i++) {
            player2.add(new Card(pipValues.charAt(i),'D'));        }
        Collections.shuffle(player2);
      public static  int bid(ArrayList<Integer> list){
                int idx = new Random().nextInt(list.length);
                int random = (list[idx]);
                return random;
               
    public static ArrayList<Integer> deletebid(int index,Arraylist<Integer>list){
        list.remove(index);
        return list;
        }
    public static int UpdateScore(int valueofdiamond){
       gamescore+=valueofdiamond;
       return gamescore;
     }
    public static String howwins(Player player1,Player player2){
    if(player1.gamescore>player2.gamescore)
    return "player1";
    else
      return "player2";
 }       
        
    }
    
  
    

