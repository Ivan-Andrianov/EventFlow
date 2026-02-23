package ru.guu.eventflow.Interface.user;

import ru.guu.eventflow.User;
import ru.guu.eventflow.UserRole;

import java.util.UUID;

/**
 * REST API для работы с информацией о пользователях
 */
public interface UserServiceApi {

    /**
     * Создание пользователя POST /user
     *
     * @param user информация о пользователе
     */
    void registration(User user);

    /**
     * Получить пользователя по идентификатору GET /user/{userId}
     *
     * @param userId идентификатор пользователя
     */
    User getUser(UUID userId);

    /**
     * Проверить доступ пользователя к определенному ресурсу EventFlow POST /user/authorize/{userId}/{url}
     *
     * @param userId идентификатор пользователя
     * @param url идентификатор ресурса
     * @return true, если доступ разрешен, иначе - false
     */
    boolean authorize(UUID userId, String url);

    /**
     * Изменить роль пользователя. Метод доступен только пользователю с ролью ORGANIZER. PATCH /user
     *
     * @param userId идентификатор пользователя
     * @param role роль пользователя
     */
    void changeUserRole(UUID userId, UserRole role);
}
