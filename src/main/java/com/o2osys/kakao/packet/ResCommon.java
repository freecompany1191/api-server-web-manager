package com.o2osys.kakao.packet;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResCommon {

    /** 응답코드 실패: 0, 성공: 1 */
    @JsonProperty("rtn_code")
    private String rtnCode;

    /** 응답메세지 */
    @JsonProperty("rtn_msg")
    private String rtnMsg;

}
