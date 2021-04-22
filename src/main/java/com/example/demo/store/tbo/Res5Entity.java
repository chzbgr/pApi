//package com.example.demo.store.tbo;
//
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Data
//@Entity
//@NoArgsConstructor
//@Table(name = "Res5")
//public class Res5Entity {
//    @Id
//    private String loadtime;
//    private String S_VC_DT;
//    private String REG_DT;
//    private String WORK_DTTM;
//
//    @Column
//    private String S_1QT_FIR_SUB;
//    private String S_1QT_FIR_INC;
//    private String S_1QT_FIR_RATE;
//    private String S_1QT_SCD_SUB;
//    private String S_1QT_SCD_INC;
//    private String S_1QT_SCD_RATE;
//    private String S_2QT_FIR_SUB;
//    private String S_2QT_FIR_INC;
//    private String S_2QT_FIR_RATE;
//    private String S_2QT_SCD_SUB;
//    private String S_2QT_SCD_INC;
//    private String S_2QT_SCD_RATE;
//    private String S_3QT_FIR_SUB;
//    private String S_3QT_FIR_INC;
//    private String S_3QT_FIR_RATE;
//    private String S_3QT_SCD_SUB;
//    private String S_3QT_SCD_INC;
//    private String S_3QT_SCD_RATE;
//    private String S_4QT_FIR_SUB;
//    private String S_4QT_FIR_INC;
//    private String S_4QT_FIR_RATE;
//    private String S_4QT_SCD_SUB;
//    private String S_4QT_SCD_INC;
//    private String S_4QT_SCD_RATE;
//    private String S_1QT_FIR_ADD;
//    private String S_1QT_SCD_ADD;
//    private String S_2QT_FIR_ADD;
//    private String S_2QT_SCD_ADD;
//    private String S_3QT_FIR_ADD;
//    private String S_3QT_SCD_ADD;
//    private String S_4QT_FIR_ADD;
//    private String S_4QT_SCD_ADD;
//
//    @Builder
//    public Res5Entity(String loadtime, String S_VC_DT, String REG_DT, String WORK_DTTM, String S_1QT_FIR_SUB, String S_1QT_FIR_INC, String S_1QT_FIR_RATE, String S_1QT_SCD_SUB, String S_1QT_SCD_INC, String S_1QT_SCD_RATE, String S_2QT_FIR_SUB, String S_2QT_FIR_INC, String S_2QT_FIR_RATE, String S_2QT_SCD_SUB, String S_2QT_SCD_INC, String S_2QT_SCD_RATE, String S_3QT_FIR_SUB, String S_3QT_FIR_INC, String S_3QT_FIR_RATE, String S_3QT_SCD_SUB, String S_3QT_SCD_INC, String S_3QT_SCD_RATE, String S_4QT_FIR_SUB, String S_4QT_FIR_INC, String S_4QT_FIR_RATE, String S_4QT_SCD_SUB, String S_4QT_SCD_INC, String S_4QT_SCD_RATE, String S_1QT_FIR_ADD, String S_1QT_SCD_ADD, String S_2QT_FIR_ADD, String S_2QT_SCD_ADD, String S_3QT_FIR_ADD, String S_3QT_SCD_ADD, String S_4QT_FIR_ADD, String S_4QT_SCD_ADD) {
//        this.loadtime = loadtime;
//        this.S_VC_DT = S_VC_DT;
//        this.REG_DT = REG_DT;
//        this.WORK_DTTM = WORK_DTTM;
//        this.S_1QT_FIR_SUB = S_1QT_FIR_SUB;
//        this.S_1QT_FIR_INC = S_1QT_FIR_INC;
//        this.S_1QT_FIR_RATE = S_1QT_FIR_RATE;
//        this.S_1QT_SCD_SUB = S_1QT_SCD_SUB;
//        this.S_1QT_SCD_INC = S_1QT_SCD_INC;
//        this.S_1QT_SCD_RATE = S_1QT_SCD_RATE;
//        this.S_2QT_FIR_SUB = S_2QT_FIR_SUB;
//        this.S_2QT_FIR_INC = S_2QT_FIR_INC;
//        this.S_2QT_FIR_RATE = S_2QT_FIR_RATE;
//        this.S_2QT_SCD_SUB = S_2QT_SCD_SUB;
//        this.S_2QT_SCD_INC = S_2QT_SCD_INC;
//        this.S_2QT_SCD_RATE = S_2QT_SCD_RATE;
//        this.S_3QT_FIR_SUB = S_3QT_FIR_SUB;
//        this.S_3QT_FIR_INC = S_3QT_FIR_INC;
//        this.S_3QT_FIR_RATE = S_3QT_FIR_RATE;
//        this.S_3QT_SCD_SUB = S_3QT_SCD_SUB;
//        this.S_3QT_SCD_INC = S_3QT_SCD_INC;
//        this.S_3QT_SCD_RATE = S_3QT_SCD_RATE;
//        this.S_4QT_FIR_SUB = S_4QT_FIR_SUB;
//        this.S_4QT_FIR_INC = S_4QT_FIR_INC;
//        this.S_4QT_FIR_RATE = S_4QT_FIR_RATE;
//        this.S_4QT_SCD_SUB = S_4QT_SCD_SUB;
//        this.S_4QT_SCD_INC = S_4QT_SCD_INC;
//        this.S_4QT_SCD_RATE = S_4QT_SCD_RATE;
//        this.S_1QT_FIR_ADD = S_1QT_FIR_ADD;
//        this.S_1QT_SCD_ADD = S_1QT_SCD_ADD;
//        this.S_2QT_FIR_ADD = S_2QT_FIR_ADD;
//        this.S_2QT_SCD_ADD = S_2QT_SCD_ADD;
//        this.S_3QT_FIR_ADD = S_3QT_FIR_ADD;
//        this.S_3QT_SCD_ADD = S_3QT_SCD_ADD;
//        this.S_4QT_FIR_ADD = S_4QT_FIR_ADD;
//        this.S_4QT_SCD_ADD = S_4QT_SCD_ADD;
//    }
//}
