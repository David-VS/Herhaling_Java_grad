package be.ehb.snacks;

import java.util.TreeSet;

public final class SnackSingleton {

    //singleton pattern
    private static final SnackSingleton INSTANCE = new SnackSingleton();

    private SnackSingleton(){
    }

    public static SnackSingleton getINSTANCE(){
        return INSTANCE;
    }

    //snack beheer
    private TreeSet<Snack> snackSet = new TreeSet<>();

    public void addSnack(Snack toAdd){
        snackSet.add(toAdd);
    }

    public void removeSnack(Snack toRemove){
        snackSet.remove(toRemove);
    }

    public TreeSet<Snack> getSnackSet() {
        return snackSet;
    }
}
