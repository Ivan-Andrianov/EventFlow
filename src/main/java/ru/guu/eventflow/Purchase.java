package ru.guu.eventflow;

import java.sql.Timestamp;
import java.util.UUID;

/**
 * Информация о покупке билета
 */
public class Purchase {

    /**
     * Идентификатор покупки
     */
    private UUID id;

    /**
     * Цена покупки
     */
    private double price;

    /**
     * Время покупки
     */
    private Timestamp time;

    /**
     * Промокод, используемый при покупке
     */
    private Promocode promocode;

    public Purchase(double price, Timestamp time, Promocode promocode) {
        this.id = UUID.randomUUID();
        this.price = price;
        this.time = time;
        this.promocode = promocode;
    }

    /**
     * Получить идентификатор покупки
     *
     * @return идентификатор покупки
     */
    public UUID getId() {
        return id;
    }

    /**
     * Получить цену покупки
     *
     * @return цена покупки
     */
    public double getPrice() {
        return price;
    }

    /**
     * Получить дату и время покупки
     *
     * @return дата и время покупки
     */
    public Timestamp getTime() {
        return time;
    }

    /**
     * Получить промокод, используемый при покупке
     *
     * @return промокод
     */
    public Promocode getPromocode() {
        return promocode;
    }
}
