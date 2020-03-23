package com.kodilla.stream.portfolio;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Period;
import java.util.Collection;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class BoardTestSuite {

    public final static String IN_PROGRESS_STATUS = "In progress";

    public Board prepareTestData() {

        User user1 = new User("developer1", "John Smith");
        User user2 = new User("projectmanager1", "Nina White");
        User user3 = new User("developer2", "Emilia Stephanson");
        User user4 = new User("developer3", "Konrad Bridge");

        Task task1 = new Task("Microservice for taking temperature",
                "Write and test the microservice taking\n" +
                        "the temperaure from external service",
                user1,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(30));
        Task task2 = new Task("HQLs for analysis",
                "Prepare some HQL queries for analysis",
                user1,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().minusDays(5));
        Task task3 = new Task("Temperatures entity",
                "Prepare entity for temperatures",
                user3,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(15));
        Task task4 = new Task("Own logger",
                "Refactor company logger to meet our needs",
                user3,
                user2,
                LocalDate.now().minusDays(10),
                LocalDate.now().plusDays(25));
        Task task5 = new Task("Optimize searching",
                "Archive data searching has to be optimized",
                user4,
                user2,
                LocalDate.now(),
                LocalDate.now().plusDays(5));
        Task task6 = new Task("Use Streams",
                "use Streams rather than for-loops in predictions",
                user4,
                user2,
                LocalDate.now().minusDays(15),
                LocalDate.now().minusDays(2));

        TaskList taskListToDo = new TaskList("To do");
        taskListToDo.addTask(task1);
        taskListToDo.addTask(task3);
        TaskList taskListInProgress = new TaskList("In progress");
        taskListInProgress.addTask(task5);
        taskListInProgress.addTask(task4);
        taskListInProgress.addTask(task2);
        TaskList taskListDone = new TaskList("Done");
        taskListDone.addTask(task6);

        Board project = new Board("Project Weather Prediction");
        project.addTaskList(taskListToDo);
        project.addTaskList(taskListInProgress);
        project.addTaskList(taskListDone);
        return project;
    }

    @Test
    public void testAddTaskList() {
        //Given
        Board project = prepareTestData();
        //When

        //Then
        assertEquals(3, project.getTaskLists().size());
    }

    @Test
    public void testAddTaskListAverageWorkingOnTask() {
        //Given
        Board project = prepareTestData();
        //When


        Stream<TaskList> streamOfTaskList = project.getTaskLists().stream()
                .filter(taskListObj -> taskListObj.getName().equals(IN_PROGRESS_STATUS));


        List<List<Task>> a = project.getTaskLists().stream()
                .filter(taskListObj -> taskListObj.getName().equals(IN_PROGRESS_STATUS))
                .flatMap(taskListObj -> Stream.of(taskListObj.getTasks())).collect(Collectors.toList());


        Stream<Task> b = project.getTaskLists().stream()
                .filter(taskListObj -> taskListObj.getName().equals(IN_PROGRESS_STATUS))
                .flatMap(taskListObj -> Stream.of(taskListObj.getTasks()))
                .flatMap(Collection::stream);


        Stream<Period> c = project.getTaskLists().stream()
                .filter(taskListObj -> taskListObj.getName().equals(IN_PROGRESS_STATUS))
                .flatMap(taskListObj -> Stream.of(taskListObj.getTasks()))
                .flatMap(Collection::stream)
                .map(task -> Period.between(task.getCreated(), task.getDeadline()));

        Stream<Integer> d = project.getTaskLists().stream()
                .filter(taskListObj -> taskListObj.getName().equals(IN_PROGRESS_STATUS))
                .flatMap(taskListObj -> Stream.of(taskListObj.getTasks()))
                .flatMap(Collection::stream)
                .map(task -> Period.between(task.getCreated(), task.getDeadline()))
                .map(Period::getDays);


        OptionalDouble averageDays = project.getTaskLists().stream()
                .filter(taskListObj -> taskListObj.getName().equals(IN_PROGRESS_STATUS))
                .flatMap(taskListObj -> Stream.of(taskListObj.getTasks()))
                .flatMap(Collection::stream)
                .map(task -> Period.between(task.getCreated(), LocalDate.now()))//task.getDeadline()
                .map(Period::getDays)
                .mapToDouble(dayNumber -> dayNumber)
                .average();

        //Then
        assertEquals(10.0, averageDays.getAsDouble(), 0.1);
    }
}
