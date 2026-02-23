package ru.guu.eventflow.Interface.event;

import ru.guu.eventflow.Event;
import ru.guu.eventflow.EventTheme;

import java.util.UUID;

/**
 * Реализация {@link EventService}
 */
public class EventServiceImpl implements EventService {

    /**
     * Репозиторий для работы с БД
     */
    private EventRepository eventRepository;

    /**
     * API для загрузки записи на видеохостинг
     */
    private VideoUploadApi videoUploadApi;

    public EventServiceImpl(EventRepository eventRepository, VideoUploadApi videoUploadApi) {
        this.eventRepository = eventRepository;
        this.videoUploadApi = videoUploadApi;
    }

    @Override
    public void createEvent(Event event) {
        eventRepository.create(event);
    }

    @Override
    public EventTheme getEventTheme(UUID eventId) {
        return eventRepository.getEventById(eventId).getTheme();
    }

    @Override
    public void uploadEvent(Event event) {
        videoUploadApi.upload(event);
    }

    /**
     * Задать новую реализацию {@link EventRepository}
     *
     * @param eventRepository реализация {@link EventRepository}
     */
    public void setEventRepository(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    /**
     * Задать новую реализацию {@link VideoUploadApi}
     *
     * @param videoUploadApi реализация {@link VideoUploadApi}
     */
    public void setVideoUploadApi(VideoUploadApi videoUploadApi) {
        this.videoUploadApi = videoUploadApi;
    }
}
