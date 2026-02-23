package ru.guu.eventflow.Interface.ticket;

import ru.guu.eventflow.Promocode;
import ru.guu.eventflow.Ticket;

import java.util.UUID;

/**
 * Реализация {@link TicketServiceApi}
 */
public class TicketController implements TicketServiceApi {

    /**
     * Сервис для работы с билетами
     */
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @Override
    public void create(Ticket ticket) {
        ticketService.create(ticket);
    }

    @Override
    public Ticket getTicketById(UUID id) {
        return ticketService.getTicketById(id);
    }

    @Override
    public void create(int limit, Ticket ticket) {
        ticketService.create(limit, ticket);
    }

    @Override
    public void upPrice(UUID ticketId, int price) {
        ticketService.upPrice(ticketId, price);
    }

    @Override
    public void buy(UUID ticketId, Promocode promocode) {
        ticketService.buy(ticketId, promocode);
    }

    /**
     * Задать новую реализацию {@link TicketService}
     *
     * @param ticketService реализация TicketService
     */
    public void setTicketService(TicketService ticketService) {
        this.ticketService = ticketService;
    }
}
