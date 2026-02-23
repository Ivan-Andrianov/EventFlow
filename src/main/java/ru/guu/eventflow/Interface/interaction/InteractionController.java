package ru.guu.eventflow.Interface.interaction;

import ru.guu.eventflow.Interaction;

import java.util.UUID;

/**
 * Контроллер для обработки HTTP запросов связанных с интерактивами
 */
public class InteractionController implements InteractionServiceApi {

    /**
     * Сервис для работы с интерактивами
     */
    private InteractionService interactionService;

    public InteractionController(InteractionService interactionService) {
        this.interactionService = interactionService;
    }

    @Override
    public void createInteraction(Interaction interaction) {
        interactionService.createInteraction(interaction);
    }

    @Override
    public Interaction getInteraction(UUID interactionId) {
        return interactionService.getInteraction(interactionId);
    }

    /**
     * Задать новую реализацию {@link InteractionService}
     *
     * @param interactionService реализация {@link InteractionService}
     */
    public void setInteractionService(InteractionService interactionService) {
        this.interactionService = interactionService;
    }
}
