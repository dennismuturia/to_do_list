import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public class Task {
private boolean mCompleted;
private String mDescription;
private LocalDateTime mCreatedAt;
private static List<Task> instances = new ArrayList<Task>();
private int mId;

  public Task(String description) {
     mDescription = description;
     mCompleted = false;
     mCreatedAt = LocalDateTime.now();
     instances.add(this);
     mId = instances.size();
  }
  public String getDescription() {
    return mDescription;
  }
  public boolean isCompleted(){
    return mCompleted;
  }
  public LocalDateTime getCreatedAt(){
    return mCreatedAt;
  }
  public static List<Task> all(){
    return instances;
  }
  public static void clear() {
    instances.clear();
  }
  public int getId(){
    return mId;
  }
  public static Task find(int id) {
    return instances.get(id - 1);
  }
}
