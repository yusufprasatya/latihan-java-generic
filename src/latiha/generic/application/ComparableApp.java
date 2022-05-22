package latiha.generic.application;

import latiha.generic.Person;
import java.util.Arrays;

public class ComparableApp {

    public static void main(String[] args) {

        Person[] people = {
                new Person("Yusuf","Palembang"),
                new Person("Budi","Palembang"),
                new Person("Koko","Palembang")
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));
    }
}
