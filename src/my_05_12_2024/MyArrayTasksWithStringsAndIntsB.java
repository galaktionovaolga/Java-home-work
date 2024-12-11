package my_05_12_2024;

import java.util.Arrays;

public class MyArrayTasksWithStringsAndIntsB {

    // 11. Отсортировать массив строк по длине.
    public static void task11() {
        String[] array = {"elephant", "cat", "dog"};
    }

    // 12. Найти и вывести все строки одинаковой длины.
    public static void task12() {
        String[] array = {"apple", "banana", "cherry", "dog", "cat"};
    }

    // !!13. Сравнить содержимое двух массивов целых чисел.
    public static void task13() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3, 4};
        //boolean areEqual = Arrays.equals(array1, array2);
        //System.out.println("Массивы равны: " + areEqual);
        boolean arrayEquals = true;
        if (array1.length != array2.length){
            arrayEquals = false; // массивы разной длины
        } else{
            for (int i = 0; i < array1.length; i++) {
                if(array1[i] !=array2[i]){
                    arrayEquals = false; //различные значения эл-в массива
                }

            }
        }
        System.out.println("Массивы равны: " + arrayEquals);
    }

    // !!14. Генерация нового массива из сумм элементов двух массивов.
    public static void task14() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int[] newArray = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            newArray[i] = array1[i] + array2[i];
            }
        System.out.println(Arrays.toString(newArray));
    }

    // !15. Найти уникальные значения в массиве строк.
    public static void task15() {
        String[] array = {"apple", "banana", "apple", "ball", "cherry", "banana"};
        boolean isUnique; //добавлена переменная, которая по умолчанию явл true для каждого элемента
        for (int i = 0; i < array.length; i++) {
            isUnique = true; //Предполагаем, что элемент уникален.
            for (int j = 0; j < array.length; j++) {

                if (array[i].equals(array[j]) && (i != j)) {
                    isUnique = false; //если нашли дубликат
                    break; // выходим из внутреннего цикла
                }
            }
            if(isUnique) {
                System.out.println(array[i]);
            }
        }
    }

    // !16. Удалить дубликаты из массива строк.
    public static void task16() {
        String[] array = {"apple", "banana", "apple", "cherry", "banana"};

        boolean isDuplicate;

        for (int i = 0; i < array.length; i++) {
            isDuplicate = false; // Сброс флага дубликата для каждого элемента
            for (int j = 0; j < i; j++) { // Проверяем только предыдущие элементы
                if (array[i].equals(array[j])) {
                    isDuplicate = true; // Если найден дубликат
                    break; // Выходим из внутреннего цикла
                }
            }
            if (!isDuplicate) { // Если элемент уникален
                System.out.println(array[i]); // Выводим уникальный элемент
            }
        }
    }

    // 17 - не выводит. Объединить два массива строк в один.
    public static void task17() {
        String[] array1 = {"apple", "banana"};
        String[] array2 = {"cherry", "date"};
        String[] combinedArray = new String[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            combinedArray[i] = array1[i];
        }
        for (int j = 0; j < array2.length; j++) {
            combinedArray[array1.length + j] = array2[j];

            for (String fruit : combinedArray) {
                System.out.println(fruit);
            }
        }
    }

    // 18!-. Проверить, упорядочен ли массив строк по алфавиту.
    public static void task18() {
        String[] array = {"apple", "banana", "cherry"};
        boolean isSorted = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i + 1]) > 0) {
                isSorted = false;
                break;
            }
        }

        System.out.println("Массив упорядочен: " + isSorted);
    }

    // !!19. Найти строки, начинающиеся с заданной буквы.
    public static void task19() {
        String[] array = {"apple", "banana", "apricot", "arbuz", "cherry"};
        char target = 'a';
        for (int i = 0; i < array.length; i++) {
            if (array[i].charAt(0) == target) {
                System.out.println(array[i]);

            }
        }
    }

    // !!20. Создать массив строк из первых букв элементов другого массива.
    public static void task20() {
        String[] array = {"apple", "banana", "cherry"};
        String[] newArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {

            newArray[i] = String.valueOf(array[i].charAt(0));
        }
        System.out.println(Arrays.toString(newArray));

    }

    public static void main(String[] args) {
        task20();
    }
}
