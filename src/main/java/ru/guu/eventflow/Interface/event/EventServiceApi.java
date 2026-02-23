package ru.guu.eventflow.Interface.event;

import ru.guu.eventflow.Event;
import ru.guu.eventflow.EventStatistic;
import ru.guu.eventflow.EventTheme;

import java.util.UUID;

/**
 * REST API для работы с информацией о мероприятиях
 */
public interface EventServiceApi {

    /**
     * Создание мероприятия POST /event
     *
     * @param event информация о мероприятии
     */
    void createEvent(Event event);

    /**
     * Получить тему мероприятия GET /event/theme
     *
     * @param eventId идентификатор мероприятия
     */
    EventTheme getEventTheme(UUID eventId);

    /**
     * Получить статистику по мероприятию GET /event/statistic
     *
     * @param eventId идентификатор мероприятия
     */
    EventStatistic getEventStatistic(UUID eventId);

    /**
     * Загрузить видеозапись мероприятия на видеохостинг. POST /event/upload
     *
     * @param eventId идентификатор мероприятия
     */
    void uploadEvent(UUID eventId);
}
