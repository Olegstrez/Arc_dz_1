package ru.geekbrain.dz_1.InMemoryModel;

public interface IModelChange {

     void NotifyChange();

     void RegisterIModelChange(IModelChangeObserved o);
     void RemoveIModelChange(IModelChangeObserved o);

}
