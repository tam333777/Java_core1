package HomeWork_JavaCore_3;

import java.util.Arrays;

public class HW3_main {
    /* 1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
      2. Задача:
    Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
    Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
    Для хранения фруктов внутри коробки можно использовать ArrayList;
    Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
    Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
    Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
    Не забываем про метод добавления фрукта в коробку.
    */

    public static void main(String[] args) {

//        Apple apl = new Apple(1);
//        Orange orange = new Orange(1.5f);

        Box<Apple> boxApple = new Box<Apple>(1);
        Box<Apple> boxApple2 = new Box<Apple>(1);
        Box<Orange> boxOrange = new Box<Orange>(1);

        for (int i = 0; i < 3; i++) {
            boxApple. addFruit(new Apple(1));
            boxApple2. addFruit(new Apple(1));
            boxOrange.addFruit(new Orange(1));
        }

        boxApple.addFruit(new Apple(1));
        boxApple.addFruit(new Apple(1));

        boxApple2. addFruit(new Apple(1));



        System.out.println("Вес boxApple: " + boxApple.getWeight());
        System.out.println("Вес boxOrange: " + boxOrange.getWeight());
        System.out.println("Weights equals: " + boxApple.compare(boxOrange));

        boxApple.pourOver(boxApple2);

        String[] array = {"1", "2", "3", "4"};
        changeElements(array, 0, 2);




    }
//    Метод, который меняет два элемента местами.
    public  static void changeElements (Object [] array, int a, int b) {
        Object tmp = array [a];
        array [a] = array [b];
        array[b] = tmp;
        System.out.println(Arrays.toString(array));

    }

}
