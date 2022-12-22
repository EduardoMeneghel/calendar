import java.text.SimpleDateFormat;
import java.util.Date;

public class calendar {

    public static String salutation() {
        Date now = new Date();
        int hour = Integer.parseInt(new SimpleDateFormat("HH").format(now));
        if(hour >= 6 && hour <= 11){
            return "Bom dia";
        } else if (hour >= 12 && hour <= 17){
            return "Boa tarde";
        } else {
            return "Boa noite";
        }
    }

    public static String brazilDateTime() {
        Date now = new Date();
        String brazilDateTime = new SimpleDateFormat("dd/MM/yyyy").format(now);
        return brazilDateTime;
    }

}
