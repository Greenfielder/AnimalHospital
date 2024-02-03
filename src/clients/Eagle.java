package clients;

import java.time.LocalDate;

public class Eagle extends Animal implements Goable, Flyable{

    public Eagle(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Eagle() {
        super();
    }

    @Override
    public void toGo(int dist) {
        System.out.println(this.nickName + " пробежал " + dist + "метров.");
    }

    @Override
    public void fly(int dist) {
        System.out.println(this.nickName + " пролетел " + dist + "метров.");
    }
}
