package homeWork15;

public class MyBird {
    String name;
    String color;
    int age;

    public MyBird(String birdName){
        name = birdName;
    }
    public MyBird() {

    }
    public MyBird(String birdName, String color){
        name = birdName;
        this.color = color;
    }
    public MyBird(String name, String color, int age) {
        this(name, color);
        this.age = age;
    }
    public void sleep (){
            }

    public void sayKokoko(){
     //   System.out.println("Kokoko");
    }
    public void whoAmI(){
        System.out.println();
    }
}
