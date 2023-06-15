package com.example.DocumentaryProject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Documentary {
    private String id;
    private String adress;
    private String number;
    private String abs;
    private String time;
    private String user;
    private String content;
}
