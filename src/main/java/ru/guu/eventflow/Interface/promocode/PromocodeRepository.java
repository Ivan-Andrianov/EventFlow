package ru.guu.eventflow.Interface.promocode;


import ru.guu.eventflow.Promocode;

import java.util.UUID;

/**
 * API для работы с базой данных для сущности {@link Promocode}
 */
public interface PromocodeRepository {

    /**
     * Получить промокод по идентификатору
     *
     * @param id идентификатор промокода
     * @return промокод
     */
    Promocode getPromocodeById(UUID id);

    /**
     * Сохранить промокод в БД
     *
     * @param promocode промокод
     */
    void create(Promocode promocode);
}