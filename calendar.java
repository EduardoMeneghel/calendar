import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

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

    public static int lastDayOfMonth(int year,int month) {
        Calendar instance = Calendar.getInstance();
        instance.set(Calendar.YEAR, year);
        instance.set(Calendar.MONTH, month);
        instance.set(Calendar.DAY_OF_MONTH, instance.getActualMaximum(Calendar.DAY_OF_MONTH));

        return Integer.parseInt(new SimpleDateFormat("dd").format(instance.getTime()));
    }

    public static String dayOfTheWeekOfTheFirstDayOfTheMonth(int year,int month) {
        Calendar instance = Calendar.getInstance();
        instance.set(Calendar.YEAR, year);
        instance.set(Calendar.MONTH, month);
        instance.set(Calendar.DAY_OF_MONTH, instance.getActualMinimum(Calendar.DAY_OF_MONTH));

        return new SimpleDateFormat("EEEE").format(instance.getTime());
    }

    public static int stringDayOfWeektoInt(String dayOfWeek) {
        switch (dayOfWeek){
            case "domingo":
                return 1;
            case "segunda-feira":
                return 2;
            case "terça-feira":
                return 3;
            case "quarta-feira":
                return 4;
            case "quinta-feira":
                return 5;
            case "sexta-feira":
                return 6;
            case "sabado":
                return 7;
        }
        return 0;
    }

    public static String saveDescription(String message, String title) {
        ImageIcon icon = new ImageIcon("./clock.png");
        return  (String) JOptionPane.showInputDialog(null,message,title,JOptionPane.INFORMATION_MESSAGE,icon,null,"");
    }
}
