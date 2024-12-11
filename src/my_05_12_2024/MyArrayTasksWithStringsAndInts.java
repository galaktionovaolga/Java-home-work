package my_05_12_2024;

import java.util.Arrays;

public class MyArrayTasksWithStringsAndInts {
    // 21. Генерация нового массива из четных чисел.
    public static void task21() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        int[] newArray = new int[count];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                newArray[k++] = array[i];
            }
        }
        System.out.println(Arrays.toString(newArray));;
    }

    // 22. Генерация нового массива из нечетных чисел.
    public static void task22() {
        int[] array = {1, 2, 3, 4, 5, 6};
    }

    // 23. Проверка на палиндром в массиве строк.
    public static void task23() {
        String[] array = {"level", "hello", "radar", "world"};
    }

    // 24. Поиск всех подстрок в строках массива, соответствующих заданному шаблону.
    public static void task24() {
        String[] array = {"apple", "application", "banana", "grape"};
        String pattern = "app";
    }

    // 25. Создание массива чисел с четными индексами.
    public static void task25() {
        int[] array = {1, 2, 3, 4, 5, 6};
    }

    // 26. Создание массива чисел с нечетными индексами.
    public static void task26() {
        int[] array = {1, 2, 3, 4, 5, 6};

    }

    // 27. Разделение массива строк на два: строки с четной и нечетной длиной.
    public static void task27() {
        String[] array = {"apple", "banana", "cat", "dog", "elephant"};
    }

    // 28. Найти все строки, которые начинаются и заканчиваются одинаковой буквой.
    public static void task28() {
        String[] array = {"apple", "banana", "level", "radar", "hello"};

    }

    // 29. Создать массив чисел, которые являются квадратами элементов исходного массива.
    public static void task29() {
        int[] array = {1, 2, 3, 4, 5};

    }

    // 30. Создать массив строк, содержащих только уникальные символы.
    public static void task30() {
        String[] array = {"apple", "banana", "cat", "dog", "race"};
    }

    public static void main(String[] args) {
        task21();
    }

}
