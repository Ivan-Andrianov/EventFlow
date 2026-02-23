package ru.guu.eventflow.Interface.schedule;

import ru.guu.eventflow.Schedule;
import ru.guu.eventflow.ScheduleItem;

import java.util.UUID;

/**
 * REST API для работы с информацией о графиках мероприятий
 */
public interface ScheduleServiceApi {

    /**
     * Создание графика мероприятия. POST /schedule
     *
     * @param schedule график мероприятия
     */
    void createSchedule(Schedule schedule);

    /**
     * Получить интерактив по идентификатору. GET /schedule/{scheduleId}
     *
     * @param scheduleId идентификатор графика мероприятия
     */
    Schedule getInteraction(UUID scheduleId);

    /**
     * Создать новую активность в графике. POST /schedule/item
     *
     * @param scheduleId идентификатор графика
     * @param item активность
     */
    void createScheduleItem(UUID scheduleId, ScheduleItem item);
}
