package enums;

public enum Introductories {
    HOWEVER("однако"),
    MAYBE("наверное"),
    AGAIN("опять");

    private String name;

    private Introductories(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
