package ru.guu.eventflow.Interface.event;

import ru.guu.eventflow.Event;

import java.util.UUID;

/**
 * API для работы с базой данных для сущности {@link Event}
 */
public interface EventRepository {

    /**
     * Получить мероприятие по идентификатору
     *
     * @param id идентификатор мероприятия
     * @return мероприятие
     */
    Event getEventById(UUID id);

    /**
     * Обновить информацию о мероприятии
     *
     * @param event мероприятие
     */
    void update(Event event);

    /**
     * Сохранить мероприятие в БД
     *
     * @param event мероприятие
     */
    void create(Event event);
}
