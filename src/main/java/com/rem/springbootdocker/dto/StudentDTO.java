package com.rem.springbootdocker.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Builder
@Data
public class StudentDTO implements Serializable {

    private String firstname;

    private String lastname;

    private String emailAddress;
}
