 
class Cards {
   
    int[] value = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    String[] suite = {"CLUBS", "DIAMONDS", "HEARTS" };
    char[] pip = {'A', '2', '3', '4', '5', '6', '7', '8', '9', 't', 'J', 'Q', 'K'};
    public int getSuite(int sequence) {
        return sequence / 13;
    }
    public int getPip(int sequence) {
        return sequence % 13;
    }
}
public class Diamonds {
	public String bid (player1 , player2) {
	{
	
    public int compare(int seq1, int seq2){
        if( getPip(seq1) > getPip(seq2) )
            return seq1;
        else if( getPip(seq1) < getPip(seq2))
            return seq2;
        else{
            if( getSuite(seq1) > getSuite(seq2) )
                return seq1;
            
            else
                return -1;
        }   
   
   
    }
 

    public static void main(String[] args) {
        int seq1 = 43;
        int seq2 = 47;
        Cards c = new Cards();
        System.out.println(c.getSuite(seq1));
        System.out.println(c.getPip(seq2));
        System.out.println(c.compare(seq1,seq2));
    }
}


}


  
