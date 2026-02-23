package ru.guu.eventflow.Interface.event;

import ru.guu.eventflow.Event;
import ru.guu.eventflow.EventStatistic;
import ru.guu.eventflow.EventTheme;

import java.util.UUID;

/**
 * Контроллер для обработки HTTP запросов связанных с мероприятиями
 */
public class EventController implements EventServiceApi {

    /**
     * Сервис с бизнес-логикой для работы с мероприятиями
     */
    private EventService eventService;

    /**
     * Сервис с бизнес-логикой для работы со статистикой мероприятия
     */
    private EventStatisticService eventStatisticService;

    @Override
    public void createEvent(Event event) {
        eventService.createEvent(event);
    }

    @Override
    public EventTheme getEventTheme(UUID eventId) {
        return eventService.getEventTheme(eventId);
    }

    @Override
    public EventStatistic getEventStatistic(UUID eventId) {
        return eventStatisticService.getEventStatistic(eventId);
    }

    @Override
    public void uploadEvent(UUID eventId) {

    }
}
