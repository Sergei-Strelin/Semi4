/** Задание 1
 Пусть дан LinkedList с несколькими элементами. 
 Реализуйте метод, который вернет “перевернутый” список.
*/

import java.util.LinkedList;
import java.util.Random;

public class dz4z1 {
    private static Random random = new Random();
    
    public static void main(String[] args) {
        
        
        LinkedList<Integer> list = getRandomLinkedList(11,0,100);
        System.out.println( "Сгенерированный LinkedList: ");
        System.out.println(list);
        
        
        LinkedList<Integer> list1 = reversLinkedList(list);
        System.out.println( "\nПеревёрнутый LinkedList: ");
        System.out.println(list1);
    }


    
    static LinkedList reversLinkedList(LinkedList<Integer> list){
        LinkedList<Integer> listTemp = new LinkedList<Integer>();
        for (int i = 1; i <= list.size(); i++) {
            listTemp.add(list.get(list.size()-i));
        }
        return listTemp;
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

}
