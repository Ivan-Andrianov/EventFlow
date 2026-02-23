package ru.guu.eventflow.Interface.interaction;

import ru.guu.eventflow.Interaction;

import java.util.UUID;

/**
 * Реализация {@link InteractionService}
 */
public class InteractionServiceImpl implements InteractionService {

    /**
     * Репозиторий для работы с БД
     */
    private InteractionRepository repository;

    @Override
    public void createInteraction(Interaction interaction) {
        repository.create(interaction);
    }

    @Override
    public Interaction getInteraction(UUID interactionId) {
        return repository.getInteractionById(interactionId);
    }
}
