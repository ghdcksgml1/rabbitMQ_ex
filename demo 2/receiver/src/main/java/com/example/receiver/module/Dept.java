package com.example.receiver.module;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept implements Serializable {
    Integer deptNo;
    String dName;
    String loc;
    String time;
}
