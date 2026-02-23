package ru.guu.eventflow;

/**
 * Активность в расписании
 */
public class ScheduleItem {

    /**
     * Временной слот активности
     */
    private TimeSlot timeSlot;

    /**
     * Тип активности
     */
    private ScheduleItemType type;

    public ScheduleItem(TimeSlot timeSlot, ScheduleItemType type) {
        this.timeSlot = timeSlot;
        this.type = type;
    }

    /**
     * Получить временной слот активности
     *
     * @return временной слот активности
     */
    public TimeSlot getTimeSlot() {
        return timeSlot;
    }

    /**
     * Получить тип активности
     *
     * @return тип активности
     */
    public ScheduleItemType getType() {
        return type;
    }
}
