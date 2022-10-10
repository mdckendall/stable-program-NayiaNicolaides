//Create the Horse class here.
public class Horse{
  String hn;
  Double w;
  Boolean t;

  public String toString() {
    return "Horse #1 Name: "+hn+" Weight: "+w+" Tame: "+t+"";
  }
  
  public Horse(String hn, double w, boolean t){
    this.hn = hn;
    this.w = w;
    this.t = t;
  }
}

