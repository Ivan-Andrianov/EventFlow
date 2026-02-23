package ru.guu.eventflow.Interface.schedule;

import ru.guu.eventflow.Schedule;
import ru.guu.eventflow.ScheduleItem;

import java.util.UUID;

public class ScheduleServiceImpl implements ScheduleService{

    /**
     * Репозиторий для работы с БД
     */
    private ScheduleRepository scheduleRepository;

    public ScheduleServiceImpl(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    @Override
    public void createSchedule(Schedule schedule) {
        scheduleRepository.create(schedule);
    }

    @Override
    public Schedule getSchedule(UUID scheduleId) {
        return scheduleRepository.getInteractionById(scheduleId);
    }

    @Override
    public void createScheduleItem(UUID scheduleId, ScheduleItem item) {
        /**
         * Проверяет, что активность не накладывается по времени на уже существующую в графику активность, а также
         * проверяет, что INTERACTION активность будет создана в конце графика.
         */
    }

    /**
     * Задает новую реализацию {@link ScheduleRepository}
     *
     * @param scheduleRepository реализация {@link ScheduleRepository}
     */
    public void setScheduleRepository(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }
}
