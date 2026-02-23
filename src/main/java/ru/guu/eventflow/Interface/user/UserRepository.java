package ru.guu.eventflow.Interface.user;

import ru.guu.eventflow.User;

import java.util.UUID;

/**
 * API для работы с базой данных для сущности {@link User}
 */
public interface UserRepository {

    /**
     * Получить пользователя по идентификатору
     *
     * @param id идентификатор пользователя
     * @return мероприятие
     */
    User getUserById(UUID id);

    /**
     * Обновить информацию о пользователе
     *
     * @param user пользователь
     */
    void update(User user);

    /**
     * Сохранить пользователя в БД
     *
     * @param user пользователь
     */
    void create(User user);
}
