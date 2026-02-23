package ru.guu.eventflow;

import java.sql.Timestamp;

/**
 * Временной слот
 */
public class TimeSlot {

    /**
     * Дата и время начала временного слота
     */
    private Timestamp since;

    /**
     * Дата и время окончания временного слота
     */
    private Timestamp till;

    public TimeSlot(Timestamp since, Timestamp till) {
        this.since = since;
        this.till = till;
    }

    /**
     * Получить дату и время начала временного слота
     *
     * @return дата и время начала временного слота
     */
    public Timestamp getSince() {
        return since;
    }

    /**
     * Получить дату и время окончания временного слота
     *
     * @return дата и время окончания временного слота
     */
    public Timestamp getTill() {
        return till;
    }
}
