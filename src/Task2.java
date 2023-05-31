import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task2 {

  public static void main(String[] args) {

    //Задача 2
    //Прочитать с клавиатуры сначала количество целых чисел, а затем сами числа.
    //Сохранить эти числа в множестве.
    //Удалить из множества все нечётные числа.
    //Вывести получившееся множество.
    Set<Integer> numbers = new HashSet<>();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Сколько чисел вы желаете внести в список?");
    int n = scanner.nextInt();
    scanner.nextLine();
    System.out.println("ваше число ");
    int z = 0;
    for (int i = 0; i < n; i++)
          numbers.add(scanner.nextInt());
    System.out.println(numbers);

    Set<Integer>toRemove= new HashSet<>();
    for (int elements:numbers){
      if (!(elements%2==0)){
        toRemove.add(elements);
      }
    }
    numbers.removeAll(toRemove);
    System.out.println(numbers);

  }
}
