package ru.guu.eventflow;

import java.sql.Timestamp;
import java.util.UUID;

/**
 * Промокод на покупку билета
 */
public class Promocode {

    /**
     * Идентификатор промокода
     */
    private UUID id;

    /**
     * Скидка по промокоду (в процентах)
     */
    private double discount;

    /**
     * Дата и время экспирации промокода
     */
    private Timestamp expiration;

    public Promocode(double discount, Timestamp expiration) {
        this.id = UUID.randomUUID();
        this.discount = discount;
        this.expiration = expiration;
    }

    /**
     * Получить идентификатор промокода
     *
     * @return идентификатор промокода
     */
    public UUID getId() {
        return id;
    }

    /**
     * Получить скидку по промокоду (в процентах)
     *
     * @return скидка
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * Получить дату и время экспирации
     *
     * @return дата и время экспирации
     */
    public Timestamp getExpiration() {
        return expiration;
    }
}
