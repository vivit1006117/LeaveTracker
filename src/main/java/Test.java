import com.google.api.client.util.DateTime;
import com.google.api.services.calendar.model.Event;
import main.calenderApiConections.GetCalenderData;
import main.calenderApiConections.InsertCalenderData;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        GetCalenderData getCalenderData = new GetCalenderData();
        List<Event> items = getCalenderData.getEventDetails();

        for (Event event : items) {
            DateTime start = event.getStart().getDateTime();
            DateTime end = event.getEnd().getDateTime();
            SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");
            if (start == null) {
                start = event.getStart().getDate();
                end = event.getEnd().getDate();
            }
            System.out.printf("%s (%s) (%s)\n", event.getSummary(), start, end);
        }

        InsertCalenderData insertCalenderData = new InsertCalenderData();
        insertCalenderData.insertEvent();
    }
}
