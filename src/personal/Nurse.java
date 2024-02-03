package personal;

import clients.Animal;

public class Nurse extends Personal implements Nurses{
    protected Animal animal;

    public void makeInjection(){
        System.out.println("Пациенту сделали укол! ---");
    }
}
