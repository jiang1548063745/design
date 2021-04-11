package com.rorschach.pattern.builder.inner;

import java.util.Date;

/**
 * @author Rorschach
 * @date 2021-4-10 23:23
 */
public class Project {

    private String projectName;

    private Date projectDate;

    private String projectDuty;

    private Project(ProjectBuilder builder) {
        this.projectName = builder.projectName;
        this.projectDate = builder.projectDate;
        this.projectDuty = builder.projectDuty;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Date getProjectDate() {
        return projectDate;
    }

    public void setProjectDate(Date projectDate) {
        this.projectDate = projectDate;
    }

    public String getProjectDuty() {
        return projectDuty;
    }

    public void setProjectDuty(String projectDuty) {
        this.projectDuty = projectDuty;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectName='" + projectName + '\'' +
                ", projectDate=" + projectDate +
                ", projectDuty='" + projectDuty + '\'' +
                '}';
    }

    public static ProjectBuilder builder() {
        return new ProjectBuilder();
    }

    static class ProjectBuilder {

        private String projectName;

        private Date projectDate;

        private String projectDuty;

        public ProjectBuilder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        public ProjectBuilder projectDate(Date projectDate) {
            this.projectDate = projectDate;
            return this;
        }

        public ProjectBuilder projectDuty(String projectDuty) {
            this.projectDuty = projectDuty;
            return this;
        }

        public Project build() {
            return new Project(this);
        }
    }
}
