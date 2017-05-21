package nyc.c4q.HW09_03;

import nyc.c4q.HW09_03.enums.Event;

public class FullMap {
    private MapRoom start = new MapRoom(Event.START_EVENT);
    private MapRoom positionInMap = start;
    private int roomCount;

    public void createRight() {
        if (start.right != null) {
            System.out.println("There is already something there!");
        }
        MapRoom right = new MapRoom();
        start.right = right;
        right.left = start;
        start.right.event = Event.NOTHING;
        roomCount++;
    }

    public void createLeft() {
        if (start.left != null) {
            System.out.println("There is already something there!");
        }
        MapRoom left = new MapRoom();
        start.left = left;
        left.right = start;
        start.left.event = Event.NOTHING;
        roomCount++;
    }

    public void createUp() {
        if (start.up != null) {
            System.out.println("There is already something there!");
        }
        MapRoom up = new MapRoom();
        start.up = up;
        up.down = start;
        start.up.event = Event.NOTHING;
        roomCount++;
    }

    public void createDown() {
        if (start.down != null) {
            System.out.println("There is already something there!");
        }
        MapRoom down = new MapRoom();
        start.down = down;
        down.up = start;
        start.down.event = Event.NOTHING;
        roomCount++;
    }

    public void createRight(Event event) {
        if (start.right != null) {
            System.out.println("There is already something there!");
        }
        MapRoom right = new MapRoom();
        start.right = right;
        right.left = start;
        start.right.event = event;
        roomCount++;
    }

    public void createLeft(Event event) {
        if (start.left != null) {
            System.out.println("There is already something there!");
        }
        MapRoom left = new MapRoom();
        start.left = left;
        left.right = start;
        start.left.event = event;
        roomCount++;
    }

    public void createUp(Event event) {
        if (start.up != null) {
            System.out.println("There is already something there!");
        }
        MapRoom up = new MapRoom();
        start.up = up;
        up.down = start;
        start.up.event = event;
        roomCount++;
    }

    public void createDown(Event event) {
        if (start.down != null) {
            System.out.println("There is already something there!");
        }
        MapRoom down = new MapRoom();
        start.down = down;
        down.up = start;
        start.down.event = event;
        roomCount++;
    }


    public void goDown() {
        if (start.down == null) {
            System.out.println("\u001B[1m That isnt a spot.. You fall into an abyss");
            start = positionInMap;
            return;
        }
        start = start.down;
    }

    public void goLeft() {
        if (start.left == null) {
            System.out.println("\u001B[1m That isnt a spot.. You fall into an abyss");
            start = positionInMap;
            return;
        }
        start = start.left;
    }

    public void goRight() {
        if (start.right == null) {
            System.out.println("\u001B[1m That isnt a spot.. You fall into an abyss");
            start = positionInMap;
            return;
        }
        start = start.right;
    }

    public void goUp() {
        if (start.up == null) {
            System.out.println("\u001B[1m That isnt a spot.. You fall into an abyss");
            start = positionInMap;
            return;
        }
        start = start.up;
    }

    public MapRoom getStartPosition() {
        return positionInMap;
    }

    public void createRandomMap() {
        createRight(Event.WHIRLWIND_EVENT);
        goRight();
        createUp(Event.KEY);
        goUp();
        createRight(Event.LOST_CHILD);
        start = positionInMap;
        goRight();
        for (int i = 0; i < 6; i++) {
            createRight();
            goRight();
        }
        createDown(Event.OUTCOME_EVENT);
        start = positionInMap;
        goRight();
        createDown(Event.DRUG_DEALER);
        goDown();
        createRight(Event.OGRE);
        goRight();
        createRight(Event.GARDEN);
        goRight();
        createRight(Event.HOMELESS_GUY);
        goRight();
        start = positionInMap;
    }
}
