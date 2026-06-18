import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main() {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите операцию: ");
            System.out.println("0 Выход из программы");
            System.out.println("1 Добавить дело");
            System.out.println("2 Показать дела");
            System.out.println("3 Удалить дело по номеру");
            System.out.println("4 Удалить дело по названию");
            System.out.println("5 Удалить задачи по ключевому слову");
            String s = sc.nextLine();
            switch (s) {
                case "1" -> {
                    System.out.println("***Добавить дело***");
                    System.out.println("Введите название задачи: ");
                    String q = sc.nextLine();
                    if (list.contains(q)) {
                        System.out.println("Такая задача уже есть");
                    } else {
                        list.add(q);
                        System.out.println("Добавлено");
                    }
                }
                case "2" -> System.out.println("***Показать дела***");

                case "3" -> {
                    System.out.println("***Удалить дело по номеру***");
                    System.out.println("Введите номер:");
                    String w = sc.nextLine();
                    int num = Integer.parseInt(w);
                    if (num > 0 && num <= list.size()) {
                        list.remove(num -1);
                    } else {
                        System.out.println("Нет дела с таким номером");
                    }
                }

                case "4" -> {
                    System.out.println("***Удалить дело по названию***");
                    System.out.println("Введите задачу для удаления:");
                    String e = sc.nextLine();
                    if (list.remove(e)) {
                        System.out.println("Дело удалено");
                    } else {
                        System.out.println("Нет дела, текст которого совпадает с искомым текстом");
                    }
                }
                case "5" -> {
                    System.out.println("***Удалить задачи по ключевому слову***");
                    System.out.println("Введите ключевое слово:");
                    String keyword = sc.nextLine();
                    int count = 0;
                    for (int i = list.size() - 1; i >= 0; i--) {
                        if (list.get(i).contains(keyword)) {
                            list.remove(i);
                            count++;
                        }
                    }
                    if (count == 0) {
                        System.out.println("Задачи с таким ключевым словом не найдено");
                    }
                }
                default -> {}
            }
            if (s.equals("0")) {
                break;
            }
            System.out.println("Ваш список дел:");
            for (int i = 0; i < list.size(); i++) {
                System.out.println((i + 1) + ". " + list.get(i));
            }
        }
    }
}
