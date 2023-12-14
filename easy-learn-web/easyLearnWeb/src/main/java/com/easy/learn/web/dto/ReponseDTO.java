package com.easy.learn.web.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class ReponseDTO<T> implements Serializable {
    public String message;
    @JsonProperty("error_code")
    public Integer errorCode;
    public T data;
    public List<T> list;
//    public Page<T> pages;
}
