package radiator;

public class Power1State implements RadiatorState
{
  private int Power = 1;

  @Override public void onButtonUp(Radiator radiator)
  {
    radiator.setPowerState(new Power2State());
  }

  @Override public void onButtonDown(Radiator radiator)
  {
    radiator.setPowerState(new OffState());
  }

  @Override public int getPower()
  {
    return 1;
  }
}
