package com.jensonjo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by jensonkakkattil on Mar, 2019.
 */
@Data
@Builder
@NoArgsConstructor
public class Student {
    private String fName;
    private String lName;
}
