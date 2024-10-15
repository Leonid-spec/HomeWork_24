package homeWork_18;

public class Dog {
    private String name;
    private int jumpHeight;
    private int initialJumpHeight;

    public Dog(String name, int jumpHeight, int initialJumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.initialJumpHeight = initialJumpHeight;
    }
    public void jump(){
        System.out.println(name + "jump " + jumpHeight + "sm");
    }
    public void train() {
    if (jumpHeight < initialJumpHeight * 2) {
    jumpHeight += Math.max(10, initialJumpHeight * 2 - jumpHeight);
        System.out.println(name + " training " + jumpHeight + " sm");
    } else {
        System.out.println(name + " biggest jump" );
    }
    }
    public void jumpBarrier(int barrierHeight){
        if (jumpHeight >= barrierHeight) {
            System.out.println(name + "winner " + barrierHeight + " sm");
        } else {
            int potentialJumpHeight = jumpHeight;
            while (potentialJumpHeight < barrierHeight && potentialJumpHeight < initialJumpHeight * 2) {
                potentialJumpHeight += Math.min(10, initialJumpHeight * 2 - potentialJumpHeight);
            }
            if (potentialJumpHeight >= barrierHeight) {
                System.out.println(name + "must training " + barrierHeight + " sm");
                while (jumpHeight < barrierHeight && jumpHeight < initialJumpHeight * 2) {
                    train();
                }
                System.out.println(name + "good jump" + barrierHeight + " sm");
            } else {
                System.out.println(name + "not so good");
            }
            }
        }
    }


