public enum Wood{
  INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAPLE, SITKA, ALDER,
  CEDAR, ADIRONDACK, COCOBOLO, MAHOGANY;

  public String toString(){
    switch(this){
      case INDIAN_ROSEWOOD: return "Indian Rosewood";
      case BRAZILIAN_ROSEWOOD: return "Brazilian Rosewood";
      case MAPLE: return "Maple";
      case SITKA: return "Sitka";
      case ALDER: return "Alder";
      case CEDAR: return "Cedar";
      case ADIRONDACK: return "Adirondack";
      case COCOBOLO: return "Cocobolo";
      case MAHOGANY: return "Sitka";
      default: return "Not mentioned";
    }
  }
}
