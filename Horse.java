//Create the Horse class here.
public class Horse{
  private static int nextCounter = 1;
  String hn;
  Double w;
  Boolean t;
  private int counter = 0;

  public String toString() {
    return "Horse #"+counter+"  Name: "+hn+" Weight: "+w+" Tame: "+t+"";
  }
  
  public Horse(String hn, double w, boolean t){
    this.hn = hn;
    this.w = w;
    this.t = t;
    counter = nextCounter;
    nextCounter++;
  }
}

