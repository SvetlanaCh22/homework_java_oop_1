/*
Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм

Разработать иерархию классов персонажей описанных в таблице.
Провести анализ(абстракция) полей необходимых данных и перенести
общие в базовый класс. Так же в базовом классе переопределить
метод toString для вывода подробной информации о персонаже.

Описать удобный конструктор базового класса и классов наследников так,
чтобы необходимые параметры передавались вызовом пустого конструктора
класса наследника. В основном классе создать список и заполнить
его экземплярами каждого нового класса.

Вывести в консоль содержание списка переопределённым методом toString().
*Создать список из 50 персонажей выбранных случайным числом и статический
метод выбирающий из списка только элементы конкретного, переданного
в параметре класса и выводящий их описание в консоль!

Автор: Чубченко Светлана
*/

import java.util.ArrayList;

public class mainPro {
    public static void main(String[] args) {

        // Создаем список персонажей

        ArrayList<Hero> peasant = new ArrayList<>();
        peasant.add(new Peasant("Nike"));
        peasant.add(new Peasant("Mike"));
        peasant.add(new Peasant("Rike"));
        peasant.add(new Peasant("Dike"));
        peasant.add(new Peasant("Bike"));

        ArrayList<Hero> rogue = new ArrayList<>();
        rogue.add(new Rogue("Robin Gud"));
        rogue.add(new Rogue("Will Gud"));
        rogue.add(new Rogue("Gilly Gud"));
        rogue.add(new Rogue("Rabbi Gud"));
        rogue.add(new Rogue("Tommy Gud"));

        ArrayList<Hero> sniper = new ArrayList<>();
        sniper.add(new Sniper("Den"));
        sniper.add(new Sniper("Pen"));
        sniper.add(new Sniper("Ken"));
        sniper.add(new Sniper("Ren"));
        sniper.add(new Sniper("Zen"));

        ArrayList<Hero> warlock = new ArrayList<>();
        warlock.add(new Warlock("Remy"));
        warlock.add(new Warlock("Senny"));
        warlock.add(new Warlock("Milly"));
        warlock.add(new Warlock("Cetty"));
        warlock.add(new Warlock("Lokky"));

        ArrayList<Hero> spearman = new ArrayList<>();
        spearman.add(new Spearman("O'Nil"));
        spearman.add(new Spearman("O'Hil"));
        spearman.add(new Spearman("O'Bil"));
        spearman.add(new Spearman("O'Zil"));
        spearman.add(new Spearman("O'Dil"));

        ArrayList<Hero> crossbowman = new ArrayList<>();
        crossbowman.add(new Crossbowman("Ted"));
        crossbowman.add(new Crossbowman("Meg"));
        crossbowman.add(new Crossbowman("Kill"));
        crossbowman.add(new Crossbowman("Red"));
        crossbowman.add(new Crossbowman("Sid"));

        ArrayList<Hero> monk = new ArrayList<>();
        monk.add(new Monk("Sent Jon"));
        monk.add(new Monk("Sent Nikol"));
        monk.add(new Monk("Sent Saint"));
        monk.add(new Monk("Sent Owen"));
        monk.add(new Monk("Sent Mark"));

        // выводим в консоль

        printFields(peasant);
        printFields(rogue);
        printFields(sniper);
        printFields(warlock);
        printFields(spearman);
        printFields(crossbowman);
        printFields(monk);

        // задание со звездочкой

        // заполним 50 рандомных героев
        ArrayList<Hero> heroes = new ArrayList<>();
        for(int i=0; i<(50/7); i++) {
            heroes.add(new Peasant("Some Peasant", getRand(), getRand(), new int[] {getRand(), getRand()}, getRand(), getRand(), getRand()));
            heroes.add(new Rogue("Some Rogue", getRand(), getRand(), new int[] {getRand(), getRand()}, getRand(), getRand()));
            heroes.add(new Sniper("Some Sniper", getRand(), getRand(), new int[] {getRand(), getRand()}, getRand(), getRand(), getRand()));
            heroes.add(new Warlock("Some Warlock", getRand(), getRand(), new int[] {getRand(), getRand()}, getRand(), getRand(), getRand()));
            heroes.add(new Spearman("Some Spearman", getRand(), getRand(), new int[] {getRand(), getRand()}, getRand(), getRand()));
            heroes.add(new Crossbowman("Some Crossbowman", getRand(), getRand(), new int[] {getRand(), getRand()}, getRand(), getRand(), getRand()));
            heroes.add(new Monk("Some Monk", getRand(), getRand(), new int[] {getRand(), getRand()}, getRand(), getRand(), getRand()));
        }

        // выводим только если класс равен rogue
        printFieldsOfClass(heroes, "Rogue");

    }

    // рандомное число
    private static int getRand() {
        return (int) (Math.random()*(100));
    }

    // вывод заданного списка классов
    private static void printFields(ArrayList<Hero> some_hero) {
        // перебираем все элементы списка классов Hero и выводим на экран
        for (Hero info: some_hero){
            System.out.println(info);
        }
        // пустая строка для разделения
        System.out.println();
    }

    // вывод только если класс совпадает с заданным
    private static void printFieldsOfClass(ArrayList<Hero> some_hero, String some_class) {
        for (Hero info: some_hero){
            // проверим тот ли класс выводить
            String check = info.getClass().getName();
            if (check.equals(some_class)) System.out.println(info);
        }
    }
}

