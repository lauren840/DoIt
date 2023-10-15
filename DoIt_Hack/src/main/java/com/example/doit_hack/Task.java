public class Task extends Main {

    private String description;
    private boolean done; 

    public Task(String description, boolean done) {
        this.description = description;
        this.done = done; 
    }

    public Task() {
      
    }

    public String getDescription() {
        return description; 
    }

    public boolean getDone() {
        return done; 
    }

    public void setDescription(String description) {
        this.description = description; 
    }

    public void setDone(boolean done) {
        this.done = done; 
    }

    public String toString() {
        String str = "Description: " + description + " \nIs done? " + done; 
        return str;
    }
}
