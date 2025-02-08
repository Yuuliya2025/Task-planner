package Todo;

public class Meeting extends Task{
    private String topic;
    private String project;
    private String start;

    public Meeting(int id) {
        super(id);
    }

    public Meeting(int id, String topic, String project, String start) {
        super(id);
        this.topic = topic;
        this.project = project;
        this.start = start;

    }

    public String getProject() {
        return project;
    }

    public String getStart() {
        return start;
    }

    public String getTopic() {
        return topic;
    }
    @Override
    public boolean matches(String query) {
        if (topic. contains(query)) {
            return true;

        }
        else if (project.contains(query)) {
            return true;
        } else {
            return false;
        }

    }

}

