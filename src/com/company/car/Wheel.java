package com.company.car;

import java.util.Random;
import java.util.Scanner;

public class Wheel extends Event{

    Scanner sc = new Scanner(System.in);
    String userWord;

    /**
     * Effectue les evenements pouvant survenir pendant la course
     */
    @Override
    public void event() {
        super.event();
        Random r = new Random();
        int wheelBug = r.nextInt(4);
        if (wheelBug == 0) {
            leftUpWheel();
        } else if (wheelBug == 1){
            rightUpWheel();
        } else if (wheelBug == 2){
            leftDownWheel();
        } else {
            rightDownWheel();
        }
        System.out.println("La roue a été changé, la course reprends !");
    }

    /**
     * Evenement pour reparer la roue avant gauche
     */
    private void leftUpWheel(){
        System.out.println("Oh Non ! La roue avant gauche a crevé !");
        goLeft("Appuie sur L pour sortir de la voiture");
        goUp();
        changeWheel();
        goDown();
        goRight("Appuie sur R pour retourner dans la voiture et reprendre la course !");
    }

    /**
     * Evenement pour reparer la roue avant droite
     */
    private void rightUpWheel(){
        System.out.println("Oh Non ! La roue avant droite a crevé !");
        goLeft("Appuie sur L pour sortir de la voiture");
        goUp();
        goRight("Appuie sur R pour aller vers la droite");
        changeWheel();
        goLeft("Appuie sur L pour aller vers la gauche");
        goDown();
        goRight("Appuie sur R pour retourner dans la voiture et reprendre la course !");
    }

    /**
     * Evenement pour reparer la roue arrière gauche
     */
    private void leftDownWheel(){
        System.out.println("Oh Non ! La roue arrière gauche a crevé !");
        goLeft("Appuie sur L pour sortir de la voiture");
        goDown();
        changeWheel();
        goUp();
        goRight("Appuie sur R pour retourner dans la voiture et reprendre la course !");
    }

    /**
     * Evenement pour reparer la roue arrière droite
     */
    private void rightDownWheel(){
        System.out.println("Oh Non ! La roue arrière droite a crevé !");
        goLeft("Appuie sur L pour sortir de la voiture");
        goDown();
        goRight("Appuie sur R pour aller vers la droite");
        changeWheel();
        goLeft("Appuie sur L pour aller vers la gauche");
        goUp();
        goRight("Appuie sur R pour retourner dans la voiture et reprendre la course !");
    }

    /**
     * Permet au pilote de se deplacer vers l'avant
     */
    private void goUp(){
        System.out.println("Appuie sur U pour aller vers l'avant");
        userWord = sc.next();
        while (!userWord.equals("U")){
            userWord = sc.next();
            if (!userWord.equals("U")){
                System.out.println("Ce n'est pas la bonne action");
            }
        }
    }

    /**
     * Permet au pilote de se deplacer vers l'arrière
     */
    private void goDown(){
        System.out.println("Appuie sur D pour aller vers l'arrière");
        userWord = sc.next();
        while (!userWord.equals("D")){
            userWord = sc.next();
            if (!userWord.equals("D")){
                System.out.println("Ce n'est pas la bonne action");
            }
        }
    }

    /**
     * Permet au pilote de se deplacer vers la droite
     */
    private void goRight(String message){
        System.out.println(message);
        userWord = sc.next();
        while (!userWord.equals("R")){
            userWord = sc.next();
            if (!userWord.equals("R")){
                System.out.println("Ce n'est pas la bonne action");
            }
        }
    }

    /**
     * Permet au pilote de se deplacer vers la gauche
     */
    private void goLeft(String message){
        System.out.println(message);
        userWord = sc.next();
        while (!userWord.equals("L")){
            userWord = sc.next();
            if (!userWord.equals("L")){
                System.out.println("Ce n'est pas la bonne action");
            }
        }
    }

    /**
     * Permet au pilote de changer la roue
     */
    private void changeWheel(){
        System.out.println("Appuie sur C pour changer la roue");
        userWord = sc.next();
        while (!userWord.equals("C")){
            userWord = sc.next();
            if (!userWord.equals("C")){
                System.out.println("Ce n'est pas la bonne action");
            }
        }
    }
}
