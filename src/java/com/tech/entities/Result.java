/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tech.entities;

/**
 *
 * @author DELL
 */
public class Result {
    private int rid;
    private int stuid;
    private int eid;
    private int tid;
    private int questionAttempted;
    private int rightAns;
    private int wrongAns;
    private int totalQue;

    public Result() {
    }

    public Result(int rid, int stuid, int eid, int tid, int questionAttempted, int rightAns, int wrongAns, int totalQue) {
        this.rid = rid;
        this.stuid = stuid;
        this.eid = eid;
        this.tid = tid;
        this.questionAttempted = questionAttempted;
        this.rightAns = rightAns;
        this.wrongAns = wrongAns;
        this.totalQue = totalQue;
    }

     
    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public int getTotalQue() {
        return totalQue;
    }

    public void setTotalQue(int totalQue) {
        this.totalQue = totalQue;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public int getStuid() {
        return stuid;
    }

    public void setStuid(int stuid) {
        this.stuid = stuid;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public int getQuestionAttempted() {
        return questionAttempted;
    }

    public void setQuestionAttempted(int questionAttempted) {
        this.questionAttempted = questionAttempted;
    }

    public int getRightAns() {
        return rightAns;
    }

    public void setRightAns(int rightAns) {
        this.rightAns = rightAns;
    }

    public int getWrongAns() {
        return wrongAns;
    }

    public void setWrongAns(int wrongAns) {
        this.wrongAns = wrongAns;
    }

    @Override
    public String toString() {
        return "Result{" + "rid=" + rid + ", stuid=" + stuid + ", tid=" + tid + ", questionAttempted=" + questionAttempted + ", rightAns=" + rightAns + ", wrongAns=" + wrongAns + '}';
    }
    
    
}
