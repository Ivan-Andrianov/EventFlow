package ru.guu.eventflow.Interface.event;

import ru.guu.eventflow.EventStatistic;

import java.util.UUID;

/**
 * API для работы с базой данных для сущности {@link EventStatistic}
 */
public interface EventStatisticRepository {

    /**
     * Получить статистику мероприятия из БД по идентификатору мероприятия
     *
     * @param eventId идентификатор мероприятия
     * @return статистика мероприятия
     */
    EventStatistic getStatisticByEventId(UUID eventId);
}
