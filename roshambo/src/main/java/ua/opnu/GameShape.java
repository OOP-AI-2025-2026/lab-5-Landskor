package ua.opnu;

public abstract class GameShape {
    private String name;

    public GameShape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}