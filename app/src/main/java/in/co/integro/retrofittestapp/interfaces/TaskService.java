package in.co.integro.retrofittestapp.interfaces;

import java.util.List;

import in.co.integro.retrofittestapp.models.Task;
import retrofit.http.GET;
import retrofit.http.Path;

public interface TaskService {

    @GET("/tasks/{id}/subtasks")
    List<Task> listSubTasks(@Path("id") String taskId);

}
