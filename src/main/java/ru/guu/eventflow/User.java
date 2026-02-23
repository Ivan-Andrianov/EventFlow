package ru.guu.eventflow;

import java.util.UUID;

/**
 * Пользователь системы EventFlow.
 */
public class User {

    /**
     * Идентификатор пользователя
     */
    private UUID id;

    /**
     * Имя пользователя
     */
    private String name;

    /**
     * Фамилия пользователя
     */
    private String lastname;

    /**
     * Возраст пользователя
     */
    private int age;

    /**
     * Роль пользователя
     */
    private UserRole role;

    public User(String name, String lastname, int age, UserRole role) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.role = role;
    }

    /**
     * Получить идентификатор пользователя
     *
     * @return идентификатор пользователя
     */
    public UUID getId() {
        return id;
    }

    /**
     * Получить имя пользователя
     *
     * @return имя пользователя
     */
    public String getName() {
        return name;
    }

    /**
     * Получить фамилию пользователя
     *
     * @return фамилия пользователя
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Изменить фамилию пользователя
     *
     * @param lastname новая фамилия пользователя
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Получить возраст пользователя
     *
     * @return возраст пользователя
     */
    public int getAge() {
        return age;
    }

    /**
     * Получить роль пользователя {@link UserRole}
     *
     * @return роль пользователя
     */
    public UserRole getRole() {
        return role;
    }

    /**
     * Изменить роль пользователя
     *
     * @param role новая роль пользователя
     */
    public void setRole(UserRole role) {
        this.role = role;
    }
}
