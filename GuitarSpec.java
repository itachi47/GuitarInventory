public class GuitarSpec{
  private Builder builder;
  private String model;
  private Type type;
  private int numStrings;
  private Wood backWood;
  private Wood topWood;

  public GuitarSpec(Builder builder, String model, Type type, int numStrings, Wood backWood, Wood topWood){
    this.builder = builder;
    this.model = model;
    this.type = type;
    this.numStrings = numStrings;
    this.backWood = backWood;
    this.topWood = topWood;
  }

  //matches

  public boolean matches(GuitarSpec spec){
    if(builder  != spec.builder)
      return false;
    if((model != null) && (!model.equals("") && !model.toLowerCase().equals(spec.model.toLowerCase())))
      return false;
    if(type != spec.type)
      return false;
    if(numStrings != spec.numStrings)
      return false;
    if(backWood != spec.backWood)
      return false;
    if(topWood != spec.topWood)
      return false;
    return true;
  }

  //getters
  public Builder getBuilder(){
    return builder;
  }

  public String getModel(){
    return model;
  }

  public int getNumStrings(){
    return numStrings;
  }

  public wood getBackWood(){
    return backWood;
  }

  public Wood getTopWood(){
    return topWood;
  }

}
