package org.seckill.entity;

import java.util.Date;

public class SuccessKilled {
    private long seckillId;
    private long userPnone;
    private short state;
    private Date createTime;

    private Seckill seckill;

    public Seckill getSeckill() {
        return seckill;
    }

    public void setSeckill(Seckill seckill) {
        this.seckill = seckill;
    }

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public long getUserPnone() {
        return userPnone;
    }

    public void setUserPnone(long userPnone) {
        this.userPnone = userPnone;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "SuccessKilled{" +
                "seckillId=" + seckillId +
                ", userPnone=" + userPnone +
                ", state=" + state +
                ", createTime=" + createTime +
                '}';
    }
}
