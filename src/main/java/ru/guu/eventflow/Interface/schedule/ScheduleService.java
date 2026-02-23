package ru.guu.eventflow.Interface.schedule;

import ru.guu.eventflow.Schedule;
import ru.guu.eventflow.ScheduleItem;

import java.util.UUID;

/**
 * API сервиса для работы с информацией о графиках мероприятий
 */
public interface ScheduleService {

    /**
     * Создание графика мероприятия
     *
     * @param schedule график мероприятия
     */
    void createSchedule(Schedule schedule);

    /**
     * Получить график по идентификатору
     *
     * @param scheduleId идентификатор графика мероприятия
     */
    Schedule getSchedule(UUID scheduleId);

    /**
     * Создать новую активность в графике.
     *
     * @param scheduleId идентификатор графика
     * @param item активность
     */
    void createScheduleItem(UUID scheduleId, ScheduleItem item);
}
