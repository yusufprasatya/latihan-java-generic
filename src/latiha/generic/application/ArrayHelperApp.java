package latiha.generic.application;

import latiha.generic.util.ArrayHelper;

public class ArrayHelperApp {

    public static void main(String[] args) {

        String[] names = {"Yusuf","Ucok","Muhammad"};
        Integer[] numbers = {1,2,3,4,5,6};

        /**
         * Kita bisa menambahkan prametertype genericnya, namun ini optional lebih baik tidak usah ditambahakn.
         */
        System.out.println(
                ArrayHelper.<String>count(names)
        );

        System.out.println(
                ArrayHelper.count(numbers)
        );

    }
}
