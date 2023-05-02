import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.TaskPlanner.Epic;
import ru.netology.TaskPlanner.Meetings;
import ru.netology.TaskPlanner.SimpleTask;

public class TasksTest {
    @Test
    public void shouldFindTasksOnQueryInSimpleTask() {
        SimpleTask simpleTask = new SimpleTask(6, "Встреча");
        Boolean actual = simpleTask.matches("Встреча");
        Boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindTasksOnQueryInSimpleTaskIfQueryFalse() {
        SimpleTask simpleTask = new SimpleTask(6, "Встреча");
        Boolean actual = simpleTask.matches("Ужин в ресторане");
        Boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindTasksOnQueryInMeetings() {
        Meetings meetings = new Meetings(200, "Переговоры", "Покупка ПО", "В четверг в одиннадцать часов");
        Boolean actual = meetings.matches("Переговоры");
        Boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindTasksOnQueryInMeetingsIfQueryFalse() {
        Meetings meetings = new Meetings(200, "Переговоры", "Покупка ПО", "В четверг в одиннадцать часов");
        Boolean actual = meetings.matches("Обсуждение вопросов");
        Boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindTasksOnQueryInMeetings2() {
        Meetings meetings = new Meetings(200, "Переговоры", "Покупка ПО", "В четверг в одиннадцать часов");
        Boolean actual = meetings.matches("Покупка ПО");
        Boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldFindTasksOnQueryInEpic() {
        String[] subtasks = {"Хлеб", "Сахар", "Соль"};
        Epic epic = new Epic(10, subtasks);
        Boolean actual = epic.matches("Сахар");
        Boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindTasksOnQueryInEpicIfQueryFalse() {
        String[] subtasks = {"Хлеб", "Сахар", "Соль"};
        Epic epic = new Epic(10, subtasks);
        Boolean actual = epic.matches("Мясо");
        Boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

}
