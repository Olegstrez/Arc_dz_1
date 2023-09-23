package ru.geekbrain.dz_1.InMemoryModel;

import ru.geekbrain.dz_1.Modelelemnt.*;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChange {
    public List<IModelChangeObserved> changeObservees;

    public List<PoliginModel> Models = new ArrayList<>();
    public List<Scene> Scenes = new ArrayList<>();
    public List<Flash> Flashes = new ArrayList<>();
    public List<Camera> Cameras = new ArrayList<>();

    public void add(PoliginModel model){
        Models.add(model);
        NotifyChange();
    }


    @Override
    public void NotifyChange() {
        for (IModelChangeObserved observed:changeObservees){
            observed.ApplyUpdateModel();
        }

    }

    @Override
    public void RegisterIModelChange(IModelChangeObserved o) {
        changeObservees.add(o);
    }

    @Override
    public void RemoveIModelChange(IModelChangeObserved o) {
        changeObservees.remove(o);
    }

}
