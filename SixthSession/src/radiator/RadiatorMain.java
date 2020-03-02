package radiator;

public class RadiatorMain
{
  public static void main(String[] args)
  {
    Radiator r1 = new Radiator();
    r1.turnUp();
    System.out.println(r1.getPower());
    r1.turnUp();
    System.out.println(r1.getPower());
    r1.turnUp();
    System.out.println(r1.getPower());
    try
    {
      Thread.sleep(1500);
    }
    catch (InterruptedException e)
    {

    }
    System.out.println(r1.getPower());
  }
}
