public class TuinVerlichting{
    private String timeOn;
    private String timeOff;
    private TuinDomotica domotica;
    private boolean aan;
    
	public TuinVerlichting() {
		this.domotica = new TuinDomotica();
		
	}
	
	private void checkDomotica() {
		if(domotica.getSlimmeschakelaar() == Schakelaar.AUTOMATISCH) {
			this.timeOn = "20:00";
			this.timeOff = "05:00";
		}		
	}
	
	public void switchOnOff() {
		this.aan = !aan;
	}
	
	public void getState() {
	
		if(aan == true) {
			System.out.println("Verlichting staat aan.");
		}
		else {
			System.out.println("Verlichting staat uit.");
		}
	}
}