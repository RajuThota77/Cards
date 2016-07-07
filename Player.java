import java.util.ArrayList.*;
public class Players {
    public static void main(String[] args){
        ArrayList<String> player1= new Arraylist<String>();
    
        player1.add("J");
        player1.add("Q");
        player1.add("K");
        player1.add("A");
        player1.add("2");
        player1.add("3");
        player1.add("4");
        player1.add("5");
        player1.add("6");
        player1.add("7");
        player1.add("8");
        player1.add("9");
        player1.add("T");
        
        ArrayLis <String> player2 = new ArrayList<String>();
        player2.add("J");
        player2.add("Q");
        player2.add("K");
        player2.add("A");
        player2.add("2");
        player2.add("3");
        player2.add("4");
        player2.add("5");
        player2.add("6");
        player2.add("7");
        player2.add("8");
        player2.add("9");
        player2.add("T");
        int diamondscore=0;
      public static String bidrandom(ArrayList<String> list){
                int idx = new Random().nextInt(list.length);
                String random = (list[idx]);
                return random;
                
    }
    public static ArrayList<String> deletebid(int index,Arraylist<String>list){
        list.remove(index);
        return list;
    }
        
        
    }
    
}
  
    

