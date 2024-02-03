package clients;

import java.time.LocalDate;

public class Dog extends Animal implements Goable {
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness); //Сходи в род.класс и вызови 4 параметра
    }

    public Dog() {
        super();
    }

    @Override
    public void toGo(int dist) {
        System.out.println(this.nickName + " пробежал " + dist + "метров.");
    }
}