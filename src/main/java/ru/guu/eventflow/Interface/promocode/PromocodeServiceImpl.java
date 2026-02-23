package ru.guu.eventflow.Interface.promocode;

import ru.guu.eventflow.Promocode;

import java.util.UUID;

/**
 * Реализация {@link PromocodeService}
 */
public class PromocodeServiceImpl implements PromocodeService {

    /**
     * Репозиторий для работы с БД
     */
    private PromocodeRepository repository;

    public PromocodeServiceImpl(PromocodeRepository repository) {
        this.repository = repository;
    }

    @Override
    public Promocode getPromocodeById(UUID id) {
        return repository.getPromocodeById(id);
    }

    @Override
    public void create(Promocode promocode) {
        repository.create(promocode);
    }

    /**
     * Задать новую реализацию {@link PromocodeRepository}
     *
     * @param repository реализация {@link PromocodeRepository}
     */
    public void setRepository(PromocodeRepository repository) {
        this.repository = repository;
    }
}
