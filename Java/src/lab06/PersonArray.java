package lab06;

public class PersonArray {
    public static void main(String[] args) {
        Person p1 = new Person("Hung", 25, "Hanoi");
        Person p2 = new Person("Linh", 35, "Danang");
        Person[] people = new Person[3];
        people[0] = p1;
        people[1] = p2;
        people[2] = new Person("Tuan", 40, "Hue");
        int min_age = people[0].getAge();
        int max_age = people[0].getAge();
        for (int i=0; i<people.length; i++) {
            System.out.println(people[i].toString());
            if (people[i].getAge() < min_age) {
                min_age = people[i].getAge();
            }
            if (people[i].getAge() > max_age) {
                max_age = people[i].getAge();
            }
        }
        System.out.println("Max age: " + max_age);
        System.out.println("Min age: " + min_age);

        Person[] personList = {p1, p2};
        for (Person p: personList) {
            p.showPersonInfo();
        }
    }
}
