/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.bytespace;

import java.io.Serializable;


/**
 *
 * @author raren
 */
public class Report implements Serializable {
    private Integer reportID;
    private String reportReason;
    private String reportTitle;
    private String reportBody;
    private Integer reportingUserID;

    public Report() {
        reportID = null;
        reportReason = null;
        reportTitle = null;
        reportBody = null;
        reportingUserID = null;
    }

    public Report(Integer reportID, String reportReason, String reportTitle, String reportBody, Integer reportingUserID) {
        this.reportID = reportID;
        this.reportReason = reportReason;
        this.reportTitle = reportTitle;
        this.reportBody = reportBody;
        this.reportingUserID = reportingUserID;
    }

    public Integer getReportID() {
        return reportID;
    }

    public void setReportID(Integer reportID) {
        this.reportID = reportID;
    }

    public String getReportReason() {
        return reportReason;
    }

    public void setReportReason(String reportReason) {
        this.reportReason = reportReason;
    }

    public String getReportTitle() {
        return reportTitle;
    }

    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle;
    }

    public String getReportBody() {
        return reportBody;
    }

    public void setReportBody(String reportBody) {
        this.reportBody = reportBody;
    }

    public Integer getReportingUserID() {
        return reportingUserID;
    }

    public void setReportingUserID(Integer reportingUserID) {
        this.reportingUserID = reportingUserID;
    }
    
    
}
