package com.ramjava.bruker.tjeneste.valueobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Avdeling {
    private Long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
