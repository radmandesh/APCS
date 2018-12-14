package Ch8Classes;

public class GenericClient {
    public static void main (String[] args){
        Phone phone = new Phone("rohan", "Apple", "iPhone X", "Silver", 1532, true, 1000);
        System.out.println(phone);
        Animal animal = new Animal("Lion", 4,0,2,true,8,800,'M');
        System.out.println(animal);
        Car car = new Car("Rohan","Tesla","Model S", "white", 4, 2, 80000);
        System.out.println(car);
    }
}
