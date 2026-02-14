package Day5.Task5;

import Day5.Student;

public class GenericDemo {
    public static void main(String[] args) {

        DataContainer<Integer> intContainer = new DataContainer<>();
        intContainer.add(100);
        System.out.println(intContainer.get());
        intContainer.displayType();

        DataContainer<String> strContainer = new DataContainer<>();
        strContainer.add("Hello");
        System.out.println(strContainer.get());
        strContainer.displayType();

        DataContainer<Student> studentContainer = new DataContainer<>();
        studentContainer.add(new Student("Sayeed", 90));
        System.out.println(studentContainer.get());
        studentContainer.displayType();
    }
}

class DataContainer<T> {

    private T item;

    public void add(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }

    public void displayType() {
        System.out.println("Stored Type: " + item.getClass().getSimpleName());
    }
}
