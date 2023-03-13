package com.example.userms.exception;

import javax.persistence.criteria.CriteriaBuilder;

public class InvalidCredential extends Exception {
    public InvalidCredential(String invalid_credential) {
        super(invalid_credential);
    }
}
