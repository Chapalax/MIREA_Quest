package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private final String name;
    private final ArrayList<Locations> gameLocations;
    private final ArrayList<Situations> gameSituations;
    private Scanner scan;
    private final Karma karma;

    public Game(String name, ArrayList<Locations> gameLocations, ArrayList<Situations> gameSituations) {
        this.name = name;
        this.gameLocations = gameLocations;
        this.gameSituations = gameSituations;
        this.karma = new Karma();
    }

    public void prestart() throws InterruptedException {
        System.out.println("Добро пожаловать в " + this.name + "!");
        System.out.println("В этот прекрасный день вас ожидает не менее прекрасный квест по нашему университету!");
        System.out.println("Для того, чтобы отвечать на вопросы, пожалуйста, указывайте только цифру варианта.");
        System.out.println("Желаем приятной игры!");
        Thread.sleep(500);
        System.out.println("Перед вами открываются двери института (просто придержал кто-то), и вы попадаете в главный корпус МИРЭА...");
        System.out.println("Пожалуйста, введите своё имя");
    }

    public void start(){
        scan = new Scanner(System.in);
        for (Locations l : this.gameLocations) {
            System.out.println("Выберите, куда вы хотите двигаться? ");
            for (Answer a : l.getAnswers()) {
                System.out.println(a.getVariant());
            }
            int a = scan.nextInt();
            if(a == 1){
                for(Situations s : this.gameSituations){
                    System.out.println(s.getAnswers()[0][0].getVariant());
                    for(Answer w : s.getAnswers()[1]){
                        System.out.println(w.getVariant());
                    }
                    int b = scan.nextInt();
                    if(b == 1){
                        Karma.karma += s.getAnswers()[1][0].getScore();
                    }
                    else if(b == 2){
                        Karma.karma += s.getAnswers()[1][1].getScore();
                    }
                    else if(b == 3){
                        Karma.karma += s.getAnswers()[1][2].getScore();
                    }
                    else{
                        Karma.karma += s.getAnswers()[1][3].getScore();
                    }
                    karma.check();
                }
            }
            else if(a == 2){
                for(Situations s : this.gameSituations){
                    System.out.println(s.getAnswers()[0][1].getVariant());
                    for(Answer w : s.getAnswers()[2]){
                        System.out.println(w.getVariant());
                    }
                    int b = scan.nextInt();
                    if(b == 1){
                        Karma.karma += s.getAnswers()[2][0].getScore();
                    }
                    else if(b == 2){
                        Karma.karma += s.getAnswers()[2][1].getScore();
                    }
                    else if(b == 3){
                        Karma.karma += s.getAnswers()[2][2].getScore();
                    }
                    else{
                        Karma.karma += s.getAnswers()[2][3].getScore();
                    }
                    karma.check();
                }
            }
            else if(a == 3){
                for(Situations s : this.gameSituations){
                    System.out.println(s.getAnswers()[0][2].getVariant());
                    for(Answer w : s.getAnswers()[3]){
                        System.out.println(w.getVariant());
                    }
                    int b = scan.nextInt();
                    if(b == 1){
                        Karma.karma += s.getAnswers()[3][0].getScore();
                    }
                    else if(b == 2){
                        Karma.karma += s.getAnswers()[3][1].getScore();
                    }
                    else if(b == 3){
                        Karma.karma += s.getAnswers()[3][2].getScore();
                    }
                    else{
                        Karma.karma += s.getAnswers()[3][3].getScore();
                    }
                    karma.check();
                }
            }
            else{
                for(Situations s : this.gameSituations){
                    System.out.println(s.getAnswers()[0][3].getVariant());
                    for(Answer w : s.getAnswers()[4]){
                        System.out.println(w.getVariant());
                    }
                    int b = scan.nextInt();
                    if(b == 1){
                        Karma.karma += s.getAnswers()[4][0].getScore();
                    }
                    else if(b == 2){
                        Karma.karma += s.getAnswers()[4][1].getScore();
                    }
                    else if(b == 3){
                        Karma.karma += s.getAnswers()[4][2].getScore();
                    }
                    else{
                        Karma.karma += s.getAnswers()[4][3].getScore();
                    }
                    karma.check();
                }
            }
        }
    }
}
