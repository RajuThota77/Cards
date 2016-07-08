 
class Cards {
    int seq;
    Cards(int seq){
    this.seq=seq;
   }
    
   
    public int getPip(int sequence) {
        return sequence;
    }
	
    public int compare(Cards c){
          return getPip()-c.getPip();
   
    }
 


}


  
