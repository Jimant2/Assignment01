package radiator;

public class OffState implements RadiatorState
{
  private static final int Power = 0;

  @Override public void onButtonUp(Radiator radiator)
  {
    radiator.setPowerState(new Power1State());
  }

  @Override public void onButtonDown(Radiator radiator)
  {
    System.out.println("Does nothing");
  }

  @Override public int getPower()
  {
    return 0;
  }
}
