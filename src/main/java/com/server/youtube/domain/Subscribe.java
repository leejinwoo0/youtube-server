package com.server.youtube.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;

@Entity @Builder @Data @AllArgsConstructor @NoArgsConstructor
@DynamicInsert
public class Subscribe {

    @Id
    @Column(name ="sub_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int subCode;

    @Column
    private String id;

    @Column(name="channel_code")
    private int channelCode;
}
