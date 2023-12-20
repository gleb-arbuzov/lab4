package enums;

public enum HowMuch {
    MORE("побольше"),
    LESS("поменьше");

    private String name;

    private HowMuch(String name) { this.name = name; }

    public String getName() { return name; }
}
