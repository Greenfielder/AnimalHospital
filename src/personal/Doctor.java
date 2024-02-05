package personal;

import clients.Animal;
import java.util.Objects;

public class Doctor extends Personal implements Therapist{
    protected Animal animal;
    private Nurse nurse;
    public Doctor() {
        this.animal = animal;
        this.nurse = nurse;
    }

    public Doctor(Animal animal, Nurse nurse) {
        this.animal = animal;
        this.nurse = nurse;
    }

    public void healing(Animal animal, Nurse nurse){
        String status = String.valueOf(animal.getIllness());
        if (!Objects.equals(status, "Здоров")) {
            System.out.println("Диагноз: " + animal.getIllness() + ". Животное больно и требует лечения");
            nurse.makeInjection();
            System.out.println("Теперь " + animal.getNickName() + " чувствует себя лучше!");
        }
        else {
            System.out.println("Диагноз: " + animal.getIllness());
            System.out.println(animal.getNickName() + ", вы здоровы, берегите себя!");
        }
    }
}