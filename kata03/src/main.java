
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * main
 */
public class main {

    public static void main(String[] args) throws ParseException {
        String start = "01/01/2021";
        String end = "01/01/3000";

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
       
        Calendar scal = Calendar.getInstance();
        scal.setTime(dateFormat.parse(start));
        Calendar ecal = Calendar.getInstance();
        ecal.setTime(dateFormat.parse(end));

        ArrayList<String> friday13Dates = new ArrayList<>();

        int friday13Count = 0;
        while (!scal.equals(ecal)) {
            scal.add(Calendar.DATE, 1);
            if (scal.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY && scal.get(Calendar.DAY_OF_MONTH) == 13) {
                String formatted = dateFormat.format(scal.getTime());
                friday13Dates.add(formatted);

                friday13Count++;
            }
        }
        System.out.println(friday13Dates);
        System.out.println("There is " + friday13Count + " spookey fridayes\n");
    }
}