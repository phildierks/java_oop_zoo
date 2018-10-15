public class Tiger extends Animal {
    public Tiger(String name) {
        super(name, "meat");

    }

    public void sleep() {
        System.out.println(this.name + " sleeps for 8 hours");
    }

    public static void main(String[] args) {
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");

    }

}
