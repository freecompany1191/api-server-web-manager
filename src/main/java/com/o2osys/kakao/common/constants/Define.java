package com.o2osys.kakao.common.constants;

/**
   @FileName  : Define.java
   @Description : 만나 공통 상수
   @author      : KMS
   @since       : 2017. 7. 26.
   @version     : 1.0

   @개정이력

   수정일           수정자         수정내용
   -----------      ---------      -------------------------------
   2017. 7. 26.     KMS            최초생성

 */
public interface Define {
    /**
     * reqeust parameter 변수 명 정의
     */
    interface Param {
        String X_AUTH_TOKEN = "x-auth-token"; // token
        String LANG_CODE = "lang_code"; // lang code
    }

    /**
     * 응답 코드 정의
     */
    interface HttpStatus {
        interface Code {
            int OK = 200;
            int BAD_REQUEST = 400;
            int UNAUTHORIZED = 401;
            int NOT_FOUND = 404;
            int SERVER_ERROR = 500;
        }

        interface Message {
            String OK = "성공";
            String BAD_REQUEST = "Bad Request-field validation 실패";
            String FORBIDDEN = "Forbidden 서버 접근 금지";
            String UNAUTHORIZED = "Unauthorized-API 인증,인가 실패";
            String NOT_FOUND = "Not Found-해당 리소스가 없음";
            String SERVER_ERROR = "Internal Server Error-서버에러";
        }
    }

    String CONTENT_TYPE = "application/json; charset=utf-8";
    String LANG_CODE = "ko";

    /**
     * 프로시져 응답 정의 코드
     */
    interface ProcedureStatus {
        interface Code {
            int OK = 1;
            int NOT_ORDER = 2;
            int NOT_GET_OUT =3;
        }
    }

    interface Lang {
        String KO = "0001";
    }

    /** 결제 구분(1. 도착지 결제, 2. 선결제) */
    interface ChargeType {
        /** 1. 도착지 결제 */
        String TYPE_1 = "1"; // 도착지결제
        /** 2. 선결제 */
        String TYPE_2 = "2"; // 선결제
    }

    /** 지불 구분(1001. 현금, 1002. 카드, 1003. 만나페이) */
    interface PayTypeCd {
        /** 1001. 현금 */
        String CASH = "1001";
        /** 1002. 카드 */
        String CARD = "1002";
        /** 1003. 만나페이 */
        String MANNA_PAY = "1003";
    }

    interface DaumHttpStatus {
        interface Code {
            int TOO_MANY_REQUEST = 429;
        }

        interface Message {
            String TOO_MANY_REQUEST = "TOO MANY REQUEST";
        }
    }

    interface Log {
        String TYPE = "CON"; //배달대행 연동
    }

    interface ReqNum {
        String BAEMIN = "SY00_03_V01"; //배민 요청전문번호
    }
}
