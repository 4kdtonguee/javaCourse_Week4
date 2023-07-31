public class Hedgehog {
    private String name;
    public Hedgehog(String name) {
        this.name = name;
    }
    public void speak1() {
        System.out.println("Hi, my name is " + name + ".");
    }

    public void speak2(int number){
        System.out.println(name + ": I am a hedgehog. I do not understand numbers.");
    }

    public void speak3(String words){
        System.out.println(name + ": " + words);
    }
    public String getName() {
        return name;
    }
}
