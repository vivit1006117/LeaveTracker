package main.calenderApiConections;

import org.springframework.stereotype.Component;

@Component
public class GetCalenderData1 extends GlobalInstances1 {

//    public Calendar getCalendarService() throws IOException {
//        Authorization1 authorization1 = new Authorization1();
//        Credential credential = authorization1.authorize();
//
//        return new Calendar.Builder(
//                HTTP_TRANSPORT, JSON_FACTORY, credential)
//                .setApplicationName(APPLICATION_NAME)
//                .build();
//    }
//
//    public List<Event> getEventDetails() throws IOException {
//        Calendar service = getCalendarService();
//
//        DateTime now = new DateTime(System.currentTimeMillis());
////        Events main.events = service.main.events().list(" thoughtworks.com_mpl97cvn9ms82612kushkoeac4@group.calendar.google.com")
//        Events main.events = service.main.events().list("thoughtworks.com_695d8lhg9akcmr1kam3u3iea3o@group.calendar.google.com")
//                .setTimeMin(now)
//                .setOrderBy("startTime")
//                .setSingleEvents(true)
//                .execute();
//
//        List<Event> items = main.events.getItems();
//        if (items.size() == 0) {
//            System.out.println("No upcoming main.events found.");
//        } else {
//            System.out.println("Upcoming main.events");
//            return items;
//        }
//        return null;
//    }
}