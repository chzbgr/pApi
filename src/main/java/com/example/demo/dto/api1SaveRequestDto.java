package com.example.demo.dto;

import com.example.demo.store.tbo.domain.Apires1_Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class api1SaveRequestDto {

    private String STATE_Dt;
    private String STATE_Time;
    private String Load_time;
    private int totalCount;
    private int SEQ;
    private int Decide_Cnt;
    private int Clear_Cnt;
    private int Exam_Cnt;
    private int Death_Cnt;

    public Apires1_Entity toEntity(){
        return Apires1_Entity.builder()
                .STATE_Dt(STATE_Dt)
                .STATE_Time(STATE_Time)
                .Load_time(Load_time)
                .totalCount(totalCount)
                .SEQ(SEQ)
                .Decide_Cnt(Decide_Cnt)
                .Clear_Cnt(Clear_Cnt)
                .Exam_Cnt(Exam_Cnt)
                .Death_Cnt(Death_Cnt)
                .build();
        }
    }




