import java.time.LocalDate;
import java.util.*;

import clients.*;
import clinic.VeterinaryClinic;
import personal.Doctor;
import personal.Nurse;
import personal.Personal;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Cat("Барсик", new Owner("Стив Остин"),
                LocalDate.of(2018, 3, 5), new Illness("Здоров"), 10D);
        Animal cat2 = new Cat("Багира", new Owner("Стив Остин"),
                LocalDate.of(2020, 5, 15), new Illness("Вялость"), 10D);
        Animal dog = new Dog("«Рекс»", new Owner("Халк Хоган"),
                LocalDate.of(2020, 6, 10), new Illness("Лишай"));
        Animal duck = new Duck("«Скрудж»", new Owner("Роман Рейнс"),
                LocalDate.of(2022, 2, 12), new Illness("Сонливость"));
        Animal fish = new Fish("«Немо»", new Owner("Биг Шоу"),
                LocalDate.of(2023, 12, 12), new Illness("бледная"));
        Animal eagle = new Eagle("«Джек»", new Owner("Голдберг"),
                LocalDate.of(2023, 12, 12), new Illness("редкие перья"));
        Animal octopus = new Octopus("«Чернильник»", new Owner("Кенни Омега"),
                LocalDate.of(2023, 12, 12), new Illness("белые чернила"));

        Doctor doctorDoolittle = new Doctor();
        Nurse nurseChapel = new Nurse();
        Nurse nurseVikki = new Nurse();

        List<Animal> allAnimals = new ArrayList<>();
        allAnimals.add(cat);
        allAnimals.add(dog);
        allAnimals.add(duck);
        allAnimals.add(fish);
        allAnimals.add(eagle);
        allAnimals.add(octopus);

        List<Personal> allStuff = new ArrayList<>();
        allStuff.add(doctorDoolittle);
        allStuff.add(nurseChapel);

        VeterinaryClinic clinic = new VeterinaryClinic(allAnimals, allStuff);
        clinic.addAnimal(cat2);
        clinic.addStuff(nurseVikki);

        System.out.println(clinic.GetAllFlyable(allAnimals));
        System.out.println("-----------------------------------");
        System.out.println(clinic.GetAllGoable(allAnimals));
        System.out.println("-----------------------------------");
        System.out.println(clinic.GetAllSwimable(allAnimals));
        System.out.println("-----------------------------------");

        clinic.startWorkingDay(allAnimals, allStuff);

    }
}
