package homeWork15;

import javax.sound.midi.Soundbank;

public class MainSachen {
    public static void main(String[] args) {
        MyHund hund = new MyHund("Pulia", "GoldAndRed", 2);
        MyBird bird = new MyBird("Kwochka", "DarkRed", 25);
        Comod name = new Comod("OldBrokenStick");
     //   hund.sayGawf();
      //  hund.sleep();
     //   hund.run();
        String hundName = hund.name;


        System.out.println("I am a dog" + ": " + "My name is - " + hundName + ", " + " " +
                "My age is - " + hund.age + ", " + " My color - " + hund.color);
        System.out.println("I am a bird"  + ": " + "My name is - " + bird.name + ", " + " " +
                "My age is - " + bird.age + ", " + " My color - " + bird.color);
        System.out.println("Iam just an" + name);

    }
}
