package ru.guu.eventflow.Interface.user;

import ru.guu.eventflow.User;
import ru.guu.eventflow.UserRole;

import java.util.UUID;

/**
 * Контроллер для обработки HTTP запросов связанных с пользователями
 */
public class UserController implements UserServiceApi {

    /**
     * Сервис для работы с пользователями
     */
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void registration(User user) {
        userService.createUser(user);
    }

    @Override
    public User getUser(UUID userId) {
        return userService.getUser(userId);
    }

    @Override
    public boolean authorize(UUID userId, String url) {
        return userService.authorize(userId, url);
    }

    @Override
    public void changeUserRole(UUID userId, UserRole role) {
        userService.changeUserRole(userId, role);
    }

    /**
     * Задать новую реализацию {@link UserService}
     *
     * @param userService реализация {@link UserService}
     */
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
