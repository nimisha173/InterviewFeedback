package com.UST.InterviewFeedback.entity;

import org.hibernate.procedure.spi.ParameterRegistrationImplementor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class InterviewFeedback {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userid;
    private String CandidateName;
    private String position;
    private String InterviewerName;
    private String InterviewerEmpid;
    private int rating;
    private String status;
    public InterviewFeedback(){}

    public InterviewFeedback(Long id, String userid, String candidateName, String position, String interviewerName, String interviewerEmpid, int rating, String status) {
        this.id = id;
        this.userid = userid;
        CandidateName = candidateName;
        this.position = position;
        InterviewerName = interviewerName;
        InterviewerEmpid = interviewerEmpid;
        this.rating = rating;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getUserid() {
        return userid;
    }

    public String getCandidateName() {
        return CandidateName;
    }

    public String getPosition() {
        return position;
    }

    public String getInterviewerName() {
        return InterviewerName;
    }

    public String getInterviewerEmpid() {
        return InterviewerEmpid;
    }

    public int getRating() {
        return rating;
    }

    public String getStatus() {
        return status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setCandidateName(String candidateName) {
        CandidateName = candidateName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setInterviewerName(String interviewerName) {
        InterviewerName = interviewerName;
    }

    public void setInterviewerEmpid(String interviewerEmpid) {
        InterviewerEmpid = interviewerEmpid;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
