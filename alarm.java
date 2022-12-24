import java.io.File;
import java.io.IOException;
import javax.swing.*;
import javax.sound.sampled.*;

public class alarm {
    public static void getAlarm(String message) throws LineUnavailableException, UnsupportedAudioFileException, IOException{
        File soundAlarm= new File( "./alarme.wav");
        Clip audio = AudioSystem.getClip();
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundAlarm);
        audio.open(audioInputStream);

        int looping = 1;
        
        audio.loop(looping);

        looping = JOptionPane.showInternalConfirmDialog(null, message);
        if (looping > -1){
            audio.stop();
        }
    }
}
