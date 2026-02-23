package ru.guu.eventflow.Interface.promocode;

import ru.guu.eventflow.Promocode;

import java.util.UUID;

/**
 * REST API для работы с информацией о промокодах
 */
public interface PromocodeServiceApi {

    /**
     * Получить промокод по идентификатору. GET /ticket/promocode/{promocodeId}
     *
     * @param id идентификатор промокода
     * @return промокод
     */
    Promocode getPromocode(UUID id);

    /**
     * Создать новый промокод. POST /ticket/promocode
     *
     * @param promocode промокод
     */
    void create(Promocode promocode);
}
