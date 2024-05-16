package com.ramjava.bruker.tjeneste.valueobject;

import com.ramjava.bruker.tjeneste.entity.Bruker;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateVO {
    private Bruker bruker;
    private Avdeling avdeling;
}
