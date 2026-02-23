package ru.guu.eventflow.Interface.event;

import ru.guu.eventflow.EventStatistic;

import java.util.UUID;

/**
 * Реализация {@link EventStatisticService}.
 */
public class EventStatisticServiceImpl implements EventStatisticService {

    /**
     * Репозиторий для работы с бд. {@link EventStatistic}
     */
    private EventStatisticRepository eventStatisticRepository;

    public EventStatisticServiceImpl(EventStatisticRepository eventStatisticRepository) {
        this.eventStatisticRepository = eventStatisticRepository;
    }

    @Override
    public EventStatistic getEventStatistic(UUID eventId) {
        return null;
    }

    /**
     * Задать новую реализацию {@link EventStatisticRepository}
     *
     * @param eventStatisticRepository новая реализация {@link EventStatisticRepository}
     */
    public void setEventStatisticRepository(EventStatisticRepository eventStatisticRepository) {
        this.eventStatisticRepository = eventStatisticRepository;
    }
}
