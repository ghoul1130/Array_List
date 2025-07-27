import java.util.ArrayList;

class TaskTracker {
    private ArrayList<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        long start = System.nanoTime();
        tasks.add(task); // O(1)
        long end = System.nanoTime();
        System.out.println("Add Task - Time: "+ task +" " + (end - start) + " ns, Complexity: O(1)");
        System.out.println();
    }

    public void completeTask(String task) {
        long start = System.nanoTime();
        int index = tasks.indexOf(task); // O(n)
        if (index != -1) {
            tasks.set(index, task + " (Done)");
        }
        long end = System.nanoTime();
        System.out.println("Mark Task Completed - Time: " + (end - start) + " ns, Complexity: O(n)");
    }

    public void removeTask(String task) {
        long start = System.nanoTime();
        tasks.remove(task); // O(n)
        long end = System.nanoTime();
        System.out.println("Remove Task - Time: " + (end - start) + " ns, Complexity: O(n)");
    }

    public void displayTasks() {
        long start = System.nanoTime();
        for (String task : tasks) {
            System.out.println(task); // O(n)
        }
        long end = System.nanoTime();
        System.out.println("Display Tasks - Time: " + (end - start) + " ns, Complexity: O(n)");
    }
}

public class toDoList {
    public static void main(String[] args) {
        TaskTracker tracker = new TaskTracker();

        tracker.addTask("Buy groceries");
        tracker.addTask("Read a book");

        tracker.completeTask("Buy groceries");
        tracker.displayTasks();

        tracker.removeTask("Read a book");
        tracker.displayTasks();
    }
}

---OUTPUT---
Add Task - Time: Buy groceries 2800 ns, Complexity: O(1)
Add Task - Time: Read a book 1100 ns, Complexity: O(1)

Mark Task Completed - Time: 995000 ns, Complexity: O(n)
    
Buy groceries (Done)
Read a book   
Display Tasks - Time: 51200 ns, Complexity: O(n)
    
Remove Task - Time: 3500 ns, Complexity: O(n)
    
Buy groceries (Done)
Display Tasks - Time: 44400 ns, Complexity: O(n)
