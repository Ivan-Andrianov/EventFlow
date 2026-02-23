package ru.guu.eventflow.Interface.ticket;

import ru.guu.eventflow.Promocode;
import ru.guu.eventflow.Ticket;

import java.util.UUID;

/**
 * Реализация {@link TicketService}
 */
public class TicketServiceImpl implements TicketService {

    /**
     * Репозиторий для работы с БД
     */
    private TicketRepository repository;

    public TicketServiceImpl(TicketRepository repository) {
        this.repository = repository;
    }

    @Override
    public void create(Ticket ticket) {
        repository.create(ticket);
    }

    @Override
    public Ticket getTicketById(UUID id) {
        return repository.getTicketById(id);
    }

    @Override
    public void create(int limit, Ticket ticket) {
        // Заглушка
    }

    @Override
    public void upPrice(UUID ticketId, int price) {
        // заглушка
    }

    @Override
    public void buy(UUID ticketId, Promocode promocode) {
        // Заглушка
    }

    /**
     * Задать новую реализацию {@link TicketRepository}
     *
     * @param repository реализация TicketRepository
     */
    public void setRepository(TicketRepository repository) {
        this.repository = repository;
    }
}
