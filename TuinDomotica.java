import java.util.Calendar;
import java.util.Date;

public class TuinDomotica {
    private Boolean daglicht;
    private Boolean regen;
    private Schakelaar slimmeschakelaar;
    private Calendar calendar;
    private Date startTijd;
    private Date stopTijd;

    public TuinDomotica() {
        super();
        slimmeschakelaar = Schakelaar.AUTOMATISCH;
        calendar = Calendar.getInstance();
       
        
        calendar.set(Calendar.MINUTE, 00);
        calendar.set(Calendar.HOUR_OF_DAY, 20);
        this.startTijd = calendar.getTime();
        
        calendar.set(Calendar.MINUTE, 00);
        calendar.set(Calendar.HOUR_OF_DAY, 5);
        
        this.stopTijd = calendar.getTime();        
    }
    
    public Boolean getDaglicht() {
        return daglicht;
    }

    public Boolean getRegen() {
        return regen;
    }
    public void setRegen(Boolean regen) {
        this.regen = regen;
    }

    public Schakelaar getSlimmeschakelaar() {
        return slimmeschakelaar;
    }

    public void setSlimmeschakelaar(Schakelaar slimmeschakelaar) {
        this.slimmeschakelaar = slimmeschakelaar;
    }
    
    public Date getStartTijd() {
    	return this.startTijd;
    }
    
    public Date getStopTijd() {
    	return this.stopTijd;
    }
    
    
}
