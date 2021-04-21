package com.example.demo.store.tbo.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity

public class Apires1_Entity {

    @Id
    @GeneratedValue
    private String STATE_Dt;
    private String STATE_Time;
    private String Load_time;

    @Column(length=500, nullable=false)
    private int totalCount;

    @Column
    private int SEQ;

    @Column
    private int Decide_Cnt;

    @Column
    private int Clear_Cnt;

    @Column
    private int Exam_Cnt;

    @Column
    private int Death_Cnt;


    @Builder
    public Apires1_Entity(String STATE_Dt, String STATE_Time, String Load_time, int totalCount, int SEQ, int Decide_Cnt, int Clear_Cnt
    , int Exam_Cnt, int Death_Cnt){
        this.STATE_Dt=STATE_Dt;
        this.STATE_Time=STATE_Time;
        this.Load_time=Load_time;
        this.totalCount=totalCount;
        this.SEQ=SEQ;
        this.Decide_Cnt=Decide_Cnt;
        this.Clear_Cnt=Clear_Cnt;
        this.Exam_Cnt=Exam_Cnt;
        this.Death_Cnt=Death_Cnt;

    }


}
