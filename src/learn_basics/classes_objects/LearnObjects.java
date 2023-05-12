package learn_basics.classes_objects;

import learn_basics.string_basics.Concatenation;
import learn_basics.string_basics.EscapeChars;

public class LearnObjects {

    public static void main(String[] args) {
        int age = 30;
        String name = "sami";

        Car bmw = new Car("BMW", "M340i", "B58", "6MT", 19, 4,
                "Nardo Gray");

        System.out.printf("The color of the BMW is %s\n", bmw.color);
        System.out.printf("The engine of the BMW is %s\n", bmw.engine);
        System.out.printf("The BMW has %d doors\n", bmw.numOfDoors);
        System.out.printf("The BMW has a %s transmission\n", bmw.transmissionType);
        System.out.printf("The BMW has %d inch wheels\n", bmw.wheelSize);

        bmw.accelerate();
        bmw.decelerate();

        Car lexus = new Car("Lexus", "RX350", "V6", "Automatic", 20, 4,
                "Mica Red");

        System.out.println("*****************");
        System.out.printf("The color of the Lexus is %s\n", lexus.color);
        System.out.printf("The engine of the Lexus is %s\n", lexus.engine);
        System.out.printf("The Lexus has %d doors\n", lexus.numOfDoors);
        System.out.printf("The Lexus has a %s transmission\n", lexus.transmissionType);
        System.out.printf("The Lexus has %d inch wheels\n", lexus.wheelSize);

        lexus.accelerate();
        lexus.decelerate();

        Car lamborghini = new Car("Lamborghini", "Gallardo", "V12", "8MT", 20,
                2, "Lime Green");

        System.out.println("*****************");
        System.out.printf("The color of the Lamborghini is %s\n", lamborghini.color);
        System.out.printf("The engine of the Lamborghini is %s\n", lamborghini.engine);
        System.out.printf("The Lamborghini has %d doors\n", lamborghini.numOfDoors);
        System.out.printf("The Lamborghini has a %s transmission\n", lamborghini.transmissionType);
        System.out.printf("The Lamborghini has %d inch wheels\n", lamborghini.wheelSize);

    }

}
