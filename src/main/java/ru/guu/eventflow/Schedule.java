package ru.guu.eventflow;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Расписание
 */
public class Schedule {

    /**
     * Идентификатор графика мероприятия
     */
    private UUID id;

    /**
     * Список активностей мероприятия
     */
    private List<ScheduleItem> items;

    public Schedule() {
        this.id = UUID.randomUUID();
        this.items = new ArrayList<>();
    }

    /**
     * Получить идентификатор графика
     *
     * @return идентификатор графика
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Получить список активностей (копию)
     *
     * @return список активностей
     */
    public List<ScheduleItem> getItems() {
        return new ArrayList<>(items);
    }

    /**
     * Добавить новую активность в график
     *
     * @param item активность
     */
    public void addItem(ScheduleItem item) {
        this.items.add(item);
    }

    /**
     * Добавить список активностей в график
     *
     * @param items список активностей
     */
    public void addItems(List<ScheduleItem> items) {
        this.items.addAll(items);
    }

    /**
     * Удалить активность из графика
     *
     * @param item активность
     */
    public void removeItem(ScheduleItem item) {
        items.remove(item);
    }
}
