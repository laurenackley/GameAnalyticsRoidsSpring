package com.braymatter.entities;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("player")
public class Player {
    @PrimaryKey
//    @Column("player_id")
    private int playerId;

//    @Column("player_ip")
    private String ip;

//    @Column("player_name")
    private String name;

    public Player() {}

    public Player(int playerId, String ip, String name) {
        this.playerId = playerId;
        this.ip = ip;
        this.name = name;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId=" + playerId +
                ", ip='" + ip + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
