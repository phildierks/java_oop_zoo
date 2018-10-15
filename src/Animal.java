public class Animal {
    static int population;
    String name;
    String favoriteFood;
    public Animal(String name, String favoriteFood) {
        this.name = name;
        this.favoriteFood = favoriteFood;
        population++;
    }

    public void sleep() {
        System.out.println(this.name + " sleeps for 8 hours");
    }
    public void eat(String food) {

        if(food == this.favoriteFood){
            System.out.println(this.name + " eats " +  food);
            System.out.println("YUM!!! "  + this.name + " wants more "+  food);
        }else{
            sleep();
        }
    }
    public void populationCount(){
        System.out.println(population);
    }
    public static void main(String[] args) {
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");
        Unicorn rarity = new Unicorn("Rarity");
        rarity.eat("marshmallows");
        rarity.sleep();
        Giraffe gemma = new Giraffe("gemma");
        gemma.eat("meat");
        gemma.eat("leaves");
        Bees stinger = new Bees("stinger");
        stinger.eat("ice cream");
        stinger.eat("pollen");
        Animal[] animals = new Animal[]{tigger,pooh, rarity,gemma,stinger};
        Zookeeper zoebot = new Zookeeper("zoebot");
        zoebot.feedAnimals(animals, "meat");
    }

}
