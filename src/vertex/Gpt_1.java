package vertex;

public class Gpt_1 {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = -3;

        if (a > b){
            System.out.println("A bigger than B");
        } else if (a < b) {
            System.out.println("A smaller than B");
        }else{
            System.out.println("A == B");
        }
        String parity = (c % 2 == 0) ? "Chetnoe" : "Nechetnoe";
        System.out.println(parity);



    }
}
