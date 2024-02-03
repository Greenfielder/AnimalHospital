package clients;

import java.time.LocalDate;

public class Cat extends Animal implements Goable{
    Double discount;

    public Cat(String nickName, Owner owner, LocalDate birthDate, Illness illness, Double discount) {
        super(nickName, owner, birthDate, illness);
        this.discount = discount;
    }

    public Cat() {
        super();
        this.discount = 10D;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public static void meow(){
        System.out.println("Мяяяу!");
    }

    @Override
    public void toGo(int dist){
        System.out.println(this.nickName + " пробежал " + dist + "метров.");
    }

    @Override
    public String toString() {
        return super.toString()+", Discount(" +discount+")";
    }
}