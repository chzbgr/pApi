package com.example.demo.dto;

import com.example.demo.store.tbo.Res5Entity;

public class Res5 {
    private boolean resultSave;
    private String loadTime;
    private String S_1QT_FIR_SUB;
    private String S_1QT_FIR_INC;
    private String S_1QT_FIR_RATE;
    private String S_1QT_SCD_SUB;
    private String S_1QT_SCD_INC;
    private String S_1QT_SCD_RATE;
    private String S_2QT_FIR_SUB;
    private String S_2QT_FIR_INC;
    private String S_2QT_FIR_RATE;
    private String S_2QT_SCD_SUB;
    private String S_2QT_SCD_INC;
    private String S_2QT_SCD_RATE;
    private String S_3QT_FIR_SUB;
    private String S_3QT_FIR_INC;
    private String S_3QT_FIR_RATE;
    private String S_3QT_SCD_SUB;
    private String S_3QT_SCD_INC;
    private String S_3QT_SCD_RATE;
    private String S_4QT_FIR_SUB;
    private String S_4QT_FIR_INC;
    private String S_4QT_FIR_RATE;
    private String S_4QT_SCD_SUB;
    private String S_4QT_SCD_INC;
    private String S_4QT_SCD_RATE;
    private String S_VC_DT;
    private String REG_DT;
    private String S_1QT_FIR_ADD;
    private String S_1QT_SCD_ADD;
    private String S_2QT_FIR_ADD;
    private String S_2QT_SCD_ADD;
    private String S_3QT_FIR_ADD;
    private String S_3QT_SCD_ADD;
    private String S_4QT_FIR_ADD;
    private String S_4QT_SCD_ADD;
    private String WORK_DTTM;


    public Res5Entity toEntity() {
        return Res5Entity.builder()
                .loadtime(loadTime)
                .S_VC_DT(S_VC_DT)
                .REG_DT(REG_DT)
                .WORK_DTTM(WORK_DTTM)
                .S_1QT_FIR_SUB(S_1QT_FIR_SUB)
                .S_1QT_FIR_INC(S_1QT_FIR_INC)
                .S_1QT_FIR_RATE(S_1QT_FIR_RATE)
                .S_1QT_SCD_SUB(S_1QT_SCD_SUB)
                .S_1QT_SCD_INC(S_1QT_SCD_INC)
                .S_1QT_SCD_RATE(S_1QT_SCD_RATE)
                .S_2QT_FIR_SUB(S_2QT_FIR_SUB)
                .S_2QT_FIR_INC(S_2QT_FIR_INC)
                .S_2QT_FIR_RATE(S_2QT_FIR_RATE)
                .S_2QT_SCD_SUB(S_2QT_SCD_SUB)
                .S_2QT_SCD_INC(S_2QT_SCD_INC)
                .S_2QT_SCD_RATE(S_2QT_SCD_RATE)
                .S_3QT_FIR_SUB(S_3QT_FIR_SUB)
                .S_3QT_FIR_INC(S_3QT_FIR_INC)
                .S_3QT_FIR_RATE(S_3QT_FIR_RATE)
                .S_3QT_SCD_SUB(S_3QT_SCD_SUB)
                .S_3QT_SCD_INC(S_3QT_SCD_INC)
                .S_3QT_SCD_RATE(S_3QT_SCD_RATE)
                .S_4QT_FIR_SUB(S_4QT_FIR_SUB)
                .S_4QT_FIR_INC(S_4QT_FIR_INC)
                .S_4QT_FIR_RATE(S_4QT_FIR_RATE)
                .S_4QT_SCD_SUB(S_4QT_SCD_SUB)
                .S_4QT_SCD_INC(S_4QT_SCD_INC)
                .S_4QT_SCD_RATE(S_4QT_SCD_RATE)
                .S_1QT_FIR_ADD(S_1QT_FIR_ADD)
                .S_1QT_SCD_ADD(S_1QT_SCD_ADD)
                .S_2QT_FIR_ADD(S_2QT_FIR_ADD)
                .S_2QT_SCD_ADD(S_2QT_SCD_ADD)
                .S_3QT_FIR_ADD(S_3QT_FIR_ADD)
                .S_3QT_SCD_ADD(S_3QT_SCD_ADD)
                .S_4QT_FIR_ADD(S_4QT_FIR_ADD)
                .S_4QT_SCD_ADD(S_4QT_SCD_ADD)
                .build();

    }
}
//class Save {
//}