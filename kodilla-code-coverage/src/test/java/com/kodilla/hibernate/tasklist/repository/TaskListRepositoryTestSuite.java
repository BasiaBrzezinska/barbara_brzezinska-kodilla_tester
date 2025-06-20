package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TaskListRepositoryTestSuite {

    @Autowired
    private TaskListRepository taskListRepository;

    private static final String DESCRIPTION = "TEST: Homework Task 15.4";

    @Test
    void testFindByListName(){
        //Given
        TaskList taskList = new TaskList("homework", DESCRIPTION);
        taskListRepository.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readTask = taskListRepository.findByListName(listName);

        //Then
        Assertions.assertEquals(1, readTask.size());
        Assertions.assertEquals("homework", readTask.get(0).getListName());
        Assertions.assertEquals(DESCRIPTION, readTask.get(0).getDescription());

        //CleanUp
        int id = readTask.get(0).getId();
        taskListRepository.deleteById(id);
    }
}
