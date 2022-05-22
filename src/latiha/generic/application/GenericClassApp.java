package latiha.generic.application;

import latiha.generic.MyData;

public class GenericClassApp {

    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<String>("Yusuf");
        MyData<Integer> integerMyData = new MyData<Integer>(10);

        String stringMyDataData = stringMyData.getData();
        Integer integerMyDataData = integerMyData.getData();

        System.out.println(stringMyDataData);
        System.out.println(integerMyDataData);
    }
}
