import java.awt.Dimension;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class main {

    public static void main(String[] args) throws LineUnavailableException, UnsupportedAudioFileException, IOException {
        
        String salutation = calendar.salutation();
        String brazilDateTime = calendar.brazilDateTime();
    
        //alarm.getAlarm("Falar com pedro");

        String[] value = {"INDEX-0", "", "", "","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};
        
        String stringDayOfTheWeek = calendar.dayOfTheWeekOfTheFirstDayOfTheMonth(2022, 11);
        int intDayOfTheWeek = calendar.stringDayOfWeektoInt(stringDayOfTheWeek);
        int lastDayOfMonth = calendar.lastDayOfMonth(2022, 11);

        for(int i = 0; i <= lastDayOfMonth; i++){
            System.out.println(intDayOfTheWeek+(i-1));
            if(intDayOfTheWeek <= intDayOfTheWeek+(i-1)){
                value[intDayOfTheWeek+(i-1)] = ""+i+"";
            }
        }

        JFrame calendarWindow = new JFrame("Calendário - " + brazilDateTime);
        calendarWindow.setSize(1280,720); 

        JPanel calendarJPanel = new JPanel();
        calendarJPanel.setSize(1000, 620);
        
        JLabel greetingsJLabel = new JLabel();
        greetingsJLabel.setText(salutation);
        greetingsJLabel.setPreferredSize(new Dimension(40000, 50));
        greetingsJLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JButton back = new JButton();
        back.setText("<-");
        back.setPreferredSize(new Dimension(100, 50));
        back.setHorizontalAlignment(SwingConstants.CENTER);

        JButton week = new JButton();
        week.setText("Dezembro - 2022");
        week.setPreferredSize(new Dimension(730, 50));
        week.setHorizontalAlignment(SwingConstants.CENTER);

        JButton next = new JButton();
        next.setText("->");
        next.setPreferredSize(new Dimension(100, 50));
        next.setHorizontalAlignment(SwingConstants.CENTER);

        JTextPane space = new JTextPane();
        space.setPreferredSize(new Dimension(40000, 0));

        JButton sun = new JButton();
        sun.setText("Sun");
        sun.setPreferredSize(new Dimension(100, 50));
        sun.setHorizontalAlignment(SwingConstants.CENTER);

        JButton mon = new JButton();
        mon.setText("Mon");
        mon.setPreferredSize(new Dimension(100, 50));
        mon.setHorizontalAlignment(SwingConstants.CENTER);

        JButton tue = new JButton();
        tue.setText("Tru");
        tue.setPreferredSize(new Dimension(100, 50));
        tue.setHorizontalAlignment(SwingConstants.CENTER);

        JButton wed = new JButton();
        wed.setText("Wed");
        wed.setPreferredSize(new Dimension(100, 50));
        wed.setHorizontalAlignment(SwingConstants.CENTER);

        JButton thu = new JButton();
        thu.setText("Thu");
        thu.setPreferredSize(new Dimension(100, 50));
        thu.setHorizontalAlignment(SwingConstants.CENTER);

        JButton fri = new JButton();
        fri.setText("Fri");
        fri.setPreferredSize(new Dimension(100, 50));
        fri.setHorizontalAlignment(SwingConstants.CENTER);

        JButton sat = new JButton();
        sat.setText("Sat");
        sat.setPreferredSize(new Dimension(100, 50));
        sat.setHorizontalAlignment(SwingConstants.CENTER);

        JTextPane space1 = new JTextPane();
        space1.setPreferredSize(new Dimension(40000, 0));

        JButton element1 = new JButton();
        element1.setText(value[1]);
        element1.setPreferredSize(new Dimension(100, 50));
        element1.setHorizontalAlignment(SwingConstants.CENTER);

        JButton element2 = new JButton();
        element2.setText(value[2]);
        element2.setPreferredSize(new Dimension(100, 50));
        element2.setHorizontalAlignment(SwingConstants.CENTER);

        JButton element3 = new JButton();
        element3.setText(value[3]);
        element3.setPreferredSize(new Dimension(100, 50));
        element3.setHorizontalAlignment(SwingConstants.CENTER);

        JButton element4 = new JButton();
        element4.setText(value[4]);
        element4.setPreferredSize(new Dimension(100, 50));
        element4.setHorizontalAlignment(SwingConstants.CENTER);

        JButton element5 = new JButton();
        element5.setText(value[5]);
        element5.setPreferredSize(new Dimension(100, 50));
        element5.setHorizontalAlignment(SwingConstants.CENTER);

        JButton element6 = new JButton();
        element6.setText(value[6]);
        element6.setPreferredSize(new Dimension(100, 50));
        element6.setHorizontalAlignment(SwingConstants.CENTER);

        JButton element7 = new JButton();
        element7.setText(value[7]);
        element7.setPreferredSize(new Dimension(100, 50));
        element7.setHorizontalAlignment(SwingConstants.CENTER);

        JTextPane space2 = new JTextPane();
        space2.setPreferredSize(new Dimension(40000, 0));

        JButton element8 = new JButton();
        element8.setText(value[8]);
        element8.setPreferredSize(new Dimension(100, 50));
        element8.setHorizontalAlignment(SwingConstants.CENTER);

        JButton element9 = new JButton();
        element9.setText(value[9]);
        element9.setPreferredSize(new Dimension(100, 50));
        element9.setHorizontalAlignment(SwingConstants.CENTER);

        JButton element10 = new JButton();
        element10.setText(value[10]);
        element10.setPreferredSize(new Dimension(100, 50));
        element10.setHorizontalAlignment(SwingConstants.CENTER);

        JButton element11 = new JButton();
        element11.setText(value[11]);
        element11.setPreferredSize(new Dimension(100, 50));
        element11.setHorizontalAlignment(SwingConstants.CENTER);

        JButton element12 = new JButton();
        element12.setText(value[12]);
        element12.setPreferredSize(new Dimension(100, 50));
        element12.setHorizontalAlignment(SwingConstants.CENTER);

        JButton element13 = new JButton();
        element13.setText(value[13]);
        element13.setPreferredSize(new Dimension(100, 50));
        element13.setHorizontalAlignment(SwingConstants.CENTER);

        JButton element14 = new JButton();
        element14.setText(value[14]);
        element14.setPreferredSize(new Dimension(100, 50));
        element14.setHorizontalAlignment(SwingConstants.CENTER);

        JTextPane space3 = new JTextPane();
        space3.setPreferredSize(new Dimension(40000, 0));

        JButton element15 = new JButton();
        element15.setText(value[15]);
        element15.setPreferredSize(new Dimension(100, 50));
        element15.setHorizontalAlignment(SwingConstants.CENTER);

        JButton element16 = new JButton();
        element16.setText(value[16]);
        element16.setPreferredSize(new Dimension(100, 50));
        element16.setHorizontalAlignment(SwingConstants.CENTER);

        JButton element17 = new JButton();
        element17.setText(value[17]);
        element17.setPreferredSize(new Dimension(100, 50));
        element17.setHorizontalAlignment(SwingConstants.CENTER);

        JButton element18 = new JButton();
        element18.setText(value[18]);
        element18.setPreferredSize(new Dimension(100, 50));
        element18.setHorizontalAlignment(SwingConstants.CENTER);

        JButton element19 = new JButton();
        element19.setText(value[19]);
        element19.setPreferredSize(new Dimension(100, 50));
        element19.setHorizontalAlignment(SwingConstants.CENTER);

        JButton element20 = new JButton();
        element20.setText(value[20]);
        element20.setPreferredSize(new Dimension(100, 50));
        element20.setHorizontalAlignment(SwingConstants.CENTER);

        JButton element21 = new JButton();
        element21.setText(value[21]);
        element21.setPreferredSize(new Dimension(100, 50));
        element21.setHorizontalAlignment(SwingConstants.CENTER);

        JTextPane space4 = new JTextPane();
        space4.setPreferredSize(new Dimension(40000, 0));

        JButton element22 = new JButton();
        element22.setText(value[22]);
        element22.setPreferredSize(new Dimension(100, 50));
        element22.setHorizontalAlignment(SwingConstants.CENTER);

        JButton element23 = new JButton();
        element23.setText(value[23]);
        element23.setPreferredSize(new Dimension(100, 50));
        element23.setHorizontalAlignment(SwingConstants.CENTER);

        JButton element24 = new JButton();
        element24.setText(value[24]);
        element24.setPreferredSize(new Dimension(100, 50));
        element24.setHorizontalAlignment(SwingConstants.CENTER);

        JButton element25 = new JButton();
        element25.setText(value[25]);
        element25.setPreferredSize(new Dimension(100, 50));
        element25.setHorizontalAlignment(SwingConstants.CENTER);

        JButton element26 = new JButton();
        element26.setText(value[26]);
        element26.setPreferredSize(new Dimension(100, 50));
        element26.setHorizontalAlignment(SwingConstants.CENTER);

        JButton element27 = new JButton();
        element27.setText(value[27]);
        element27.setPreferredSize(new Dimension(100, 50));
        element27.setHorizontalAlignment(SwingConstants.CENTER);

        JButton element28 = new JButton();
        element28.setText(value[28]);
        element28.setPreferredSize(new Dimension(100, 50));
        element28.setHorizontalAlignment(SwingConstants.CENTER);

        JTextPane space5 = new JTextPane();
        space5.setPreferredSize(new Dimension(40000, 0));

        JButton element29 = new JButton();
        element29.setText(value[29]);
        element29.setPreferredSize(new Dimension(100, 50));
        element29.setHorizontalAlignment(SwingConstants.CENTER);

        JButton element30 = new JButton();
        element30.setText(value[30]);
        element30.setPreferredSize(new Dimension(100, 50));
        element30.setHorizontalAlignment(SwingConstants.CENTER);

        JButton element31 = new JButton();
        element31.setText(value[31]);
        element31.setPreferredSize(new Dimension(100, 50));
        element31.setHorizontalAlignment(SwingConstants.CENTER);

        JButton element32 = new JButton();
        element32.setText(value[32]);
        element32.setPreferredSize(new Dimension(100, 50));
        element32.setHorizontalAlignment(SwingConstants.CENTER);

        JButton element33 = new JButton();
        element33.setText(value[33]);
        element33.setPreferredSize(new Dimension(100, 50));
        element33.setHorizontalAlignment(SwingConstants.CENTER);

        JButton element34 = new JButton();
        element34.setText(value[34]);
        element34.setPreferredSize(new Dimension(100, 50));
        element34.setHorizontalAlignment(SwingConstants.CENTER);

        JButton element35 = new JButton();
        element35.setText(value[35]);
        element35.setPreferredSize(new Dimension(100, 50));
        element35.setHorizontalAlignment(SwingConstants.CENTER);

        JTextPane space6 = new JTextPane();
        space6.setPreferredSize(new Dimension(40000, 0));

        JButton element36 = new JButton();
        element36.setText(value[36]);
        element36.setPreferredSize(new Dimension(100, 50));
        element36.setHorizontalAlignment(SwingConstants.CENTER);

        JButton element37 = new JButton();
        element37.setText(value[37]);
        element37.setPreferredSize(new Dimension(100, 50));
        element37.setHorizontalAlignment(SwingConstants.CENTER);

        JButton element38 = new JButton();
        element38.setText(value[38]);
        element38.setPreferredSize(new Dimension(100, 50));
        element38.setHorizontalAlignment(SwingConstants.CENTER);

        JButton element39 = new JButton();
        element39.setText(value[39]);
        element39.setPreferredSize(new Dimension(100, 50));
        element39.setHorizontalAlignment(SwingConstants.CENTER);

        JButton element40 = new JButton();
        element40.setText(value[40]);
        element40.setPreferredSize(new Dimension(100, 50));
        element40.setHorizontalAlignment(SwingConstants.CENTER);

        JButton element41 = new JButton();
        element41.setText(value[41]);
        element41.setPreferredSize(new Dimension(100, 50));
        element41.setHorizontalAlignment(SwingConstants.CENTER);

        JButton element42 = new JButton();
        element42.setText(value[42]);
        element42.setPreferredSize(new Dimension(100, 50));
        element42.setHorizontalAlignment(SwingConstants.CENTER);

        calendarWindow.add(calendarJPanel);
        calendarJPanel.add(greetingsJLabel);
        calendarJPanel.add(back);
        calendarJPanel.add(week);
        calendarJPanel.add(next);
        calendarJPanel.add(space);
        calendarJPanel.add(sun);
        calendarJPanel.add(mon);
        calendarJPanel.add(tue);
        calendarJPanel.add(wed);
        calendarJPanel.add(thu);
        calendarJPanel.add(fri);
        calendarJPanel.add(sat);
        calendarJPanel.add(space1);
        calendarJPanel.add(element1);
        calendarJPanel.add(element2);
        calendarJPanel.add(element3);
        calendarJPanel.add(element4);
        calendarJPanel.add(element5);
        calendarJPanel.add(element6);
        calendarJPanel.add(element7);
        calendarJPanel.add(space2);
        calendarJPanel.add(element8);
        calendarJPanel.add(element9);
        calendarJPanel.add(element10);
        calendarJPanel.add(element11);
        calendarJPanel.add(element12);
        calendarJPanel.add(element13);
        calendarJPanel.add(element14);
        calendarJPanel.add(space3);
        calendarJPanel.add(element15);
        calendarJPanel.add(element16);
        calendarJPanel.add(element17);
        calendarJPanel.add(element18);
        calendarJPanel.add(element19);
        calendarJPanel.add(element20);
        calendarJPanel.add(element21);
        calendarJPanel.add(space4);
        calendarJPanel.add(element22);
        calendarJPanel.add(element23);
        calendarJPanel.add(element24);
        calendarJPanel.add(element25);
        calendarJPanel.add(element26);
        calendarJPanel.add(element27);
        calendarJPanel.add(element28);
        calendarJPanel.add(space5);
        calendarJPanel.add(element29);
        calendarJPanel.add(element30);
        calendarJPanel.add(element31);
        calendarJPanel.add(element32);
        calendarJPanel.add(element33);
        calendarJPanel.add(element34);
        calendarJPanel.add(element35);
        calendarJPanel.add(space6);
        calendarJPanel.add(element36);
        calendarJPanel.add(element37);
        calendarJPanel.add(element38);
        calendarJPanel.add(element39);
        calendarJPanel.add(element40);
        calendarJPanel.add(element41);
        calendarJPanel.add(element42);

        element1 = null;
        calendarWindow.setVisible(true);    
        calendar.saveDescription("Salvar descrição", "18-08-2001 - 08:30");
    }
}
