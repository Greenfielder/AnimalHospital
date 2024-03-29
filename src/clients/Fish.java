package clients;

import java.time.LocalDate;

public class Fish extends Animal implements Swimable{
    public Fish(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Fish() {
        super();
    }

    @Override
    public void swim(int  dist) {
        System.out.println(this.nickName + " проплыл " + dist + "метров.");
    }
}
