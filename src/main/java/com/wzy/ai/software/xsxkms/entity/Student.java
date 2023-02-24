package com.wzy.ai.software.xsxkms.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Torther
 */
@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;
    Integer age;
    String gender;
}
