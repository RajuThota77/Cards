public class Cards
{
  
    	public Cards(int sequence)
    	{
    	   this.sequence = sequence;
         
         }
	public toString(int sequence) {
	return getSuite(int sequence) + getRank(int sequence);
	}

	public int getSuite(int seq) {
	return "CDHS"[seq/13];
	}
	public int getPip(int seq) {

	return "A123456789JQK"[seq%13];
	}
    public static void main(String[] args) {
	Crads obj = new Cards();
	System.out.println(obj.toString());
    }
}
