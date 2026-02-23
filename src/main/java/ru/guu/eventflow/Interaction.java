package ru.guu.eventflow;

import java.util.UUID;

/**
 * Интерактив
 */
public class Interaction {

    /**
     * Идентификатор интерактива
     */
    private UUID id;

    /**
     * Название интерактива
     */
    private String name;

    /**
     * Тип интерактива
     */
    private InteractionType type;

    /**
     * Идентификатор события
     */
    private UUID eventId;

    public Interaction(String name, InteractionType type, UUID eventId) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.type = type;
        this.eventId = eventId;
    }

    /**
     * Получить идентификатор интерактива
     *
     * @return идентификатор интерактива
     */
    public UUID getId() {
        return id;
    }

    /**
     * Получить название интерактива
     *
     * @return название
     */
    public String getName() {
        return name;
    }

    /**
     * Получить тип интерактива
     *
     * @return тип интерактива
     */
    public InteractionType getType() {
        return type;
    }

    /**
     * Получить идентификатор события
     *
     * @return идентификатор события
     */
    public UUID getEventId() {
        return eventId;
    }
}
