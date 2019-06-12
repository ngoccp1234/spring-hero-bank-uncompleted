package entity;

import java.sql.Date;

public class TransfersTransaction {
    private String id;
    private String senderId;
    private String receiveId;
    private int amount;
    private String message;
    private Date createAt;
    private Date updateAt;
    private int status;

    public TransfersTransaction() {
    }

    public TransfersTransaction(String id, String senderId, String receiveId, int amount, String message, Date createAt, Date updateAt, int status) {
        this.id = id;
        this.senderId = senderId;
        this.receiveId = receiveId;
        this.amount = amount;
        this.message = message;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(String receiveId) {
        this.receiveId = receiveId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
