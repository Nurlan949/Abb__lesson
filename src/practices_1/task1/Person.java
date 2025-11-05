package practices_1.task1;

import java.time.LocalDateTime;
import java.util.*;

public class Person implements Comparable {
    private int id;
    private String name;
    private String surname;
    private LocalDateTime updateAt;


    public Person(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;

    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", updateAt=" + updateAt +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return this.id - id;
    }

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        LinkedList<Person> personLinkedList = new LinkedList<>();
        Person person_1 = new Person(1, "Nurlan", "Aliyev");
        Person person_2 = new Person(2, "Emin", "Aliyev");
        Person person_3 = new Person(3, "Terlan", "Memmedov");
        personList.add(person_1);
        personList.add(person_2);
        personList.add(person_3);

        personLinkedList.add(person_1);
        personLinkedList.add(person_2);
        personLinkedList.add(person_3);
        Collections.sort(personLinkedList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.id - o2.id;
            }
        });

        System.out.println(personList);
        personList.addAll(personLinkedList);
        System.out.println(personLinkedList);
        personLinkedList.clear();
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.MAX.getYear());

    }
}
