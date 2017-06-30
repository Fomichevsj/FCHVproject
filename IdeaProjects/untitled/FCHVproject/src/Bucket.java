import com.sun.jmx.snmp.Timestamp;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by safomichev on 23.06.2017.
 */
public class Bucket {
    public static void main(String [] args) {

        Date date = new Date();

        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.HOUR, -1);
        date = c.getTime();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateFormat.format( date ) );
      

    }
}
