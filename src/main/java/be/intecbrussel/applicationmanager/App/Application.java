package be.intecbrussel.applicationmanager.App;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Application {


    private Long id;
    private String date;
    private String job;
    private String company;
    private String location;
    private String solicited_through;
    private String link;
    private String comments;

    public Application() {
    }

    public Application(String date, String job, String company, String location, String solicited_through, String link, String comments) {
        this.date = date;
        this.job = job;
        this.company = company;
        this.location = location;
        this.solicited_through = solicited_through;
        this.link = link;
        this.comments = comments;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSolicited_through() {
        return solicited_through;
    }

    public void setSolicited_through(String solThrough) {
        this.solicited_through = solThrough;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Application{" +
                "id=" + id +
                ", date=" + date +
                ", job='" + job + '\'' +
                ", company='" + company + '\'' +
                ", Location='" + location + '\'' +
                ", SolThrough='" + solicited_through + '\'' +
                ", Link='" + link + '\'' +
                ", Comments='" + comments + '\'' +
                '}';
    }
}
