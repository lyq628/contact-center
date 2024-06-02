package org.voice9.cc.fs.event.base;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.voice9.cc.fs.esl.internal.Context;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by caoliang on 2020/8/29
 */
public class FsBaseEvent {

    @JSONField(name = "Event-Name")
    protected String eventName;

    @JsonIgnore
    protected Context context;

    @JSONField(name = "Core-UUID")
    protected String coreUuid;

    /**
     * Unique-ID 字段代表了一个特定通话的唯一标识符。这个标识符在通话的整个生命周期内都是唯一的，从通话建立开始直到通话结束
     * Unique-ID 的主要用途包括：
     *
     * 跟踪和管理通话：通过 Unique-ID，系统管理员和开发者可以精确地跟踪和管理单个通话。这对于调试、监控通话状态、生成话单等都非常有用。
     *
     * 通话控制：在需要对通话进行操作（如挂断、转接、修改通话属性等）时，Unique-ID 用于指定要控制的通话。
     *
     * 事件关联：在 FreeSWITCH 中，所有与特定通话相关的事件（如 CHANNEL_CREATE、CHANNEL_ANSWER、CHANNEL_HANGUP 等）都会包含相同的 Unique-ID。这使得开发者可以轻松地将事件与特定的通话关联起来。
     */
    @JSONField(name = "Unique-ID")
    protected String deviceId;

    @JSONField(name = "Event-Date-Timestamp")
    protected Long timestamp;

    @JSONField(name = "Answer-State")
    private String answerState;

    @JSONField(name = "Caller-Channel-Name")
    protected String channelName;

    protected String localAddress;

    protected String remoteAddress;

    @JSONField(name = "variable_sofia_profile_name")
    protected String profile;

    @JSONField(name = "Call-Direction")
    protected String direction;

    protected Map<String, String> map = new HashMap<>();

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public String getCoreUuid() {
        return coreUuid;
    }

    public void setCoreUuid(String coreUuid) {
        this.coreUuid = coreUuid;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getAnswerState() {
        return answerState;
    }

    public void setAnswerState(String answerState) {
        this.answerState = answerState;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getLocalAddress() {
        return localAddress;
    }

    public void setLocalAddress(String localAddress) {
        this.localAddress = localAddress;
    }

    public String getRemoteAddress() {
        return remoteAddress;
    }

    public void setRemoteAddress(String remoteAddress) {
        this.remoteAddress = remoteAddress;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "BaseEvent{" +
                "eventName='" + eventName + '\'' +
                ", context=" + context +
                ", coreUuid='" + coreUuid + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", timestamp=" + timestamp +
                ", answerState='" + answerState + '\'' +
                ", channelName='" + channelName + '\'' +
                ", remoteAddress='" + remoteAddress + '\'' +
                ", map=" + map +
                '}';
    }
}
