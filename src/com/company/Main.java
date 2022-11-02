package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Locations locations = new Locations();
        Scanner s = new Scanner(System.in);
        Answer[] answers1 = {
                new Answer("1. Информатика", 0),
                new Answer("2. Процедурное программирование", 0),
                new Answer("3. Курилка", 0),
                new Answer("4. Физика", 0)
        };
        locations.setAnswers(answers1);
        Persons[] persons1 = {
                new Persons("Норица В.М."),
                new Persons("Евстигнеева О.А."),
                new Persons("Староста"),
                new Persons("Давыдов В.А.")
        };
        Situations situations = new Situations();
        situations.setPersons(persons1);
        Answer[][] answers2 = {
                {
                    new Answer("Добро пожаловать в ад, здесь ты можешь отмолить свои грехи в Logisim, а также потратить несколько ночей на бессмысленные отчёты!" + "\nПеред тобой " + persons1[0].getName() + ", которая говорит, что твоя карта Карно не минимизирована. Твои действия?", 0),
                    new Answer("Перед вами " + persons1[1].getName() + ":\"Здравствуй, дружочек! Проходи, присаживайся. Знаешь С++? Тогда сделай-ка мне нейросеть по-быстренкому за пару\"", 0),
                    new Answer("Поздравляю, пара успешно пропущена, но неожиданно " + persons1[2].getName() + " замечает тебя здесь. Твои действия?", 0),
                    new Answer(persons1[3].getName() + "\"Добрый день, уважаемые любители физики, сегодня я приготовил для вас свою ЛЮБИМУЮ задачку. Любимая она потому, что в ней ничего не дано. \ndT/dV * Cv + Cp - RT/V^P + ln(P*dR). Собственно, вот и вся задачка, вопросы?\"", 0)
                },
                {
                    new Answer("1. Я сейчас всё исправлю, подождите немного, пожалуйста", 1),
                    new Answer("2. Как это, в Logisim'e же всё сходится? - сходится. Значит всё верно.", -1),
                    new Answer("3. Может договоримся?", -3),
                    new Answer("4. Где Серёга? Он же обещал за индийский чай сделать всё как надо...", 3)
                },
                {
                    new Answer("1. Я ещё 3 дз не сдал.. Помогите, пожалуйста...", 0),
                    new Answer("2. ПОЧЕМУ Я, А НЕ ОН???", -1),
                    new Answer("3. Как ссуду посчитать?", 0),
                    new Answer("4. Написать нейросеть", 2)
                },
                {
                    new Answer("1. Может по пивку?)", 2),
                    new Answer("2. Предложить покурить", 1),
                    new Answer("3. Тоже пару прогуливаешь?", -3),
                    new Answer("4. Только не ставь н, пожалуйста...", -1)
                },
                {
                    new Answer("1. Уснуть", 1),
                    new Answer("2. Плакать", 0),
                    new Answer("3. Зачем вам бутылка на ключах?", 2),
                    new Answer("4. Какого чёрта?", -2)
                }
        };
        situations.setAnswers(answers2);

        ArrayList<Locations> locationsArrayList = new ArrayList<>();
        locationsArrayList.add(locations);
        ArrayList<Situations> situationsArrayList = new ArrayList<>();
        situationsArrayList.add(situations);
        Game game = new Game("МИРЭА", locationsArrayList, situationsArrayList);
        game.prestart();
        Karma.StudentIT.name = s.next();
        while (Karma.karma > 0 && Karma.karma < 10) game.start();
    }
}
