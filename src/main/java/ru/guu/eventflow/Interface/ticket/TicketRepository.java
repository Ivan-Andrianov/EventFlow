package ru.guu.eventflow.Interface.ticket;

import ru.guu.eventflow.Ticket;

import java.util.UUID;

/**
 * API для работы с базой данных для сущности {@link Ticket}
 */
public interface TicketRepository {

    /**
     * Получить билет по идентификатору
     *
     * @param id идентификатор билета
     * @return билет
     */
    Ticket getTicketById(UUID id);

    /**
     * Обновить информацию о билете
     *
     * @param ticket билет
     */
    void update(Ticket ticket);

    /**
     * Сохранить билет в БД
     *
     * @param ticket билет
     */
    void create(Ticket ticket);
}