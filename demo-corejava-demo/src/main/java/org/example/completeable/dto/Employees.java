package org.example.completeable.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employees {
    String userId;
    String jobTitleName;
    String firstName;
    String lastName;
    String  preferredFullName;
    String  employeeCode;
    String region;
    String phoneNumber;
    String emailAddress;
}
