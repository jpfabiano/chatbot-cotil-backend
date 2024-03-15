package com.jpfabiano.botcotil.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class FaqAnswer {
    private List<String> keywords;
    private String answer;

}
