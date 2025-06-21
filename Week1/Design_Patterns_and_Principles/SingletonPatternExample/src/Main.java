public class Main {
  public static void main(String[] args) {
      Logger l1=Logger.get_instance();
      Logger l2=Logger.get_instance();
      if(l1==l2)
      {
       System.out.println("Both the object are same and only 1 object is  created");
      }
      else{
        System.out.println("Both the objects are different");
      }
  }
}
