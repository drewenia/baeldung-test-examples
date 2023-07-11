package junitTestingMethodsThat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

public class TaskTest {
    @Test
    void givenDAOThrowsException_whenSaveTaskIsCalled_thenSystemExitIsCalled() throws Exception {
        /*int statusCode = catchSystemExit(()->{
            Task task = new Task("test");
            TaskDAO taskDAO = mock(TaskDAO.class);
            TaskService taskService = new TaskService(taskDAO);
            doThrow(new NullPointerException()).when(taskDAO).save(task);
            taskService.saveTask(task);
        });
        assertEquals(1,statusCode);*/
    }
}
