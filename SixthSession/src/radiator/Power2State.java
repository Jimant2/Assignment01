package radiator;

public class Power2State implements RadiatorState
{
  private static final int Power = 2;

  @Override public void onButtonUp(Radiator radiator)
  {
    radiator.setPowerState(new Power3State(radiator));
  }

  @Override public void onButtonDown(Radiator radiator)
  {
    radiator.setPowerState(new Power1State());
  }

  @Override public int getPower()
  {
    return 2;
  }
}
