package ru.guu.eventflow.Interface.interaction;

import ru.guu.eventflow.Interaction;

import java.util.UUID;

/**
 * API для работы с базой данных для сущности {@link Interaction}
 */
public interface InteractionRepository {

    /**
     * Получить интерактив по идентификатору
     *
     * @param id идентификатор мероприятия
     * @return мероприятие
     */
    Interaction getInteractionById(UUID id);

    /**
     * Обновить информацию об интерактиве
     *
     * @param interaction интерактив
     */
    void update(Interaction interaction);

    /**
     * Сохранить интерактив в БД
     *
     * @param interaction интерактив
     */
    void create(Interaction interaction);
}
