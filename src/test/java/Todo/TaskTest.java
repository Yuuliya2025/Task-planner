package Todo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskTest {
    @Test
    public void testSimpleMatches() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Позвонить");
        Assertions.assertTrue(actual);
    }

    @Test
    public void testSimpleNotMatches() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Написать");
        Assertions.assertFalse(actual);
    }

    @Test
    public void testEpicMatches() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Яйца");
        Assertions.assertTrue(actual);
    }

    @Test
    public void testEpicNotMatches() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Колбаса");
        Assertions.assertFalse(actual);

    }

    @Test
    void testMatchesByTopic() {
        Meeting meeting = new Meeting(555, "Выкатка 3й версии приложения", "Приложение НетоБанка", "Во вторник после обеда");

        Assertions.assertTrue(meeting.matches("Выкатка"));
    }

    // Проверка метода matches() при совпадении по проекту
    @Test
    void testMatchesByProject() {
        Meeting meeting = new Meeting(555, "Выкатка 3й версии приложения", "Приложение НетоБанка", "Во вторник после обеда");

        Assertions.assertTrue(meeting.matches("Приложение"));
    }



        @Test
        void testNoMatch() {
            Meeting meeting = new Meeting(555, "Выкатка 3й версии приложения", "Приложение НетоБанка", "Во вторник после обеда");

            Assertions.assertFalse(meeting.matches("Расходы"));

        }

    }






