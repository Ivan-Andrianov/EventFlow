package ru.guu.eventflow.Interface.interaction;

import ru.guu.eventflow.Interaction;

import java.util.UUID;

/**
 * REST API для работы с информацией об интерактивах
 */
public interface InteractionServiceApi {

    /**
     * Создать интерактив POST /interaction
     *
     * @param interaction интерактив
     */
    void createInteraction(Interaction interaction);

    /**
     * Получить интерактив GET /interaction/{interactionId}
     *
     * @param interactionId идентификатор интерактива
     * @return интерактив
     */
    Interaction getInteraction(UUID interactionId);
}
