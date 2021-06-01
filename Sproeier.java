public class Sproeier {
    private String merk ;
    private TuinDomotica domotica;
    private Date startTijd;
    private Date stopTijd;

    private boolean aan;

    public Sproeier() {
        super();
        merk = "Gardena";
        this.domotica = new TuinDomotica();

        if(domotica.getSlimmeschakelaar() == Schakelaar.AUTOMATISCH && domotica.getRegen() == false) {
        	this.startTijd = domotica.getStartTijd();
        	this.stopTijd = domotica.getStopTijd();
        }
    }
    public String getHoseBrand() {
        return merk;
    }

    public void sproeien ()
    {
        System.out.println("Aan het sproeien.");
    }

    public void turnOn() {
    	this.aan = true;
    }

    public void turnOff() {
    	this.aan = false;
    }

    public void getState() {
    	if(aan) {
    		System.out.println("sproeiers staan aan");
    	}
    	else {
    		System.out.println("sproeiers staan uit");
    	}
    }


}
