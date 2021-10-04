package HomeWork_JavaCore_3;

import java.util.ArrayList;

public class Box<T> {
    ArrayList<T> fruits = new ArrayList<>();
    private double weightFruit = 0.0;

//    вес коробки
    public Box(double weightFruit) {
        this.weightFruit = weightFruit;
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }

    public void setFruits(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public double getWeight() {
        return fruits.size() * weightFruit;
    }

    public boolean compare(Box<?> box){
        return Math.abs(getWeight() - box.getWeight()) < 0.00001;
    }

        public void pourOver(Box<T> box) {
        System.out.println("Before merging. Quality box 1: " + fruits.size());
        System.out.println("Before merging. Quality box 2: " + box.fruits.size());
        fruits.addAll(box.fruits);
        box.fruits.clear();
        box.fruits.trimToSize();
        System.out.println("After merging. Quality box 1: " + fruits.size());
        System.out.println("After merging. Quality box 2: " + box.fruits.size());
        }

    @Override
    public String toString() {
        return "Box{" +
                "fruitList=" + fruits +
                '}';
    }
}
