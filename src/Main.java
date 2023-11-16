import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //считываем 5 строк и сохраняем их в Список А
        List<String> listA = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите строку для списка A: ");
            String input = scanner.nextLine();
            listA.add(input);
        }

        // Отображаем Список A
        System.out.println("Список A: " + listA);

        // считываем еще 5 строк и сохраняем их в Список Б
        List<String> listB = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите строку для списка B: ");
            String input = scanner.nextLine();
            listB.add(input);
        }

        // объединяем Список А и Список Б в новый список C
        List<String> listC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(4 - i));
        }

        // отображаем Список C
        System.out.println("Список C после объединения: " + listC);

        //cортируем элементы списка C по длине слова
        Collections.sort(listC, Comparator.comparingInt(String::length));

        // Отображаем отсортированный список C
        System.out.println("Отсортированный список C по длине слова: " + listC);
    }
}