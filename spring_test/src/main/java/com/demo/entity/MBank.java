package com.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class MBank implements Serializable {
    private String id;

    private Date create_time;

    private Date update_time;

    private String bank_code;

    private String bank_name;

    private String remark;

    private Boolean del;

    private Boolean app_display;

    private String create_user_id;

    private String update_user_id;

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

    public String getBank_code() {
        return bank_code;
    }

    public void setBank_code(String bank_code) {
        this.bank_code = bank_code == null ? null : bank_code.trim();
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name == null ? null : bank_name.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Boolean getDel() {
        return del;
    }

    public void setDel(Boolean del) {
        this.del = del;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", bank_code=").append(bank_code);
        sb.append(", bank_name=").append(bank_name);
        sb.append(", remark=").append(remark);
        sb.append(", del=").append(del);
        sb.append(", app_display=").append(app_display);
        sb.append(", create_user_id=").append(create_user_id);
        sb.append(", update_user_id=").append(update_user_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}