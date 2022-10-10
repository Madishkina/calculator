package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();// Произведите несколько математических операций над числами:
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);
        calc.println.accept(c); // показывает арифметическую ошибку:делить на 0 нельзя(12 строка)
        //	непроверяемые исключения.эти исключения не обязательно оборачивать в try-catch
        //	(в данном случае была допущена ошибка при составлении программы(человеческий фактор),
        //	поэтому лучше исправить эту ошибку написав код правильно)
    }
}
