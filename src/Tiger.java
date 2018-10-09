public class Tiger {
String favoriteFood;
String name;
    public Tiger(String name) {
        this.name = name;
    }

    public void sleep() {
        System.out.println(this.name + "sleeps for 8 hours");
    }

    public void eat(String food) {
        System.out.println(this.name + " eats " +  food);
        if(food == favoriteFood){
            System.out.println( "YUM!!! "  + this.name + " wants more "+  food);
        }else{
            sleep();
        }
    }

    public static void main(String[] args) {
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");

    }

}
