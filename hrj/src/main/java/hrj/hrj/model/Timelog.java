package hrj.hrj.model;

import java.util.Date;

public class Timelog {
    private Integer id;

    private Date datadate;

    private String type;

    private Date starttime;

    private Date endtime;

    private Integer latest;

    private String username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDatadate() {
        return datadate;
    }

    public void setDatadate(Date datadate) {
        this.datadate = datadate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getLatest() {
        return latest;
    }

    public void setLatest(Integer latest) {
        this.latest = latest;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}