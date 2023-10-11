import View.View;
import Data.Group;
import Data.HotDrinks;
import Data.Authomat;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        HotDrinks hotDrinks1 = new HotDrinks("шоколад", 150, 450, 80, 1);
        HotDrinks hotDrinks2 = new HotDrinks("шоколад", 100, 300, 80, 2);
        HotDrinks hotDrinks3 = new HotDrinks("шоколад", 70, 250, 80, 3);
        HotDrinks hotDrinks4 = new HotDrinks("кофе", 150, 450, 90, 4);
        HotDrinks hotDrinks5 = new HotDrinks("кофе", 150, 450, 90, 5);
        HotDrinks hotDrinks6 = new HotDrinks("кофе", 150, 450, 90, 6);
        HotDrinks hotDrinks7 = new HotDrinks("чай", 150, 450, 70, 7);
        HotDrinks hotDrinks8 = new HotDrinks("чай", 150, 450, 70, 8);
        HotDrinks hotDrinks9 = new HotDrinks("чай", 150, 450, 70, 9);

        view.createGroup(new Group(new ArrayList<>(List.of(hotDrinks1, hotDrinks2, hotDrinks3, hotDrinks4 ,hotDrinks5 ,hotDrinks6, hotDrinks7, hotDrinks8 ,hotDrinks9)),
                new Authomat("Автомат",  "Горячие_напитки", "кофейня"), 10));
        view.createDrinks(10, "чай", 150, 450, 70, 10);
        view.printInfo();
    }
}
