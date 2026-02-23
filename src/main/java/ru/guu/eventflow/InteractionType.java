package ru.guu.eventflow;

/**
 * Тип интерактива
 */
public enum InteractionType {

    /**
     * Вопросы / ответы
     */
    QA(1, "Вопросы / ответы", "Вопросы / ответы"),

    /**
     * Опрос
     */
    QUESTIONNAIRE(2, "Опрос", "Опрос завершающий мероприятие");

    /**
     * Идентификатор типа
     */
    private final int id;

    /**
     * Название типа
     */
    private final String name;

    /**
     * Описание типа
     */
    private final String description;

    InteractionType(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
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
     * Получить название типа
     *
     * @return название типа
     */
    public String getName() {
        return name;
    }

    /**
     * Получить описание типа
     *
     * @return описание типа
     */
    public String getDescription() {
        return description;
    }
}
