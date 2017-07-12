package io.github.imadness.ats.tasks;

import io.github.imadness.ats.Application;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

/**
 * Запланированная задача
 */
public class Task {
    private String name;
    private String description;
    private Calendar notificationTime;
    // TODO contacts;

    public Task() { }

    public Task(String name, String description, Date notificationTime) {
        this.name = name;
        this.description = description;
        this.notificationTime = GregorianCalendar.getInstance();
        this.notificationTime.setTime(notificationTime);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Calendar getNotificationTime() {
        return notificationTime;
    }

    public void setNotificationTime(Calendar notificationTime) {
        this.notificationTime = notificationTime;
    }

    public String toConsoleString() {
        return "\n[Задача " + name + "]\n" + description + "\n" + "Запланировано на " + Application.CONSOLE_DATE_FORMAT.format(notificationTime.getTime());
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", notificationTime=" + notificationTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Task)) {
            return false;
        }
        Task task = (Task) o;
        return Objects.equals(name, task.name) && Objects.equals(description, task.description) && Objects.equals(notificationTime, task.notificationTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, notificationTime);
    }
}
