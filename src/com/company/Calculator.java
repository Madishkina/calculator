package com.company;

import java.util.function.*;

public class Calculator {
    public static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> x / y;
    // (x, y) -> y != 0 ? x / y : 0; (как вариант по аналогии *0 = 0) можно считать
    // что при делении на 0 результат = 0;
    //но так же можно "выкинуть" исключения
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    //Добавьте переменную типа Predicate для определения положительное ли число:
    Predicate<Integer> isPositive = x -> x > 0;
    //Добавьте переменную типа Consumer для вывода числа в консоль.
    // Используйте для этого ссылку на статический метод println():
    Consumer<Integer> println = System.out::println;
}

