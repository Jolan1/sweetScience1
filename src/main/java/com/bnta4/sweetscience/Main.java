package com.bnta4.sweetscience;

import com.bnta4.sweetscience.boxerStyle.BoxerStyle;
import com.bnta4.sweetscience.boxerStyle.Elements;
import com.bnta4.sweetscience.boxerStyle.TrainingPlan;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Main {

    //Coloured text in console
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW1
    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
    public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
    public static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";// YELLOW
    public static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";// BLUE
    public static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";// RED

    public static void main(String[] args) throws InterruptedException {

        //Personality Test

        Scanner Input = new Scanner(System.in);
        System.out.println(BLUE_BACKGROUND_BRIGHT + BLACK_BOLD_BRIGHT +
                "----------------------------------------------------SweetScience" +
                "----------------------------------------------------"+ ANSI_RESET);
        sleep(1000);
        System.out.println( "Hi, welcome to the sweetScience portal, a " +
                "place for all boxers to discover their boxing " +
                "style and train accordingly! " );
        sleep(1000);
        System.out.println("What is your name?");
        String userName = Input.nextLine();
        System.out.println("Hi " + userName + ", lets discover your boxing style...");
        sleep(1000);
        System.out.println("\nWould you rather meditate or pray?(Please Enter: 'a' 'b' 'c' or 'd'.)\n" +
                "a) Both. \n" +
                "b) Meditate. \n" +
                "c) Pray. \n" +
                "d) I'm more of a deep thinker.");
        String answerOne = Input.nextLine();
        System.out.println("How did you spend your last birthday?(Please Enter: 'a' 'b' 'c' or 'd'.)\n" +
                "a) I spent it with family. \n" +
                "b) I spent the day alone. \n" +
                "c) I spent it with friends. \n" +
                "d) I spent it at work. ");
        String answerTwo = Input.nextLine();
        System.out.println("Which best describes you?(Please Enter: 'a' 'b' 'c' or 'd'.)\n" +
                "a) Authentic.\n" +
                "b) Relaxed.\n" +
                "c) Driven.\n" +
                "d) Reliable.");
        String answerThree = Input.nextLine();
        System.out.println("How would you build a fire?(Please Enter: 'a' 'b' 'c' or 'd'.)\n" +
                "a) I would rub two sticks together.\n" +
                "b) I would use matches.\n" +
                "c) Gasoline solves everything.\n" +
                "d) I would use a fire starter.");
        String answerFour = Input.nextLine();
        System.out.println("What movie genre do you watch most often?(Please Enter: 'a' 'b' 'c' or 'd'.)\n" +
                "a) Horror\n" +
                "b) Rom-com\n" +
                "c) Action/Adventure\n" +
                "d) Documentary");
        String answerFive = Input.nextLine();
        System.out.println("What happens to your soul when you die?(Please Enter: 'a' 'b' 'c' or 'd'.)\n" +
                "a) I believe it goes to heaven.\n" +
                "b) I believe in reincarnation.\n" +
                "c) I have no idea.\n" +
                "d) I hope I get to go to space.");
        String answerSixth = Input.nextLine();
        System.out.println("Which describes your soul best?(Please Enter: 'a' 'b' 'c' or 'd'.)\n" +
                "a) Unique\n" +
                "b) Free\n" +
                "c) Kind\n" +
                "d) Old");
        //Score calculation
        String answerSeventh = Input.nextLine();

        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        if (answerOne.equalsIgnoreCase("a")) {
            aCount++;
        } else if (answerOne.equalsIgnoreCase("b")) {
            bCount++;
        } else if (answerOne.equalsIgnoreCase("c")) {
            cCount++;
        } else if (answerOne.equalsIgnoreCase("d")) {
            bCount++;
        } else {
            System.out.println("Sorry " + userName + "Invalid answer, please try again. ('a' 'b' 'c' or 'd')");
        }
        if (answerTwo.equalsIgnoreCase("a")) {
            aCount++;
        } else if (answerTwo.equalsIgnoreCase("b")) {
            bCount++;
        } else if (answerTwo.equalsIgnoreCase("c")) {
            cCount++;
        } else if (answerTwo.equalsIgnoreCase("d")) {
            bCount++;
        } else {
            System.out.println("Sorry " + userName + "Invalid answer, please try again. ('a' 'b' 'c' or 'd')");
        }
        if (answerThree.equalsIgnoreCase("a")) {
            aCount++;
        } else if (answerThree.equalsIgnoreCase("b")) {
            bCount++;
        } else if (answerThree.equalsIgnoreCase("c")) {
            cCount++;
        } else if (answerThree.equalsIgnoreCase("d")) {
            bCount++;
        } else {
            System.out.println("Sorry " + userName + "Invalid answer, please try again. ('a' 'b' 'c' or 'd')");
        }
        if (answerFour.equalsIgnoreCase("a")) {
            aCount++;
        } else if (answerFour.equalsIgnoreCase("b")) {
            bCount++;
        } else if (answerFour.equalsIgnoreCase("c")) {
            cCount++;
        } else if (answerFour.equalsIgnoreCase("d")) {
            bCount++;
        } else {
            System.out.println("Sorry " + userName + "Invalid answer, please try again. ('a' 'b' 'c' or 'd')");
        }
        if (answerFive.equalsIgnoreCase("a")) {
            aCount++;
        } else if (answerFive.equalsIgnoreCase("b")) {
            bCount++;
        } else if (answerFive.equalsIgnoreCase("c")) {
            cCount++;
        } else if (answerFive.equalsIgnoreCase("d")) {
            bCount++;
        } else {
            System.out.println("Sorry " + userName + "Invalid answer, please try again. ('a' 'b' 'c' or 'd')");
        }
        if (answerSixth.equalsIgnoreCase("a")) {
            aCount++;
        } else if (answerSixth.equalsIgnoreCase("b")) {
            bCount++;
        } else if (answerSixth.equalsIgnoreCase("c")) {
            cCount++;
        } else if (answerSixth.equalsIgnoreCase("d")) {
            bCount++;
        } else {
            System.out.println("Sorry " + userName + "Invalid answer, please try again. ('a' 'b' 'c' or 'd')");
        }
        if (answerSeventh.equalsIgnoreCase("a")) {
            aCount++;
        } else if (answerSeventh.equalsIgnoreCase("b")) {
            bCount++;
        } else if (answerSeventh.equalsIgnoreCase("c")) {
            cCount++;
        } else if (answerSeventh.equalsIgnoreCase("d")) {
            bCount++;
        } else {
            System.out.println("Sorry " + userName + "Invalid answer, please try again. ('a' 'b' 'c' or 'd')");
        }
        //assign element, boxing style and training plan based on score.

        if (aCount > bCount && aCount > cCount && aCount > dCount) {
            System.out.println("Your Results are in:\nPersonality: " + Elements.WATER + " (Intuitive, " +
                    "Emotional, " +
                    "Nurturer " +
                    "and Environment-conscious.\nBoxing Style: " + BoxerStyle.SWARMER +"\nTraining Plan: " + TrainingPlan.FRAZIER101);
        } else if (bCount > aCount && bCount > cCount && bCount > dCount) {
            System.out.println("Your Results are in:\nPersonality: " + Elements.EARTH + " (Patient and Practical, " +
                    "Hard Working and Stability seeking.\nBoxing Style: " + BoxerStyle.BOXER_PUNCHER +"\nTraining " +
                    "Plan: " + TrainingPlan.TYSON101);
        } else if (cCount > aCount && cCount > bCount && cCount > dCount) {
            System.out.println("Your Results are in:\nPersonality: " + Elements.FIRE + " (Spontaneous, Enthusiastic, " +
                    "Driven, Adventure Seeker and Intuitive.\nBoxing Style: " + BoxerStyle.SLUGGER +"\nTraining " +
                    "Plan: " + TrainingPlan.COURTENAY101);
        } else if (dCount > aCount && dCount > bCount && dCount > cCount) {
            System.out.println("Your Results are in:\nPersonality: " + Elements.AIR + " (Social, Objective, " +
                    "Communicator and Observer.\nBoxing Style: " + BoxerStyle.OUT_BOXER +"\nTraining Plan: " + TrainingPlan.ALI101);
        }
    }
}
