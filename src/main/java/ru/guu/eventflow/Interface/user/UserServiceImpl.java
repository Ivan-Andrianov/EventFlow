package ru.guu.eventflow.Interface.user;

import ru.guu.eventflow.User;
import ru.guu.eventflow.UserRole;

import java.util.UUID;

/**
 * Реализация {@link UserService}
 */
public class UserServiceImpl implements UserService {

    /**
     * Репозиторий для работы с БД
     */
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void createUser(User user) {
        userRepository.create(user);
    }

    @Override
    public User getUser(UUID userId) {
        return userRepository.getUserById(userId);
    }

    @Override
    public boolean authorize(UUID userId, String url) {
        // Заглушка
        return false;
    }

    @Override
    public void changeUserRole(UUID userId, UserRole role) {
        // Заглушка
    }

    /**
     * Задать новую реализацию {@link UserRepository}
     *
     * @param userRepository реализация {@link UserRepository}
     */
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
