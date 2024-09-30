package homeWork15;

public class MyHund {
    String name;
    String color;
    int age;

    public MyHund(String hundName){
        name = hundName;
    }
    public MyHund() {

    }
    public MyHund(String hundName, String color){
        name = hundName;
        this.color = color;
    }
    public MyHund(String name, String color, int age) {
        this(name, color);
        this.age = age;
    }
    public void sleep (){
      //  System.out.println("I am sleep");
    }
    public void run(){
       // System.out.println("I am run");
    }
    public void sayGawf(){
       // System.out.println("Gawf");
    }
    public void whoAmI(){
        System.out.println();
    }

}
