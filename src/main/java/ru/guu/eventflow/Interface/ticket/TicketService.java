package ru.guu.eventflow.Interface.ticket;

import ru.guu.eventflow.Promocode;
import ru.guu.eventflow.Ticket;

import java.util.UUID;

/**
 * API сервиса для работы с информацией о билетах
 */
public interface TicketService {

    /**
     * Создать новый билет
     *
     * @param ticket билет
     */
    void create(Ticket ticket);

    /**
     * Получить билет по идентификатору
     *
     * @param id идентификатор билета
     * @return билет
     */
    Ticket getTicketById(UUID id);

    /**
     * Создать указанное количество билетов. Метод доступен только пользователю с ролью Organizer.
     *
     * @param limit   максимальное количество билетов
     * @param ticket шаблон билета
     */
    void create(int limit, Ticket ticket);

    /**
     * Изменить цену билета
     *
     * @param ticketId идентификатор билета
     * @param price цена билета
     */
    void upPrice(UUID ticketId, int price);

    /**
     * Купить билет с активированием промокода.
     *
     * @param ticketId идентификатор билета
     * @param promocode промокод
     */
    void buy(UUID ticketId, Promocode promocode);
}
