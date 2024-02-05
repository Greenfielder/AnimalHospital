package drugstore;

import drugstore.components.*;

import java.util.*;

// 1) Добавить интерфейс Copmparable<Pharmacy> к классу Pharmacy(ЛЕКАРСТВО). Переопределить метод compareTo()
//  подсказка: можно добавить, а можно не добавлять в класс поля;
// 2) Создать несколько экземпляров Pharmacy, добавить их в ArrayList, написать метод, выводящий Pharmacy в отсортированном виде.
// 3) *(усложненное, не обязательное) Постараться написать еще 1 метод сортировки лекарств, но уже по другому параметру


public class Drugmain {

    public static void main(String[] args) {
        Component water = new Water("Water", 10D, 1);
        Component azitronite = new Azitronite("Azitronite", 2D, 14);
        Component penicillin = new Penicillin("penicillin", 1.6D, 6);
        Component amoxicillin = new Amoxicillin("Amoxicillin", 0.8D, 10);
        Component acid = new ClavulanicAcid("Clavulanic Acid", 1D, 25);


        PharmacyV2 p1 = new PharmacyV2();
        p1.addComponents(water, azitronite);
        PharmacyV2 p2 = new PharmacyV2();
        p2.addComponents(penicillin, water);
        PharmacyV2 p3 = new PharmacyV2();
        p3.addComponents(azitronite, penicillin);
        PharmacyV2 p4 = new PharmacyV2();
        p4.addComponents(amoxicillin, acid);
        PharmacyV2 p5 = new PharmacyV2();
        p5.addComponents(acid, water);

        ArrayList<PharmacyV2> pharmacies = new ArrayList<>();
        pharmacies.add(p1);
        pharmacies.add(p2);
        pharmacies.add(p3);
        pharmacies.add(p4);
        pharmacies.add(p5);


        Collections.sort(pharmacies);
        for (PharmacyV2 pharmacy : pharmacies) {
            System.out.println(pharmacy);
        }
    }
}