package agenda;

import java.time.*;

public class Event {

    private String myTitle;
    private LocalDateTime myStart;
    private Duration myDuration;

    /**
     * Constructs an event
     *
     * @param title the title of this event
     * @param start the start time of this event
     * @param duration the duration of this event
     */
    public Event(String title, LocalDateTime start, Duration duration) {
        this.myTitle = title;
        this.myStart = start;
        this.myDuration = duration;
    }

    /**
     * Tests if an event occurs on a given day
     *
     * @param aDay the day to test
     * @return true if the event occurs on that day, false otherwise
     */
    public boolean isInDay(LocalDate aDay) {
        boolean isInDay = false;
        isInDay = myStart.toLocalDate().equals(aDay);
        LocalDateTime theEnd = myStart.plus(myDuration);
        if (theEnd.toLocalDate().equals(aDay)) {
            isInDay = true;
        }
        return isInDay;
    }

    /**
     * @return the myTitle
     */
    public String getTitle() {
        return myTitle;
    }

    /**
     * @return the myStart
     */
    public LocalDateTime getStart() {
        return myStart;
    }

    /**
     * @return the myDuration
     */
    public Duration getDuration() {
        return myDuration;
    }

}
