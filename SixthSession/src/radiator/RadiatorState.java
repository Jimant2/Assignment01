package radiator;

public interface RadiatorState
{
  public void onButtonUp(Radiator radiator);
  public void onButtonDown(Radiator radiator);
  public int getPower();
}
