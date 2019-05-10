package com.macro.mall.model;

import java.io.Serializable;
import java.util.Date;

public class ScheduleJobLog implements Serializable {
    /**
     * 任务日志id
     *
     * @mbggenerated
     */
    private Long logId;

    /**
     * 任务id
     *
     * @mbggenerated
     */
    private Long jobId;

    /**
     * spring bean名称
     *
     * @mbggenerated
     */
    private String beanName;

    /**
     * 方法名
     *
     * @mbggenerated
     */
    private String methodName;

    /**
     * 参数
     *
     * @mbggenerated
     */
    private String params;

    /**
     * 任务状态    0：成功    1：失败
     *
     * @mbggenerated
     */
    private Byte status;

    /**
     * 失败信息
     *
     * @mbggenerated
     */
    private String error;

    /**
     * 耗时(单位：毫秒)
     *
     * @mbggenerated
     */
    private Integer times;

    /**
     * 创建时间
     *
     * @mbggenerated
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Long getLogId() {
        return logId;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", logId=").append(logId);
        sb.append(", jobId=").append(jobId);
        sb.append(", beanName=").append(beanName);
        sb.append(", methodName=").append(methodName);
        sb.append(", params=").append(params);
        sb.append(", status=").append(status);
        sb.append(", error=").append(error);
        sb.append(", times=").append(times);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}