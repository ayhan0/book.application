package com.example.ayhan.book.email;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter

public enum EmailTemplateName {

    ACTIVATE_ACCOUNT("activate_account");

    private final String name;
    EmailTemplateName(String name) {
        this.name = name;
    }
}
