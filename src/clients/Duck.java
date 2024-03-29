package clients;

import java.time.LocalDate;

public class Duck extends Animal implements Goable, Swimable, Flyable{
    public Duck(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Duck() {
        super();
    }

    @Override
    public void toGo(int dist) {
        System.out.println(this.nickName + " пробежал " + dist + "метров.");
    }

    @Override
    public void swim(int dist) {
        System.out.println(this.nickName + " проплыл " + dist + "метров.");
    }

    @Override
    public void fly(int dist) {
        System.out.println(this.nickName + " пролетел " + dist + "метров.");
    }
}
