package ru.guu.eventflow;

/**
 * Роль пользователя системы EventFlow
 */
public enum UserRole {

    /**
     * Организатор
     */
    ORGANIZER(1, "Организатор", "Создает мероприятия, планирует количество билетов"),

    /**
     * Спикер
     */
    SPEAKER(2, "Ведущий мероприятия", "Читает доклад на мероприятии"),

    /**
     * Участник
     */
    PARTICIPANT(3, "Участник мероприятия", "");

    /**
     * Идентификатор роли
     */
    private final Integer id;

    /**
     * Название роли
     */
    private final String name;

    /**
     * Описание роли
     */
    private final String description;

    UserRole(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * Получить идентификатор роли
     *
     * @return идентификатор
     */
    public Integer getId() {
        return id;
    }

    /**
     * Получить название роли
     *
     * @return название роли
     */
    public String getName() {
        return name;
    }

    /**
     * Получить описание роли
     *
     * @return описание роли
     */
    public String getDescription() {
        return description;
    }
}
