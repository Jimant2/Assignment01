package radiator;

public class Power3State implements RadiatorState, Runnable
{
  private static final int Power = 3;
  private Radiator radiator;
  private Thread thread;

  public Power3State(Radiator radiator)
  {
    this.radiator = radiator;
    this.thread = new Thread(this);
    thread.setDaemon(true);
    thread.start();
  }

  @Override public void onButtonUp(Radiator radiator)
  {
    System.out.println("Does nothing");
  }

  @Override public void onButtonDown(Radiator radiator)
  {
    thread.interrupt();
  }

  @Override public int getPower()
  {
    return 3;
  }
  public void run()
  {
    try
    {
      Thread.sleep(1000);
    }
    catch (InterruptedException e){}
    radiator.setPowerState(new Power2State());
  }
}
