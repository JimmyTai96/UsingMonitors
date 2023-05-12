public class TA extends Thread{
  private TA_Brain brain;
  private String TAName;
  
  public TA(TA_Brain brain, String name){
    this.brain = brain;
    TAName = name;
  }
  
  public String getTAName(){
    return TAName;
  }
  
  public void giveAdvice(){
    System.out.println(TAName + " offers: Have you thought about studying hard?");
  }
  
  public void run(){
    while(brain.getNumOfStudentsHelping()>0){
      giveAdvice();
      brain.releaseAStudent(this);
    }
  }
}