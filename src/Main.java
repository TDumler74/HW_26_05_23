import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    //Задача 1
    //Прочитать с клавиатуры сначала количество чисел, а затем сами числа.
    //Сохранить эти числа в списке.
    //Удалить из списка все чётные числа.
    //Вывести получившийся список.

    List<Integer> numbers = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Сколько чисел вы желаете внести в список?");
    int n = scanner.nextInt();
    scanner.nextLine();
    System.out.println("ваше число ");
    int z = 0;
    for (int i = 0; i < n; i++) {
     //z = scanner.nextInt();
     //numbers.add(z);
      numbers.add(scanner.nextInt());
    }
   //System.out.println(numbers);
   //for (int i = 0; i < numbers.size(); i++) {
   //  z = numbers.get(i);
   //  if (z % 2 == 0) {
   //    numbers.remove(i);
   //  }
   //}
   //System.out.println(numbers);
    // вариант: временная коллекция "к удалению"
        Set<Integer> toRemove = new HashSet<>();
        for (int elem : numbers) { // перебираем без изменения коллекции
          if (elem % 2 == 0) {
            toRemove.add(elem); // добавить чётные числа в множество "чисел к удалению"
          }
        }
        numbers.removeAll(toRemove); // коллекция.удалитьВсе(коллекцияКУдалению)
    System.out.println(numbers);
      }
  }

  //Сколько чисел вы желаете внести в список?
  //5
  //ваше число
  //2
  //3
  //44
  //77
  //66
  //[2, 3, 44, 77, 66]
  //[3, 77]
  //



