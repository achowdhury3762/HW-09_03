package nyc.c4q.HW09_03;

import nyc.c4q.HW09_03.enums.Event;

public class MapRoom {
    MapRoom up = null;
    MapRoom down = null;
    MapRoom left = null;
    MapRoom right = null;
    Event event;

    public MapRoom(){}

    public MapRoom(Event event) {
        this.event = event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Event getEvent() {
        return event;
    }
}
