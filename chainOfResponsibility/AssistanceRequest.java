package chainOfResponsibility;

public class AssistanceRequest {
    private String description;
    private int level;

    public AssistanceRequest(String description, int level) {
        this.description = description;
        this.level = level;
    }

    public String getDescription() {
        return description;
    }

    public int getLevel() {
        return level;
    }
}
