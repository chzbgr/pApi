package com.example.demo.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Res4 {

    private boolean resultSave;
    private Date loadTime;

    private String CORONA19_ID;
    private String CORONA19_DATE;
    private String CORONA19_NO;
    private String CORONA19_COUNTRY;
    private String CORONA19_PERSONAL;
    private String CORONA19_AREA;
    private String CORONA19_TRAVEL_HISTORY;
    private String CORONA19_CONTACT_HISTORY;
    private String CORONA19_CORRECTIVE;
    private String CORONA19_LEAVE_STATUS;
    private String CORONA19_MOVING_PATH;
    private String CORONA19_IDATE;
    private String CORONA19_MDATE;

}
