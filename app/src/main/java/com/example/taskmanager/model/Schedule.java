package com.example.taskmanager.model;

public class Schedule {
    private long id;
    private long subjectId;
    private String title;
    private String description;
    private int dayOfWeek;
    private String startTime;
    private String endTime;
    private String location;
    private String repeatType;

    public Schedule(long id, long subjectId, String title, String description, int dayOfWeek,
                    String startTime, String endTime, String location, String repeatType) {
        this.id = id;
        this.subjectId = subjectId;
        this.title = title;
        this.description = description;
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
        this.location = location;
        this.repeatType = repeatType;
    }

    public Schedule(long subjectId, String title, String description, int dayOfWeek,
                    String startTime, String endTime, String location, String repeatType) {
        this.subjectId = subjectId;
        this.title = title;
        this.description = description;
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
        this.location = location;
        this.repeatType = repeatType;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public long getSubjectId() { return subjectId; }
    public void setSubjectId(long subjectId) { this.subjectId = subjectId; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public int getDayOfWeek() { return dayOfWeek; }
    public void setDayOfWeek(int dayOfWeek) { this.dayOfWeek = dayOfWeek; }
    public String getStartTime() { return startTime; }
    public void setStartTime(String startTime) { this.startTime = startTime; }
    public String getEndTime() { return endTime; }
    public void setEndTime(String endTime) { this.endTime = endTime; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
    public String getRepeatType() { return repeatType; }
    public void setRepeatType(String repeatType) { this.repeatType = repeatType; }
}

