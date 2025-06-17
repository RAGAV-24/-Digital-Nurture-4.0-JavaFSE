public class Logger
{
  private static Logger obj;
  private Logger()
  {
    System.out.println("constructor is invoked");
  }
  public static Logger get_instance()
  {
    if(obj==null)
    {
      obj=new Logger();
    }
    return obj;
  }
}