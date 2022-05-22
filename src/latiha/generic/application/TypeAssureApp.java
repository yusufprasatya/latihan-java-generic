package latiha.generic.application;

import latiha.generic.MyData;

public class TypeAssureApp {

    public static void main(String[] args) {

        MyData  myData = new MyData<>("Yusuf");

        MyData<Integer> integerMyData = myData;
        integerMyData.setData(1000);
        Integer integer = integerMyData.getData();
    }

}
