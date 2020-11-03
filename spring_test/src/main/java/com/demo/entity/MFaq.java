package com.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class MFaq implements Serializable {
    private String id;

    private Date create_time;

    private Date update_time;

    private String faq_link_id;

    private String question;

    private Integer priority;

    private Integer hot;

    private Boolean app_display;

    private String create_user_id;

    private String update_user_id;

    private Boolean data_language;

    private Boolean del;

    private String answer;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public String getFaq_link_id() {
        return faq_link_id;
    }

    public void setFaq_link_id(String faq_link_id) {
        this.faq_link_id = faq_link_id == null ? null : faq_link_id.trim();
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getHot() {
        return hot;
    }

    public void setHot(Integer hot) {
        this.hot = hot;
    }

    public Boolean getApp_display() {
        return app_display;
    }

    public void setApp_display(Boolean app_display) {
        this.app_display = app_display;
    }

    public String getCreate_user_id() {
        return create_user_id;
    }

    public void setCreate_user_id(String create_user_id) {
        this.create_user_id = create_user_id == null ? null : create_user_id.trim();
    }

    public String getUpdate_user_id() {
        return update_user_id;
    }

    public void setUpdate_user_id(String update_user_id) {
        this.update_user_id = update_user_id == null ? null : update_user_id.trim();
    }

    public Boolean getData_language() {
        return data_language;
    }

    public void setData_language(Boolean data_language) {
        this.data_language = data_language;
    }

    public Boolean getDel() {
        return del;
    }

    public void setDel(Boolean del) {
        this.del = del;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", faq_link_id=").append(faq_link_id);
        sb.append(", question=").append(question);
        sb.append(", priority=").append(priority);
        sb.append(", hot=").append(hot);
        sb.append(", app_display=").append(app_display);
        sb.append(", create_user_id=").append(create_user_id);
        sb.append(", update_user_id=").append(update_user_id);
        sb.append(", data_language=").append(data_language);
        sb.append(", del=").append(del);
        sb.append(", answer=").append(answer);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}