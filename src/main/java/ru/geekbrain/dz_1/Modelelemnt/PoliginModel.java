package ru.geekbrain.dz_1.Modelelemnt;

import java.util.List;

public class PoliginModel   {


    private List<Poligon> poligons ;
    private  List<Texture> textures;

    public PoliginModel(List<Poligon> poligons) {
        this.poligons = poligons;
    }

    public PoliginModel(List<Poligon> poligons, List<Texture> textures) {
        this.poligons = poligons;
        this.textures = textures;
    }

    public List<Poligon> getPoligons() {
        return poligons;
    }

    public List<Texture> getTextures() {
        return textures;
    }
}
