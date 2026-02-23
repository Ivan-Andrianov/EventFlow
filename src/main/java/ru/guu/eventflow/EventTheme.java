package ru.guu.eventflow;

/**
 * Тема мероприятия
 */
public enum EventTheme {

    /**
     * Война
     */
    WAR(1, "Война", "Военная тематика"),

    /**
     * Образование
     */
    EDUCATION(2, "Образование", "Общая образовательная тематика"),

    /**
     * Разработка ПО
     */
    DEVELOPMENT(3, "Разработка программного обеспечения", "IT тематика"),

    /**
     * Спорт
     */
    SPORT(4, "Спорт", "Спортивная тематика: футбол, баскетбол, тенис");

    private final Integer id;
    private final String name;
    private final String description;

    EventTheme(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * Получить идентификатор темы
     *
     * @return идентификатор темы
     */
    public Integer getId() {
        return id;
    }

    /**
     * Получить название темы
     *
     * @return название темы
     */
    public String getName() {
        return name;
    }

    /**
     * Получить описание темы
     *
     * @return описание темы
     */
    public String getDescription() {
        return description;
    }
}
