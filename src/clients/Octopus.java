package clients;

import java.time.LocalDate;

public class Octopus extends Animal implements Swimable {

    public Octopus(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Octopus() {
        super();
    }

    @Override
    public void swim(int dist) {
        System.out.println(this.nickName + " проплыл " + dist + "метров.");
    }
}
