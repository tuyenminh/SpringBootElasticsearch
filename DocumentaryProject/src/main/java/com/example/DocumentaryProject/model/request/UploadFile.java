package com.example.DocumentaryProject.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class UploadFile {
    private String name;
    private String url;
    private long size;

}
