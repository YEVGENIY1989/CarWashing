package chalykh.carWash.helper;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class DataAndTime {

    private List<String> daysOfWeek;
    private List<String> timeOfDay;
    private List<String> datesWeek;


    public DataAndTime(){

        timeOfDay = new ArrayList<>(24);

        for(int i = 0; i <= 24; i++){

            if(i < 10)
                timeOfDay.add(String.format("00:%02d", i));
            else
                timeOfDay.add(String.format("%02d:00", i));

        }
        updatesDateOfWeek();

    }


    public void updatesDateOfWeek(){

        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        datesWeek = new ArrayList<>(7);
        datesWeek.add(dateFormat.format(date));

        for(int i = 1; i < 7 ; i++){
            cal.add(Calendar.DAY_OF_WEEK, 1);
            date = cal.getTime();
            datesWeek.add(dateFormat.format(date));
        }

    }

    public List<String> getTimeOfDay() {
        return timeOfDay;
    }

    public List<String> getDatesWeek() {
        return datesWeek;
    }
}
