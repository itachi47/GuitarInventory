import java.util.*;

public class Inventory{
  private ArrayList<Guitar> guitars;

  public Inventory(){
    guitars = new ArrayList<Guitar>();
  }

  public void addGuitar(String serialNumber, double price, GuitarSpec spec){
    Guitar guitar = new Guitar(serialNumber, price, spec);
    guitars.add(guitar);
  }

  public Guitar getGuitar(String serialNumber){
    for(Iterator i = guitars.iterator(); i.hasNext();){
      Guitar guitar = (Guitar)i.next();
      if(guitar.getSerialNumber().equals(serialNumber)){
        return guitar;
      }
    }
    return null;
  }

  public ArrayList<Guitar> search(GuitarSpec searchSpec){
    ArrayList<Guitar> matchingGuitars = new ArrayList<Guitar>();
    for(Iterator i = guitars.iterator(); i.hasNext();){
      Guitar guitar = (Guitar)i.next();
      if(guitar.getSpec().matches(searchSpec))
        matchingGuitars.add(guitar);
    }
    return matchingGuitars;
  }
}
