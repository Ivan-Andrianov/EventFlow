package ru.guu.eventflow.Interface.interaction;

import ru.guu.eventflow.Interaction;

import java.util.UUID;

/**
 * API сервиса для работы с информацией об интерактивах
 */
public interface InteractionService {

    /**
     * Создание интерактива
     *
     * @param interaction информация об интерактиве
     */
    void createInteraction(Interaction interaction);

    /**
     * Получить интерактив по идентификатору
     *
     * @param interactionId идентификатор интерактива
     */
    Interaction getInteraction(UUID interactionId);
}
