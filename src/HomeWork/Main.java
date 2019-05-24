package HomeWork;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Factorial fact = new Factorial();
        System.out.println(fact.fact(6));
        Item i0 = new Item(2,15);
        Item i1 = new Item(10,4);
        Item i2 = new Item(15,6);
        Item i3 = new Item(18,3);
        Item i4 = new Item(5,2);
        Item i5 = new Item(1,5);
        Item i6 = new Item(9,3);
        Item i7 = new Item(7,2);
        Item i8 = new Item(27,11);
        Item i9 = new Item(23,8);
        Item i10 = new Item(13,7);
        Item i11 = new Item(33,25);
        Item i12= new Item(21,14);
        Item i13 = new Item(2,1);
        Item i14 = new Item(50,25);

        ArrayList<Item> pack = new ArrayList<>();
        pack.add(i0);
        pack.add(i1);
        pack.add(i2);
        pack.add(i5);
        pack.add(i8);
        pack.add(i9);
        pack.add(i10);
        pack.add(i12);
        pack.add(i13);

        BackPack bp = new BackPack();
        bp.back(pack,14);
        bp.info();
    }
}
