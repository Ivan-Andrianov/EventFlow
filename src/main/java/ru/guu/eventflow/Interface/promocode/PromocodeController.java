package ru.guu.eventflow.Interface.promocode;

import ru.guu.eventflow.Promocode;

import java.util.UUID;

/**
 * Реализация {@link PromocodeServiceApi}
 */
public class PromocodeController implements PromocodeServiceApi {

    /**
     * Сервис для работы с промокодами
     */
    private PromocodeService promocodeService;

    @Override
    public Promocode getPromocode(UUID id) {
        return promocodeService.getPromocodeById(id);
    }

    @Override
    public void create(Promocode promocode) {
        promocodeService.create(promocode);
    }

    /**
     * Задать новую реализацию {@link PromocodeService}
     *
     * @param promocodeService реализация {@link PromocodeService}
     */
    public void setPromocodeService(PromocodeService promocodeService) {
        this.promocodeService = promocodeService;
    }
}
