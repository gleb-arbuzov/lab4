package enums;

public enum Where {
    HERE("Здесь"),
    IN_HOUSES("В домах");

    private String name;

    private Where(String name) {
        this.name = name;
    }

    public String getName() { return name; }
}
