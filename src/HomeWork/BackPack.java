package HomeWork;

import java.util.ArrayList;

/**
 * написать программу "Задача о рюукзаке" с помощью рекурсии.
 * В общем виде задачу можно сформулировать так:
 * из заданного множества предметов со свойствами "стоимость и "вес"
 * требуется отобрать множество с максимально полной стоимостью,
 * соблюдая при этом ограничение на суммарный вес.
 * Вывести итоговую стоимость рюкзака.
 *
 * 10 предметов (макс 25 кг)
 * стоимость / вес
 * 10/1
 * 9/2
 * 5/4
 * ...
 *
 */

public class BackPack {

 private int maxWeight = 25;
 private int currentWeight = 0;
 private int getCurrentCost = 0;

    public void back(ArrayList<Item> pack, int size) {

        int maxCost = pack.get(0).cost;

        if (size >= 1) {
            back(pack, size - 1);
        }

        for (int i = 0; i < pack.size(); i++) {
            if (pack.get(i).cost > maxCost) {
                maxCost = pack.get(i).cost;
            }
        }

        for (int i = 0; i < pack.size(); i++) {
            if (pack.get(i).cost == maxCost) {
                if (pack.get(i).weight <= maxWeight) {
                    maxWeight -= pack.get(i).weight;
                    getCurrentCost += pack.get(i).cost;
                    currentWeight += pack.get(i).weight;
                    pack.remove(i);
                    i--;
                } else if (pack.get(i).weight > maxWeight) {
                    pack.remove(i);
                    i--;
                }
            }
        }

        if (pack.size() == 0) {
            return;
        }
    }

    public void info(){
        System.out.println("Стоимость рюкзака " + this.getCurrentCost +
                " Итоговый вес " + this.currentWeight + " Незанятый вес " + this.maxWeight);
    }
}
