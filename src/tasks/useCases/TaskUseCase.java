package tasks.useCases;

import tasks.models.Task;
import java.util.List;
import java.util.ArrayList;

public class TaskUseCase {
    private final List<Task> tasks;

    public TaskUseCase(){
       this.tasks = new ArrayList<>();
    }

    //consultar todas las tareas
    public List<Task> all(){
        return this.tasks; // devuelve la lista de tareas
    }


    // consultar una tarea por indice
    public Task getByIndex(int index){
        return this.tasks.get(index);
    }

    //crear tarea
    public Task create(Task task){
        this.tasks.add(task);
        return task;
    }

    //Actualizar tarea
    public Task update(int index, Task update){
        Task task = new Task();
        for(int i = 0; i < this.tasks.size(); i++){
            if(i == index){
                this.tasks.set(i, update);
                task = update;
            }
        }
        return task;
    }
    //Eliminar tarea
    public void deleteById(int index){
        this.tasks.remove(index);
        
    }

}
