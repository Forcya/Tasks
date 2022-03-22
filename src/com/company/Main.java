package com.company;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задачи 2-ого модуля");
        System.out.println("Задачи 2-ого модуля");
        System.out.println("Задачи 2-ого модуля");
        System.out.println("commit init 3");
        //3.3.12
//	    Human human1 = new Human();
//        Human human2 = new Human();
//        Human human3 = new Human();


        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);

        double f = 2.3;
        double v = 2.0;

        System.out.println(31 * (2.1 * 10));

        TooLongTextAnalyzer to = new TooLongTextAnalyzer(13);
    }
}


//3.3.11
//Создайте класс Cat и класс Dog. В классе Cat должен быть метод sayHello(), который выводит в консоль "Мяу!", аналогично с собакой, но выводит "Гав!". Так же, у собаки должен быть метод catchCat (поймать кошку), который принимает кошку и дальше делает следующее:

//1) выводит в консоль сообщение "Кошка поймана"
//2) У собаки, которая поймала кошку должен быть вызван метод sayHello()
//3) У кошки, которую поймала собака должен быть вызван метод sayHello()
//Требования:
//1. Должен быть класс public static class Cat
//2. Должен быть класс public static class Dog
//3. Все методы должны быть public
//4. Кошка должна говорить “Мяу!”
//5. Собака должна говорить “Гав!”
//6. Собака должна ловить кошку
//public static class Cat {
//    public void sayHello() {
//        System.out.println("Мяу!");
//    }
//}
//
//public static class Dog {
//    public void sayHello() {
//        System.out.println("Гав!");
//    }
//    public void catchCat(Cat cat) {
//        //Cat cat в аргументе метода заменяет: Cat cat = new Cat():
//        System.out.println("Кошка поймана");
//        sayHello();
//        cat.sayHello();
//    }
//}


//3.3.12
//Создайте класс Human с полями возраст (age), имя (name), фамилия (secondName) и любимый вид спорта (favoriteSport).
//Создайте 3 конструктора в классе Human, 1-ый - пустой, 2-ой, который конструирует Human’a от всех полей и третий, который конструирует Human’a, от всех полей, кроме любимого вида спорта. Для успешного тестирования решения важно объявлять аргументы в конструкторах именно в том порядке, в котором они написаны в данном описании (возраст (age), имя (name), фамилия (secondName) и любимый вид спорта (favoriteSport))
//В методе main создайте 3 экземпляра человека используя 3 этих разных конструктора. поля класса должны иметь размерность, не превышающую необходимую. Класс должен быть объявлен статическим, метод main не должен находиться в классе, поля класса должны иметь доступ только внутри класса
class Human {
    byte age;
    String name;
    String secondName;
    String favoriteSport;

    public Human(int i, String аа) {}

    public Human (byte age, String name, String secondName, String favoriteSport) {
        this(age, name, secondName);
        this.favoriteSport = favoriteSport;
    }

    public Human (byte age, String name, String secondName) {
        this.age = age;
        this.name = name;
        this.secondName = secondName;
    }
}




//3.3.13
//На игровом поле находится робот. Позиция робота на поле описывается двумя целочисленным координатами: X и Y. Ось X смотрит слева направо, ось Y - снизу вверх. (Помните, как рисовали графики функций в школе?)
//В начальный момент робот находится в некоторой позиции на поле. Также известно, куда робот смотрит: вверх, вниз, направо или налево. Ваша задача — привести робота в заданную точку игрового поля.
//Робот описывается классом Robot. Вы можете пользоваться следующими его методами (реализация вам неизвестна):
//
//class Robot {
//
//    public Direction getDirection() {
//        // текущее направление взгляда
//        return null;
//    }
//
//    public int getX() {
//        // текущая координата X
//        return 2;
//    }
//
//    public int getY() {
//        // текущая координата Y
//        return 3;
//    }
//
//    public void turnLeft() {
//        // повернуться на 90 градусов против часовой стрелки
//    }
//
//    public void turnRight() {
//        // повернуться на 90 градусов по часовой стрелке
//    }
//
//    public void stepForward() {
//        // шаг в направлении взгляда
//        // за один шаг робот изменяет одну свою координату на единицу
//    }
//
//    //например робот находится в 2, 3 и смотрит влево
//    //Надо в 3, 5
//    public static void moveRobot(Robot robot, int toX, int toY) {
//        int x = robot.getX();
//        int y = robot.getY();
//
//        if (x >= toX) {
//            while (robot.getDirection() != Direction.LEFT) {
//                robot.turnLeft();
//            }
//            while (x != toX) {
//                robot.stepForward();
//                x--;
//            }
//        } else {
//            while (robot.getDirection() != Direction.RIGHT) {
//                robot.turnRight();
//            }
//            while (x != toX) {
//                robot.stepForward();
//                x++;
//            }
//        }
//
//        if (y >= toY) {
//            while (robot.getDirection() != Direction.DOWN) {
//                robot.turnLeft();
//            }
//            while (y != toY) {
//                robot.stepForward();
//                y--;
//            }
//
//        } else {
//            while (robot.getDirection() != Direction.UP) {
//                robot.turnRight();
//            }
//            while (y != toY) {
//                robot.stepForward();
//                y++;
//            }
//        }
//    }
//}


//3.4.8
//Дан класс ComplexNumber. Переопределите в нем методы equals() и hashCode() так, чтобы equals() сравнивал экземпляры ComplexNumber по содержимому полей re и im, а hashCode() был бы согласованным с реализацией equals().
//
//Реализация hashCode(), возвращающая константу или не учитывающая дробную часть re и im, засчитана не будет

class ComplexNumber {
    private double re;
    private double im;


    public ComplexNumber() {
    }

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im); //при вызове этого метода хеш-коды становятся одинаковыми на основе переданных значений
    }
//    @Override
//    public int hashCode() {
//        return ((int) (31 * im + re)) ^ 53 >>> 21;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;   //Если объект равен сам себе, тогда true (проверяется равенство ссылок) //объект который стоит слева
        if (o == null || getClass() != o.getClass()) return false; //Если объекта нет (есть ссылка, пусто, null) или если классы разные, тогда вернуть false
        ComplexNumber that = (ComplexNumber) o; //приводим класс объект к нашему классу, в данном случае (ComplexNumber)
        return Double.compare(that.re, re) == 0 && Double.compare(that.im, im) == 0;
    }
}

//3.5.6
//Напишите статический класс AsciiCharSequence, реализующий компактное хранение последовательности
//ASCII-символов (их коды влезают в один байт) в массиве байт.
//По сравнению с классом String из Java 8, хранящим каждый символ как char,
//AsciiCharSequence будет занимать в два раза меньше памяти






interface TextAnalyzer {
    Label processText(String text);    //Вы решили абстрагировать фильтр в виде следующего интерфейса:
}

enum Label {
    SPAM, NEGATIVE_TEXT, TOO_LONG, OK
}

abstract class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {

    private String[] keywords;

    SpamAnalyzer (String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    public Label processText(String text) {
        return Label.SPAM;
    }

    @Override
    public String[] getKeywords () {
        return keywords;
    };
}

abstract class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {

    private String[] keywords = {":(", "=(", ":|"};

    NegativeTextAnalyzer () {
    }

    @Override
    public Label processText(String text) {
        return Label.NEGATIVE_TEXT;
    }

    @Override
    public String[] getKeywords () {
        return keywords;
    }


}

class TooLongTextAnalyzer implements TextAnalyzer {

    private int maxLength;

    TooLongTextAnalyzer (int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public Label processText(String text) {
        return text.length() > maxLength ? Label.TOO_LONG : Label.OK;
    }
}


abstract class KeywordAnalyzer implements TextAnalyzer {

    public abstract String[] getKeywords (); //возвращает набор ключевых слов

    public abstract Label getLabel (); //возвращает метку

    public Label processText(String text) {
        String[] keywords = getKeywords();
        for (int i = 0; i < keywords.length; i++) {
            if (text.indexOf(keywords[i]) != -1) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}







