package com.csi.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue
    int empId;

    String empName;

    String empLastName;

    String empEmailId;

    String empPassword;

    long empContact;

    String empAddress;
}
