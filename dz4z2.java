/** Задание 2
Реализуйте очередь с помощью LinkedList со следующими методами:
  enqueue() - помещает элемент в конец очереди, 
  dequeue() - возвращает первый элемент из очереди и удаляет его,
  first() - возвращает первый элемент из очереди, не удаляя.
*/


import java.util.Arrays;
import java.util.Random;
import java.util.LinkedList;

public class dz4z2 {
    private static Random random = new Random();
    public static void main(String[] args) {
        
        LinkedList<Integer> list = getRandomLinkedList(5,0,100);
        System.out.println( "Сгенерированный LinkedList: ");
        System.out.println(list);

        
        System.out.println( "Добавляем в конец очереди число 999 ");
        enqueue(list,999);
        System.out.println( "Проверяем, что 999 добавилось в конец очереди: ");
        System.out.println(list);     

        
        System.out.printf("Удаляем первый элемент в очереди %d\n", decueue(list));
        System.out.println( "Проверяем, что первый элемент в очереди удалился: ");
        System.out.println(list);

        
        System.out.printf("Первый элемент в очереди %d\n", first(list));
        System.out.println( "Проверяем, что первый элемент в очереди не удалился: ");
        System.out.println(list);
    }


       
    static LinkedList getRandomLinkedList(int size, int min, int max){
        LinkedList<Integer> list = new LinkedList<>();
        int index = 0;
        while (index < size) {
            list.add(random.nextInt(min, max));
            index = index + 1;
        }
        return list;
    }

    
    static void enqueue(LinkedList<Integer> list, int element){
        list.addLast(element);
    }

        
    
    static int decueue(LinkedList<Integer> list){
        return list.removeFirst();
    }


    
    static int first(LinkedList<Integer> list){
        return list.peekFirst();
    }

}