package ru.geekbrain.dz_1.InMemoryModel;

import ru.geekbrain.dz_1.Modelelemnt.PoliginModel;
import ru.geekbrain.dz_1.Modelelemnt.Poligon;

import java.util.ArrayList;
import java.util.List;

public class Program1 {
    public static void main(String[] args) {
        ModelStore store = new ModelStore();
        Poligon s1= new Poligon();
        List<Poligon> Poligons = new ArrayList<>();
        Poligons.add(s1);
        PoliginModel PoliginModel = new PoliginModel(Poligons);
        store.add(PoliginModel);

    }

}
