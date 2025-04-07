package com.example.taskmanager.model;

public class Assignment {
    private long id;
    private long subjectId;
    private String title;
    private String description;
    private String dueDate;
    private String priorityLevel;
    private String status;

    public Assignment(long id, long subjectId, String title, String description, String dueDate,
                      String priorityLevel, String status) {
        this.id = id;
        this.subjectId = subjectId;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.priorityLevel = priorityLevel;
        this.status = status;
    }

    public Assignment(long subjectId, String title, String description, String dueDate,
                      String priorityLevel, String status) {
        this.subjectId = subjectId;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.priorityLevel = priorityLevel;
        this.status = status;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public long getSubjectId() { return subjectId; }
    public void setSubjectId(long subjectId) { this.subjectId = subjectId; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getDueDate() { return dueDate; }
    public void setDueDate(String dueDate) { this.dueDate = dueDate; }
    public String getPriorityLevel() { return priorityLevel; }
    public void setPriorityLevel(String priorityLevel) { this.priorityLevel = priorityLevel; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}

