package nyc.c4q.HW09_03;

/**
 * Created by HW09_03 on 9/2/16.
 */
public class MapSquare {
    MapSquare up = null;
    MapSquare down = null;
    MapSquare left = null;
    MapSquare right = null;
    Events event;

    public MapSquare(){};

    public MapSquare(Events event){
        this.event = event;
    }

    public void setEvent(Events event){
        this.event = event;
    }

    public Events getEvent(){
        return event;
    }
}
