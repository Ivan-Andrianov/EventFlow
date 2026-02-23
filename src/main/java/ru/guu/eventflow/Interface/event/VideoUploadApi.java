package ru.guu.eventflow.Interface.event;

import ru.guu.eventflow.Event;

/**
 * API для взаимодействия с внешними сервисами видеохостинга
 */
public interface VideoUploadApi {

    /**
     * Загрузить запись мероприятия на видеохостинг
     *
     * @param event мероприятие
     */
    void upload(Event event);
}
