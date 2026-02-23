package ru.guu.eventflow.Interface.event;

import ru.guu.eventflow.Event;

/**
 * Реализация {@link VideoUploadApi}
 */
public class YoutubeIntegrationService implements VideoUploadApi {

    // Зависит от HttpClient

    @Override
    public void upload(Event event) {
        // заглушка
    }
}
