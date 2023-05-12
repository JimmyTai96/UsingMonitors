public class NightLab{
  
  public static void main(String[] args){
    TA_Brain brain = new TA_Brain(3);
    int studentCount = 20;
    Thread[] studentsNeedingHelp = new Thread[studentCount];
    TA ta = new TA(brain, "Kiki");
    for(int i = 0; i < studentCount;i++){
      studentsNeedingHelp[i] = new Student(brain, "studentNum"+i);
    }
    for(int i = 0; i < studentCount;i++){
      studentsNeedingHelp[i].start();
    }
    ta.start();
  }
}