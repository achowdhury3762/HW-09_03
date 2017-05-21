package nyc.c4q.HW09_03;

import java.util.Scanner;

public class Main {
    static final FullMap map = new FullMap();
    static int child = 0, key = 0;
    static boolean restart = true;
    static StringBuilder mapString = new StringBuilder(
            "\t\t\t\t\t\t\t\t     [ ]--[ ]                         \n" +
            "\t\t\t\t\t\t\t\t      |                               \n" +
            "\t\t\t\t\t\t\t\t[X]--[ ]--[ ]--[ ]--[ ]--[ ]--[ ]--[ ]\n" +
            "\t\t\t\t\t\t\t\t      |                             | \n" +
            "\t\t\t\t\t\t\t\t     [ ]--[ ]--[ ]--[ ]            [ ] ") ;

    public static void main(String[] args) {
        MapGameViewImpl view = new MapGameViewImpl();
        Scanner input = new Scanner(System.in);
        view.startGame(input);
    }

//
//        int key = 0, child = 0;
//        map.createMap();
//        System.out.println(mapString+"\n");
//        readEvent(map.getEvent());
//
//        while(restart){
//            String input = readInput();
//            if(input.equalsIgnoreCase("Right")){
//                goRight();
//                int index = mapString.indexOf("X");
//                mapString.setCharAt(index, ' ');
//                mapString.setCharAt(index+5, 'X');
//                System.out.println(mapString);
//                map.getEvent();
//                readEvent(map.getEvent());
//
//            }
//            else if(input.equalsIgnoreCase("Left")){
//                goLeft();
//                int index = mapString.indexOf("X");
//                mapString.setCharAt(index, ' ');
//                mapString.setCharAt(index-5, 'X');
//                System.out.println(mapString);
//                map.getEvent();
//                readEvent(map.getEvent());
//
//            }
//            else if(input.equalsIgnoreCase("Up")){
//                goUp();
//                int index = mapString.indexOf("X");
//                mapString.setCharAt(index, ' ');
//                mapString.setCharAt(index-94, 'X');
//                System.out.println(mapString);
//                map.getEvent();
//                readEvent(map.getEvent());
//
//            }
//            else if(input.equalsIgnoreCase("Down")){
//                map.goDown();
//                int index = mapString.indexOf("X");
//                mapString.setCharAt(index, ' ');
//                mapString.setCharAt(index+94, 'X');
//                System.out.println(mapString);
//                map.getEvent();
//                readEvent(map.getEvent());
//            }
//        }
//    }
//
//    public static void readEvent(Event event){
//        switch(event){
//            case START_EVENT:
//                System.out.println("\u001B[1m Game Start! You are stuck in a tunnel, find the exit. Input a direction! (LEFT DOWN RIGHT UP)");
//                break;
//            case WHIRLWIND_EVENT:
//                System.out.println("\u001B[1m You have stepped into a whirlwind! But you survive");
//                break;
//            case OUTCOME_EVENT:
//                if(key==1) {
//                    System.out.println("\u001B[1m You see a door. Let's see if you have a key...");
//                    System.out.println("\u001B[1m Congratulations, you have the key! You have escaped!");
//                }
//                else {
//                    System.out.println("\u001B[1m You see a door. But you have no key... You die from depression. GAME OVER");
//                    restart = false;
//                }
//                break;
//            case LOST_CHILD:
//                System.out.println("\u001B[1m You have found a lost child who appears to be ill.. You take him along");
//                child = 1;
//                break;
//            case OGRE:
//                System.out.println("\u001B[1m You have stumbled across an Ogre.. He looks starved.");
//
//                if(child == 1) {
//                    System.out.println("\u001B[1m You have managed to escape by ditching the child!");
//                }
//                else {
//                    System.out.println("\u001B[1m The Ogre catches you and enslaves you forever. GAME OVER");
//                    restart = false;
//                }
//                break;
//            case KEY:
//                System.out.println("\u001B[1m You have found the key to the exit!");
//                break;
//            case DRUG_DEALER:
//                System.out.println("\u001B[1m A person dressed in black approaches you. He looks shady, lets run away");
//                break;
//            case HOMELESS_GUY:
//                System.out.println("\u001B[1m You have stumbled across a violent homeless man, he steals your key and flees");
//                break;
//            case GARDEN:
//                System.out.println("\u001B[1m You see a beautiful garden. Maybe you should stay. You don't");
//                break;
//            case NOTHING:
//                System.out.println("\u001B[1m Empty Room");
//        }
//    }
//
//
//    public static void goRight(){
//        map.goRight();
//    }
//
//    public static void goUp(){
//        map.goUp();
//    }
//
//    public static void goLeft(){
//        map.goLeft();
//    }
//
//    public static void goDown(){
//        map.goDown();
//    }
//
//
//    public static boolean allConditionsExit(){
//        return true;
//    }
//
//    public static String readInput() {
//        Scanner sc = new Scanner(System.in);
//        return sc.next();
//    }

}