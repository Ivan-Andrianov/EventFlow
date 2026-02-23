package ru.guu.eventflow.Interface.schedule;

import ru.guu.eventflow.Schedule;
import ru.guu.eventflow.ScheduleItem;

import java.util.UUID;

/**
 * Контроллер для обработки HTTP запросов связанных с графиками мероприятий
 */
public class ScheduleController implements ScheduleServiceApi {

    /**
     * Сервис для работы с графиками мероприятий
     */
    private ScheduleService scheduleService;

    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @Override
    public void createSchedule(Schedule schedule) {
        scheduleService.createSchedule(schedule);
    }

    @Override
    public Schedule getInteraction(UUID scheduleId) {
        return scheduleService.getSchedule(scheduleId);
    }

    @Override
    public void createScheduleItem(UUID scheduleId, ScheduleItem item) {
        scheduleService.createScheduleItem(scheduleId, item);
    }

    /**
     * Задать новую реализацию {@link ScheduleService}
     *
     * @param scheduleService реализация {@link ScheduleService}
     */
    public void setScheduleService(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }
}
