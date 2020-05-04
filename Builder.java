public enum Builder {
  MARTIN, FENDER, GIBSON, OLSON, RYAN, PRS, COLLINGS, ANY_OTHER;

  public String toString() {
    switch(this) {
      case MARTIN: return "Martin";
      case FENDER: return "Fender";
      case GIBSON: return "Gibson";
      case OLSON: return "Olson";
      case RYAN: return "Ryan";
      case PRS: return "Prs";
      case COLLINGS: return "Collings";
      default: return "Not mentioned";
    }
  }
}
