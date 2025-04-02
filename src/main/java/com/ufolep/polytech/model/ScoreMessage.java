package com.ufolep.polytech.model;

public class ScoreMessage {
    private Long userId;
    private int points;

    public ScoreMessage() {}

    public ScoreMessage(Long userId, int points) {
        this.userId = userId;
        this.points = points;
    }

    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }
}
