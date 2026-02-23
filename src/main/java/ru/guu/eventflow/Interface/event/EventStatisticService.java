package ru.guu.eventflow.Interface.event;

import ru.guu.eventflow.EventStatistic;

import java.util.UUID;

/**
 * API сервиса для работы со статистикой мероприятия
 */
public interface EventStatisticService {

    /**
     * Получить статистику мероприятия по идентификатору мероприятия
     *
     * @param eventId идентификатор мероприятия
     * @return статистика по мероприятию
     */
    EventStatistic getEventStatistic(UUID eventId);
}
