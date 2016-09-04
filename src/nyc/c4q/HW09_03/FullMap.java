package nyc.c4q.HW09_03;

/**
 * Created by HW09_03 on 9/2/16.
 */
public class FullMap {
    //Dont have to use new operator???
    MapSquare start = new MapSquare(Events.START_EVENT);
    int squareCount;
    MapSquare positionHolder = start;


    public Events getEvent(){
        return start.getEvent();
    }

    public void createRight(){
        if(start.right!=null){
            System.out.println("There is already something there!");
        }
        MapSquare right = new MapSquare();
        start.right = right;
        right.left = start;
        start.right.event = Events.NOTHING;
        squareCount++;
    }

    public void createLeft(){
        if(start.left!=null){
            System.out.println("There is already something there!");
        }
        MapSquare left = new MapSquare();
        start.left = left;
        left.right = start;
        start.left.event = Events.NOTHING;
        squareCount++;
    }

    public void createUp(){
        if(start.up!=null){
            System.out.println("There is already something there!");
        }
        MapSquare up = new MapSquare();
        start.up = up;
        up.down = start;
        start.up.event = Events.NOTHING;
        squareCount++;
    }

    public void createDown(){
        if(start.down!=null){
            System.out.println("There is already something there!");
        }
        MapSquare down = new MapSquare();
        start.down = down;
        down.up = start;
        start.down.event = Events.NOTHING;
        squareCount++;
    }

    public void createRight(Events event){
        if(start.right!=null){
            System.out.println("There is already something there!");
        }
        MapSquare right = new MapSquare();
        start.right = right;
        right.left = start;
        start.right.event = event;
        squareCount++;
    }

    public void createLeft(Events event){
        if(start.left!=null){
            System.out.println("There is already something there!");
        }
        MapSquare left = new MapSquare();
        start.left = left;
        left.right = start;
        start.left.event = event;
        squareCount++;
    }

    public void createUp(Events event){
        if(start.up!=null){
            System.out.println("There is already something there!");
        }
        MapSquare up = new MapSquare();
        start.up = up;
        up.down = start;
        start.up.event = event;
        squareCount++;
    }

    public void createDown(Events event){
        if(start.down!=null){
            System.out.println("There is already something there!");
        }
        MapSquare down = new MapSquare();
        start.down = down;
        down.up = start;
        start.down.event = event;
        squareCount++;
    }


    public void goDown(){
        if(start.down == null){
            System.out.println("\u001B[1m That isnt a spot.. You fall into an abyss");
            start = positionHolder;
            return;
        }
        start = start.down;
    }

    public void goLeft(){
        if(start.left == null){
            System.out.println("\u001B[1m That isnt a spot.. You fall into an abyss");
            start = positionHolder;
            return;
        }
        start = start.left;
    }

    public void goRight(){
        if(start.right == null){
            System.out.println("\u001B[1m That isnt a spot.. You fall into an abyss");
            start = positionHolder;
            return;
        }
        start = start.right;
    }

    public void goUp(){
        if(start.up == null){
            System.out.println("\u001B[1m That isnt a spot.. You fall into an abyss");
            start = positionHolder;
            return;
        }
        start = start.up;
    }

    public void createMap(){
        createRight(Events.WHIRLWIND_EVENT);
        goRight();
        createUp(Events.KEY);
        goUp();
        createRight(Events.LOST_CHILD);
        start = positionHolder;
        goRight();
        for(int i=0; i<6; i++){
            createRight();
            goRight();
        }
        createDown(Events.OUTCOME_EVENT);
        start = positionHolder;
        goRight();
        createDown(Events.DRUG_DEALER);
        goDown();
        createRight(Events.OGRE);
        goRight();
        createRight(Events.GARDEN);
        goRight();
        createRight(Events.HOMELESS_GUY);
        goRight();
        start = positionHolder;
    }
}
