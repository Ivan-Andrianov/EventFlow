package ru.guu.eventflow.Interface.schedule;

import ru.guu.eventflow.Schedule;

import java.util.UUID;

/**
 * API для работы с базой данных для сущности {@link Schedule}
 */
public interface ScheduleRepository {

    /**
     * Получить график по идентификатору
     *
     * @param id идентификатор графика
     * @return график мероприятия
     */
    Schedule getInteractionById(UUID id);

    /**
     * Обновить информацию о графике
     *
     * @param schedule график мероприятия
     */
    void update(Schedule schedule);

    /**
     * Сохранить интерактив в БД
     *
     * @param schedule график мероприятия
     */
    void create(Schedule schedule);
}
