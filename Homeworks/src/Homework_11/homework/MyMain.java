package Homework_11.homework;

public class MyMain {
    public static void main(String[] args) {
        myOwnCollection<Integer> list = new myOwnCollection<>(2);

        list.add(22);
        list.add(33);
        list.add(44);
        System.out.println("Get the array after adding values:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("--------------------------------------------------");
        System.out.println("Get the second element: " + list.get(1));
        System.out.println("--------------------------------------------------");

        System.out.println("Contains '33'? " + list.contains(33));
        System.out.println("Contains '43'?  " + list.contains(43));
        System.out.println("--------------------------------------------------");

        list.remove(2);

        System.out.println("Get the array after removing the third value:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("--------------------------------------------------");
        list.clear();
        System.out.println("Array size after removing all values: " + list.size());

    }
}
