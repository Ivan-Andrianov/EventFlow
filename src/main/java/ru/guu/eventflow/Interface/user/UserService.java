package ru.guu.eventflow.Interface.user;

import ru.guu.eventflow.User;
import ru.guu.eventflow.UserRole;

import java.util.UUID;

/**
 * API сервиса для работы с информацией о пользователях
 */
public interface UserService {

    /**
     * Создание пользователя
     *
     * @param user информация о пользователе
     */
    void createUser(User user);

    /**
     * Получить пользователя по идентификатору
     *
     * @param userId идентификатор пользователя
     */
    User getUser(UUID userId);

    /**
     * Проверить доступ пользователя к определенному ресурсу EventFlow
     *
     * @param userId идентификатор пользователя
     * @param url идентификатор ресурса
     * @return true, если доступ разрешен, иначе - false
     */
    boolean authorize(UUID userId, String url);

    /**
     * Изменить роль пользователя. Метод доступен только пользователю с ролью ORGANIZER.
     *
     * @param userId идентификатор пользователя
     * @param role роль пользователя
     */
    void changeUserRole(UUID userId, UserRole role);
}
