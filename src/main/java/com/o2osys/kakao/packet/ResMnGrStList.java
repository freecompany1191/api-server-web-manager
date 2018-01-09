package com.o2osys.kakao.packet;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.o2osys.kakao.entity.MnGrSt;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResMnGrStList {

    private int pageno;

    private int pagesize;

    private int totalcount;

    @JsonProperty("mngrsts")
    private ArrayList<MnGrSt> mnGrStList;
}
