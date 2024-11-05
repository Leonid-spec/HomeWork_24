package homeWork_38;



public class Sportsman implements Comparable<Sportsman>{
    private String name;

    Sportsman(String name, int age, int score){
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    private int age;
    private int score;

    @Override
    public int compareTo(Sportsman o) {
        return this.name.compareTo(o.getName());
    }

    @Override
    public String toString(){
        return "{" + name + ", " + age + " age, " + score + " scores}";
    }
}