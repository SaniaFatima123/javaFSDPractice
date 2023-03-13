package com.example.student.dto;

import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;
@Validated
public class UpdateStandardRequest {
    @Min(1)
    private int standard;

    public UpdateStandardRequest(int standard) {
        this.standard = standard;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }
}
