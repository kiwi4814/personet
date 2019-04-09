package com.personet.gearbox.fakeData;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {
    private Integer id;
    private String name;
    private Integer age;
    private LocalDate brithday;
    private Integer high;
    private Integer wigth;
    private String school;
    private String happy;
    private Short isboy;


}
