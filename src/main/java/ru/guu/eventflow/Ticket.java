package ru.guu.eventflow;

import java.util.UUID;

/**
 * Билет на мероприятие
 */
public class Ticket {

    /**
     * Идентификатор билета
     */
    private UUID id;

    /**
     * Идентификатор мероприятия
     */
    private UUID eventId;

    /**
     * Цена билета
     */
    private double price;

    /**
     * Владелец билета
     */
    private UUID ownerId;

    /**
     * Информация о покупке билета
     */
    private Purchase purchase;

    public Ticket(UUID eventId, double price) {
        this.id = UUID.randomUUID();
        this.eventId = eventId;
        this.price = price;
    }

    /**
     * Получить идентификатор билета
     *
     * @return идентификатор билета
     */
    public UUID getId() {
        return id;
    }

    /**
     * Получить идентификатор события
     *
     * @return идентификатор события
     */
    public UUID getEventId() {
        return eventId;
    }

    /**
     * Получить цену билета
     *
     * @return цена билета
     */
    public double getPrice() {
        return price;
    }

    /**
     * Изменить цену билета
     *
     * @param price новая цена билета
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Получить идентификатор владельца билета
     *
     * @return идентификатор пользователя
     */
    public UUID getOwnerId() {
        return ownerId;
    }

    /**
     * Изменить идентификатор владельца билета
     *
     * @param ownerId новый идентификатор владельца билета
     */
    public void setOwnerId(UUID ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * Получить информацию о покупке
     *
     * @return информация о покупке
     */
    public Purchase getPurchase() {
        return purchase;
    }

    /**
     * Задать информацию о покупке
     *
     * @param purchase информация о покупке
     */
    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }
}
