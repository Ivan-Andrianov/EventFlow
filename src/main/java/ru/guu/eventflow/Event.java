package ru.guu.eventflow;

import java.util.UUID;

/**
 * Мероприятие
 */
public class Event {

    /**
     * Идентификатор мероприятия
     */
    private UUID id;

    /**
     * Идентификатор графика мероприятия
     */
    private UUID scheduleId;

    /**
     * Тема мероприятия
     */
    private EventTheme theme;

    /**
     * Название мероприятия
     */
    private String name;

    public Event(UUID id, UUID scheduleId, EventTheme theme, String name) {
        this.id = UUID.randomUUID();
        this.scheduleId = scheduleId;
        this.theme = theme;
        this.name = name;
    }

    /**
     * Получить идентификатор события
     *
     * @return идентификатор события
     */
    public UUID getId() {
        return id;
    }

    /**
     * Получить идентификатор расписания
     *
     * @return идентификатор расписания
     */
    public UUID getScheduleId() {
        return scheduleId;
    }

    /**
     * Задать идентификатор расписания
     *
     * @param scheduleId идентификатор расписания
     */
    public void setScheduleId(UUID scheduleId) {
        this.scheduleId = scheduleId;
    }

    /**
     * Получить тему мероприятия
     *
     * @return тема мероприятия
     */
    public EventTheme getTheme() {
        return theme;
    }

    /**
     * Получить название мероприятия
     *
     * @return название мероприятия
     */
    public String getName() {
        return name;
    }

    /**
     * Задать имя мероприятия
     *
     * @param name новое имя мероприятия
     */
    public void setName(String name) {
        this.name = name;
    }
}
