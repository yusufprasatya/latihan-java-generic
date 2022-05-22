package latiha.generic.application;

import latiha.generic.Person;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {

    public static void main(String[] args) {

        Person[] people = {
                new Person("Yusuf","Palembang"),
                new Person("Budi","Palembang"),
                new Person("Koko","Palembang")
        };

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person person, Person t1) {
                return person.getName().compareTo(t1.getName());
            }
        };

        Arrays.sort(people, comparator);
        System.out.println(Arrays.toString(people));
    }
}
