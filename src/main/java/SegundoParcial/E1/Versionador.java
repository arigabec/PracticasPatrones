package SegundoParcial.E1;

import java.util.HashMap;
import java.util.Map;

public class Versionador {
    private Map<String, Memento> stateMap = new HashMap<>();

    public void addMemento(String version, Memento m){
        stateMap.put(version,m);
    }

    public Memento getMemento(String version){
        return stateMap.get(version);
    }
}

