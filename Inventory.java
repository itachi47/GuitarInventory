import java.util.*;

public class Inventory{
  private List guitars;

  public Inventory(){
    guitars = new LinkedList();
  }

  public void addGuitars(String serialNumber, double price, GuitarSpec spec){
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

  public List search(GuitarSpec searchSpec){
    List matchingGuitars = new LinkedList();
    for(Iterator i = guitars.iterator(); i.hasNext();){
      Guitar guitar = (Guitar)i.hasNext();
      if(guitar.getSpec().matches(searchSpec))
        matchingGuitars.add(guitar);
    }
    return matchingGuitars;
  }  
}