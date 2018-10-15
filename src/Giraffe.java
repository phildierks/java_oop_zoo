public class Giraffe extends Animal{
    public Giraffe(String name){
        super(name,"leaves");
    }
    public void eat(String food){
        if(food == this.favoriteFood){
            System.out.println(name + " eats " +  food);
            System.out.println( "YUM!!! "  + this.name + " wants more " +  food);
            sleep();
        }else{
            System.out.println( "YUCK!!! "  + this.name + " will not eat " +  food);
        }
    }
}
