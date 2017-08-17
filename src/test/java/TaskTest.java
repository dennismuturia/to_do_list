import org.junit.*;
import static org.junit.Assert.*;
import java.time.LocalDateTime;

public class TaskTest{

  @Test
  public void Task_InstantiatesCorrectly_True(){
    Task myTask = new Task("Mow the lawn");
    assertEquals(true, myTask instanceof Task);
  }
  @Test
  public void Task_instantiatesWithDescription_String() {
    Task myTask = new Task("Mow the lawn");
    assertEquals("Mow the lawn", myTask.getDescription());
  }

  @Test
  public void IsCompleted_afterInstatiation_false(){
    Task myTask = new Task("Mow the lawn");
    assertEquals(false, myTask.isCompleted());
  }

  @Test
  public void getCreatedAt_instantiatesWithCurrentTime_today() {
    Task myTask = new Task("Mow the lawn");
    assertEquals(LocalDateTime.now().getDayOfWeek(), myTask.getCreatedAt().getDayOfWeek());
    }

  @Test
  public void all_returnsAllInstances_True(){
    Task firstTask = new Task("Mow the lawn");
    Task secondTask = new Task("Buy me a car");
    assertEquals(true, Task.all().contains(firstTask));
    assertEquals(true, Task.all().contains(secondTask));
  }
  @Test
  public void clear_emptiesAllTasksFromArrayList_0() {
    Task myTask = new Task("Mow the lawn");
    Task.clear();
    assertEquals(Task.all().size(), 0);
  }

  @Test
  public void instantiatesWithAnId(){
    Task.clear();
    Task myTask = new Task("Mow the lawn");
    assertEquals(1, myTask.getId());
  }
  @Test
  public void find_returnsTaskWithSameId_secondTask() {
    Task firstTask = new Task("Mow the lawn");
    Task secondTask = new Task("Buy groceries");
    assertEquals(Task.find(secondTask.getId()), secondTask);
  }
}
