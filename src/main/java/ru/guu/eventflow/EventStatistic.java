package ru.guu.eventflow;

import java.util.UUID;

/**
 * Статистика мероприятия
 */
public class EventStatistic {

    /**
     * Идентификатор статистики
     */
    private UUID id;

    /**
     * Идентификатор события
     */
    private UUID eventId;

    /**
     * Количество фактических участников мероприятия
     */
    private Integer participantsCount;

    /**
     * Средний возраст участников мероприятия
     */
    private Double averageAge;

    /**
     * Отношение числа фактических участников к купившим билет пользователям
     */
    private Double fullness;


    public EventStatistic(UUID eventId) {
        this.id = UUID.randomUUID();
        this.eventId = eventId;
    }

    /**
     * Получить идентификатор статистики
     *
     * @return идентификатор статистики
     */
    public UUID getId() {
        return id;
    }

    /**
     * Получить идентификатор мероприятия
     *
     * @return идентификатор мероприятия
     */
    public UUID getEventId() {
        return eventId;
    }

    /**
     * Получить фактическое число участников мероприятия
     *
     * @return фактическое число участников мероприятия
     */
    public Integer getParticipantsCount() {
        return participantsCount;
    }

    /**
     * Задать фактическое число участников мероприятия
     *
     * @param participantsCount фактическое число участников мероприятия
     */
    public void setParticipantsCount(Integer participantsCount) {
        this.participantsCount = participantsCount;
    }

    /**
     * Получить средний возраст участников мероприятия
     *
     * @return средний возраст участников мероприятия
     */
    public Double getAverageAge() {
        return averageAge;
    }

    /**
     * Задать средний возраст участников мероприятия
     *
     * @param averageAge средний возраст участников мероприятия
     */
    public void setAverageAge(Double averageAge) {
        this.averageAge = averageAge;
    }

    /**
     * Получить отношение числа фактических участников к купившим билет пользователям в процентах
     *
     * @return отношение числа фактических участников к купившим билет пользователям в процентах
     */
    public Double getFullness() {
        return fullness;
    }

    /**
     * Задать отношение числа фактических участников к купившим билет пользователям в процентах
     *
     * @param fullness отношение числа фактических участников к купившим билет пользователям в процентах
     */
    public void setFullness(Double fullness) {
        this.fullness = fullness;
    }
}
