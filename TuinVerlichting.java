public class TuinVerlichting{
    private Date timeOn;
    private Date timeOff;
    private TuinDomotica domotica;
    private boolean aan;

	public TuinVerlichting() {
		this.domotica = new TuinDomotica();

	}

	private void checkDomotica() {
		if(domotica.getSlimmeschakelaar() == Schakelaar.AUTOMATISCH) {
			this.timeOn =  domotica.getStartTijd();
			this.timeOff = domotica.getStopTijd();
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
