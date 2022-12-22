import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class main {

    public static void main(String[] args) throws LineUnavailableException, UnsupportedAudioFileException, IOException {
        
        String salutation = calendar.salutation();
        String brazilDateTime = calendar.brazilDateTime();
        
        alarm.getAlarm("Falar com pedro");
        
        JFrame calendarWindow = new JFrame("Calendário - " + brazilDateTime);
        calendarWindow.setSize(1280,720); 

        JPanel calendarJPanel = new JPanel();
        calendarJPanel.setSize(1080, 720);
        
        JLabel greetingsJLabel = new JLabel();
        greetingsJLabel.setText(salutation);
       
        calendarWindow.add(calendarJPanel);
        calendarJPanel.add(greetingsJLabel);

        calendarWindow.setVisible(true);
    }
}