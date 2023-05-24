package lab06;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person p1 = new Person("Hung", 25, "Hanoi");
        personList.add(p1);
        personList.add(new Person("Phuong", 35, "Hai phong"));
        personList.add(p1);
        personList.add(p1);
        personList.add(p1);
        for (int i=0; i<personList.size(); i++) {
            System.out.println(personList.get(i).toString());
        }
        for (Person p: personList) {
            System.out.println(p.toString());
        }
        System.out.println("Current ArrayList size: " + personList.size());
        personList.remove(1);  //remove 2nd element (index = 1)
        System.out.println("Updated ArrayList size: " + personList.size());
        personList.remove(p1);    //remove object p1
        System.out.println("Updated ArrayList size: " + personList.size());
        personList.removeAll(personList);
        System.out.println("Updated ArrayList size: " + personList.size());
        System.out.println("isEmpty(): " + personList.isEmpty());
        Person p2 = new Person("Phuong", 35, "Hai phong");
        Person p3 = new Person("Phuong", 35, "Hai phong");
        personList.add(p2);
        personList.add(p3);
        personList.add(1, new Person("Phuong", 35, "Hai phong"));
        System.out.println("isEmpty(): " + personList.isEmpty());
        System.out.println(personList.indexOf(p2));
        personList.clear();
        System.out.println("Updated ArrayList size: " + personList.size());
        System.out.println("isEmpty(): " + personList.isEmpty());
        personList.add(p2);
        //personList.add(p3);
        System.out.println("p2 is included in array list: " + personList.contains(p2));
        System.out.println("p3 is included in array list: " + personList.contains(p3));
    }
}
