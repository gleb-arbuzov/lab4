package enums;

public enum ActionTime {
    THEN("Вот тогда-то"),
    ALREADY("Уже"),
    THATTIME("Тотчас"),
    THIS_DAY("В этот день"),
    JUST_WHEN("Как только"),
    AFTER_TIME("Спустя некоторое время");

    private String value;

    private ActionTime(String value) { this.value = value; }

    public String getValue() { return value; }
}
