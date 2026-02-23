package ru.guu.eventflow;

/**
 * Тип активности в расписании мероприятия
 */
public enum ScheduleItemType {

    /**
     * Вступительная часть
     */
    BEGIN(1, "Начало", "Вступительная часть мероприятия"),

    /**
     * Часть чтения доклада
     */
    REPORT(2, "Доклад", "Часть чтения доклада"),

    /**
     * Завершающая часть мероприятия
     */
    END(3, "Завершение", "Завершающая часть мероприятия"),

    /**
     * Часть с интерактивами
     */
    INTERACTION(4, "Интерактивы", "Часть с интерактивами"),

    /**
     * Перерыв
     */
    BREAK(5, "Перерыв", "Время на отдых");

    /**
     * Идентификатор типа активности
     */
    private final int id;

    /**
     * Описание типа активности
     */
    private final String description;

    /**
     * Название типа активности
     */
    private final String name;

    ScheduleItemType(int id, String description, String name) {
        this.id = id;
        this.description = description;
        this.name = name;
    }

    /**
     * Получить идентификатор типа
     *
     * @return идентификатор типа
     */
    public int getId() {
        return id;
    }

    /**
     * Получить описание типа
     *
     * @return описание типа
     */
    public String getDescription() {
        return description;
    }

    /**
     * Получить название типа
     *
     * @return название типа
     */
    public String getName() {
        return name;
    }
}
