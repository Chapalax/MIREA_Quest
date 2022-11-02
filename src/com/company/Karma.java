package com.company;

public class Karma{
    public static int karma = 1;

    public void check(){
        if(karma <= 0){
            System.out.println("Ты собрал слишком много долгов и КАРМИЧЕСКИХ МИНУСОВ, и тебя отчислили. :с");
        }
        else if(karma > 0 && karma < 10){
            System.out.println("На данный момент ваша карма составляет: " + karma);

        }
        else{
            System.out.println("Мои поздравления, " + StudentIT.name + "! Ты пережил сегодняшний день! Удачи на сессии! :*");
        }
    }
    static class StudentIT{
        public static String name;

        public StudentIT(String name) {
            StudentIT.name = name;
        }
    }
}
