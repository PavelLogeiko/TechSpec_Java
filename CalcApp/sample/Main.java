package ru.geekbrains.sample;
import ru.geekbrains.regular.Arithmetic;
import ru.geekbrains.regular.Format;

/**
 * Основной класс приложения. Вызов классов Arithmetic и Format.
 * Вывод на экран результатов операций.
 * cd /Users/logeyko/IdeaProjects/lesson1/src/main/
 * javac -sourcepath ./java -d out java/ru/geekbrains/sample/Main.java
 * java -classpath ./out ru.geekbrains.sample.Main
 * https://www.docker.com/products/docker-desktop/
 * https://hub.docker.com/
 * docker pull bellsoft/liberica-openjdk-alpine
 * docker build . -t calcapp:v.1.1
 * javadoc -encoding utf8 -d docs -sourcepath ./java -cp ./out -subpackages ru
 **/

public class Main {
    /**
     * Точка входа в программу. С неё всегда всё начинается.
     *
     * @param args стандартные аргументы командной строки
     **/
    public static void main(String[] args) {
        int result = Arithmetic.add(2, 2);
        System.out.println(Format.format(result));
        result = Arithmetic.sub(2, 2);
        System.out.println(Format.format(result));
        result = Arithmetic.mul(2, 2);
        System.out.println(Format.format(result));
        result = Arithmetic.div(2, 2);
        System.out.println(Format.format(result));
    }
}