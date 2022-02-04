public class Task {
    private String description;
    private boolean isDone;
    private char type;
    private String time;

    public Task(String description, boolean isDone, char type, String time) {
        this.description = description;
        this.isDone = isDone;
        this.type = Character.toUpperCase(type);
        this.time = time;
    }

    public void setIsDone(boolean isDone) {
        this.isDone = isDone;
    }

    @Override
    public String toString() {
        String mark = (isDone ? "X" : " ");
        if (type == 'D') {
            return " [" + type + "][" + mark + "] " + description + "(by: " + time + ")";
        } else if (type == 'E') {
            return " [" + type + "][" + mark + "] " + description + "(at: " + time + ")";
        } else {
            return " [" + type + "][" + mark + "] " + description;
        }
    }

}