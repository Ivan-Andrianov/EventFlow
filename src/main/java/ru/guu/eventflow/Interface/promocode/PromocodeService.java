package ru.guu.eventflow.Interface.promocode;

import ru.guu.eventflow.Promocode;

import java.util.UUID;

/**
 * API сервиса для работы с информацией о промокодах
 */
public interface PromocodeService {

    /**
     * Получить промокод по идентификатору
     *
     * @param id идентификатор промокода
     * @return промокод
     */
    Promocode getPromocodeById(UUID id);

    /**
     * Создать новый промокод
     *
     * @param promocode промокод
     */
    void create(Promocode promocode);
}
