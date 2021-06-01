public class Zonnescherm {
    private String stand ;
    private TuinDomotica tuinDom;
    public Zonnescherm() {
        super();
        stand = "Dicht";
        tuinDom = new TuinDomotica();
    }
    public String getStand() {
        return stand;
    }

    public void switchStand() {
      if(stand == "Dicht")
      {
        stand = "Open";
      }
      else{
        stand = "Dicht";

      }
    }


    public void getWeer{
      if(tuinDom.getRegen() && tuindom.getDaglicht()){
        System.out.println("Het regent en er is daglicht");
      }
      else if(tuindom.getDaglicht())
      {
        System.out.println("Er is daglicht en het regent niet");
      }
      else if(tuindom.getRegen())
      {
        System.out.println("Er is geen daglicht en het regent");
      }
    }
}
