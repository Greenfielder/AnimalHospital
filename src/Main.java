import java.time.LocalDate;
import java.util.*;

import clients.*;

public class Main {

    public static void main(String[] args) {
/*
1) Добавить в класс Animal публичные методы двигаться(toGo), летать(fly), плавать(swim).
2) Создать по два класса
наследника Animal, умеющих летать, плавать, бегать(животное может как уметь что-то одно, так и все сразу).
3) В main добиться того, чтобы при вызове метода действия, которое конкретное животное не умеет, оно этого не делало (кошки не летают, рыбы не ходят)
4) В файле readme.md в репозитории гитхаб описать
какие проблемы в таком проектировании Вы увидели,
а также там же написать возникшие при выполнении дз вопросы
 */

        Animal cat1 = new Cat("Барсик", new Owner("Стив Остин"),
                LocalDate.of(2018, 3, 5), new Illness("Здоров"), 10D);
        Animal dog1 = new Dog("«Рекс»", new Owner("Халк Хоган"),
                LocalDate.of(2020, 6, 10), new Illness("Лишай"));
        Animal duck1 = new Duck("«Скрудж»", new Owner("Роман Рейнс"),
                LocalDate.of(2022, 2, 12), new Illness("Сонливость"));
        Animal fish1 = new Fish("«Немо»", new Owner("Биг Шоу"),
                LocalDate.of(2023, 12, 12), new Illness("бледная"));

        List<Animal> animals = new ArrayList<Animal>();

        animals.add(cat1);
        animals.add(dog1);
        animals.add(duck1);
        animals.add(fish1);

        for (Animal animal : animals) {
            System.out.println(animal.getType() + " по имени " + animal.getNickName() + " может: ");
            animal.toGo();
            animal.fly();
            animal.swim();
            System.out.println("------------");
        }

    }
}
