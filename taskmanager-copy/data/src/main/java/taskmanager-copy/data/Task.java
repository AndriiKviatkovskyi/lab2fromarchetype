package taskmanager-copy.data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Task {
    private String name;
    private LocalDateTime deadline;
    private boolean completed;

    public Task(String name, LocalDateTime deadline) {
        this.name = name;
        this.deadline = deadline;
        this.completed = false;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}