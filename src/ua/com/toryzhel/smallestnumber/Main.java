package ua.com.toryzhel.smallestnumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 * Smallest number
 *
 * Пользователь вводит число. Задача - из цифр данного числа сложить найменьшее из возможных чисел.
 * Например: дано число 8346, найменьшее возможное число - 3468.
 *
 * Если из цифр числа невозможно сложить еще меньшее число - вывести ошибку.
 *
 * @author Semenchenko V.
 */
public class Main {
    public static void main(String[] args) {

        int number;

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Введите число: ");
        Scanner inputFromLine = new Scanner(System.in);
        number = inputFromLine.nextInt();

        int help = number;
        while (help > 0){
            int a = help % 10;
            numbers.add(a);
            help /= 10;
        }

        Collections.sort(numbers);
        String res = new String();

        for (int i = 0; i < numbers.size(); i++){
            int a = numbers.get(i);
            res += a;
        }

        int result = Integer.parseInt(res);

        if (number > result){
            System.out.println("Результат: " + result);
        } else {
            System.out.println("Ошибка! Число меньше - невозможно");
        }
    }
}
