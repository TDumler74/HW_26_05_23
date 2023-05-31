import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Task3 {

  public static void main(String[] args) {
    //Задача 3
    //Прочитать с клавиатуры сначала количество записей в телефонной книге, а затем сами записи
    // (номер телефона и имя).
    //Сохранить эти записи в словаре (телефон (строка) - имя (строка)).
    //Спросить имя для удаления.
    //Удалить из словаря все телефоны, имя для которых совпадает с указанным.
    //Вывести получившийся словарь.

    Map<Integer, String> telefonbook = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Сколько записей в телефоной книге?");
    int n = scanner.nextInt();
    for (int i = 0; i < n; i++) {
      System.out.println("Введите номер владельца: ");
      int callnumber = scanner.nextInt();
      scanner.nextLine();
      System.out.println("Введите имя владельца: ");
      String name = scanner.nextLine();
      telefonbook.put(callnumber, name);
    }
    System.out.println(telefonbook);

    System.out.println("Введите имя для удаления: ");

    String removeName = scanner.nextLine();

  }
}
