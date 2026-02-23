package ru.guu.eventflow.Interface.event;

import ru.guu.eventflow.Event;
import ru.guu.eventflow.EventTheme;

import java.util.UUID;

/**
 * API сервиса для работы с информацией о мероприятиях
 */
public interface EventService {

    /**
     * Создание мероприятия
     *
     * @param event информация о мероприятии
     */
    void createEvent(Event event);

    /**
     * Получить тему мероприятия
     *
     * @param eventId идентификатор мероприятия
     */
    EventTheme getEventTheme(UUID eventId);

    /**
     * Загрузить видеозапись мероприятия на видеохостинг
     *
     * @param event мероприятие
     */
    void uploadEvent(Event event);
}
