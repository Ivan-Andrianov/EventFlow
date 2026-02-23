package ru.guu.eventflow.Interface.ticket;

import ru.guu.eventflow.Promocode;
import ru.guu.eventflow.Ticket;

import java.util.UUID;

/**
 * REST API для работы с информацией о билетах
 */
public interface TicketServiceApi {

    /**
     * Создать новый билет. POST /ticket
     *
     * @param ticket билет
     */
    void create(Ticket ticket);

    /**
     * Получить билет по идентификатору. GET /ticket/{ticketId}
     *
     * @param id идентификатор билета
     * @return билет
     */
    Ticket getTicketById(UUID id);

    /**
     * Создать указанное количество билетов. Метод доступен только пользователю с ролью Organizer. POST /ticket
     *
     * @param limit   максимальное количество билетов
     * @param ticket шаблон билета
     */
    void create(int limit, Ticket ticket);

    /**
     * Изменить цену билета. PATCH /ticket
     *
     * @param ticketId идентификатор билета
     * @param price цена билета
     */
    void upPrice(UUID ticketId, int price);

    /**
     * Купить билет с активированием промокода. POST /ticket/buy/{ticketId}
     *
     * @param ticketId идентификатор билета
     * @param promocode промокод
     */
    void buy(UUID ticketId, Promocode promocode);
}
