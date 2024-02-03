package clinic;

import clients.*;
import personal.*;

import java.util.*;

//а также методы для работы с персоналом клиники.
public class VeterinaryClinic {
    protected List<Animal> animals;
    protected List<Personal> personals;
    protected Owner owner;
    protected Illness illness;

//    public VeterinaryClinic(List<Animal> animals, List<Personal> personals, Owner owner, Illness illness) {
//        this.animals = animals;
//        this.personals = personals;
//        this.owner = owner;
//        this.illness = illness;
//    }

    public VeterinaryClinic(List<Animal> animals, List<Personal> personals) {
        this.animals = animals;
        this.personals = personals;
    }

    public void addStuff(Personal stuff){
       personals.add(stuff);
    }

    public void addAnimal(Animal patient){
        animals.add(patient);
    }

    public List<Animal> GetAllFlyable(List<Animal> allAnimals) {
        List<Animal> flyableAnimals = new ArrayList<>();

        for (Animal animal : allAnimals) {
            if (animal instanceof Flyable) {
                flyableAnimals.add(animal);
            }
        }
        return flyableAnimals;
    }

    public List<Animal> GetAllGoable(List<Animal> allAnimals) {
        List<Animal> goableAnimals = new ArrayList<>();

        for (Animal animal : allAnimals) {
            if (animal instanceof Goable) {
                goableAnimals.add(animal);
            }
        }
        return goableAnimals;
    }

    public List<Animal> GetAllSwimable(List<Animal> allAnimals) {
        List<Animal> swimableAnimals = new ArrayList<>();

        for (Animal animal : allAnimals) {
            if (animal instanceof Swimable) {
                swimableAnimals.add(animal);
            }
        }
        return swimableAnimals;
    }

    public void startWorkingDay(List<Animal> allAnimals, List<Personal> allstuff) {
        List<Animal> animals = new ArrayList<>();
        List<Personal> personals = new ArrayList<>();
        Doctor doctor = new Doctor();
        Nurse nurse = new Nurse();

         for (Animal animal : allAnimals) {
             for (Personal personal : allstuff) {
                 if (personal instanceof Therapist) {
                     doctor = (Doctor) personal;
                 }
                 if (personal instanceof Nurses) {
                     assert personal instanceof Nurse;
                     nurse = (Nurse) personal;
                 }
             }
             System.out.println("Новый пациент: ");
             doctor.healing(animal, nurse);
             System.out.println("- ");
         }
    }
}