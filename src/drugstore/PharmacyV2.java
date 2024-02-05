package drugstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PharmacyV2 implements Iterable<Component>, Comparable<PharmacyV2> {
    private List<Component> components = new ArrayList<>();
    private int index = 0;


    public void addComponents(Component ... components) {
        for(Component c : components){
            this.components.add(c);
        }
    }

    @Override
    public String toString() {
        int powerIndex = 0;
        for (Component c : components) {
            powerIndex = powerIndex + c.getPower();
        }
            return "PharmacyV2{" +
                    "components=" + components + " Общая сила припарата: " + powerIndex +'}';
    }

    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() { //Анонимный класс

            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Component next() {
                return components.get(index++);
            }
        };
    }

    //Сравниваем по мощьности суммы всех компонентов
    @Override
    public int compareTo(PharmacyV2 o) {
        int sum1 = 0;
        int sum2 = 0;
        for (Component c : components) {
            sum1 += c.getPower();
        }
        for (Component c : o.components) {
            sum2 += c.getPower();
        }
        return Integer.compare(sum1, sum2);
    }
}