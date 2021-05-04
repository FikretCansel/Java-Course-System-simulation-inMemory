package Entity;
import java.util.Date;

public class Course implements Entity{
    String title;
    String description;
    Date startingDate;
    Date endDate;

    public Course(String title, String description, Date startingDate, Date endDate) {
        this.title = title;
        this.description = description;
        this.startingDate = startingDate;
        this.endDate = endDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
