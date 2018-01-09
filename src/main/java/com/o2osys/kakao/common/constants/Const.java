package com.o2osys.kakao.common.constants;

/**
   @FileName  : Const.java
   @Description : 배달대행 연동 상수
   @author      : KMS
   @since       : 2017. 7. 26.
   @version     : 1.0

   @개정이력

   수정일           수정자         수정내용
   -----------      ---------      -------------------------------
   2017. 7. 26.     KMS            최초생성

 */
public interface Const {
    /** 연동_배달대행_구분_코드 */
    interface DVRY_TYPE_CD {

    }

    /** 연동_구분 (2: 인성(생각대로), 3: 바로고, 4: 메쉬코리아) */
    interface CON_TYPE {
        /** 연동_구분 (2: 인성(생각대로)) */
        final String FDIA = "2";
        /** 연동_구분 (3: 바로고) */
        final String BAROGO = "3";
        /** 연동_구분 (4: 메쉬코리아) */
        final String MASH = "4";
    }

    /** 연동_상태 (0: 대기중, 1: 전송완료, 2: 전송실패) */
    interface STATUS {
        /** 연동_상태 (0: 대기중) */
        final String WAIT = "0";
        /** 연동_상태 (1: 전송완료) */
        final String SUCCESS = "1";
        /** 연동_상태 (2: 전송실패) */
        final String FAIL = "2";
    }

    /** 연동_처리_구분 (1: 접수, 2: 수정, 3: 취소, 4: 재접수) */
    interface ACT_TYPE {
        /** 연동_처리_구분 (1: 접수) */
        final String RECEIPT = "1";
        /** 연동_처리_구분 (2: 수정) */
        final String MODIFY = "2";
        /** 연동_처리_구분 (3: 취소) */
        final String CANCEL = "3";
        /** 연동_처리_구분 (4: 재접수) */
        final String RETRY = "4";
    }


    /** 처리_구분 (1: 배차, 2: 배차정보수정, 3: 배차취소, 4: 완료, 5: 출발, 6: 결제정보수정, 7: 카드승인정보수정, 8: 주문취소) */
    interface STATUS_ACT_TYPE {
        /** 처리_구분 (1: 배차) */
        final String DISPATCH = "1";
        /** 처리_구분 (2: 배차정보수정) */
        final String DISPATCH_UPDATE = "2";
        /** 처리_구분 (3: 배차취소) */
        final String DISPATCH_CANCEL = "3";
        /** 처리_구분 (4: 완료) */
        final String COMPLITE = "4";
        /** 처리_구분 (5: 출발) */
        final String DEPART = "5";
        /** 처리_구분 (6: 결제정보수정) */
        final String PAY_UPDATE = "6";
        /** 처리_구분 (7: 카드승인정보수정) */
        final String CARD_UPDATE = "7";
        /** 처리_구분 (8: 주문취소) */
        final String ORDER_CANCEL = "8";
    }


    /** REST 응답 코드 */
    interface RES_CODE{
        /** 정상(0000) */
        final String OK = "0000";
        /** 처리거절(처리불가능 상황)(0002) */
        final String FAIL = "0002";
        /** 시스템 오류(정의되지 않은 오류)(9999) */
        final String SYSTEM_ERROR="9999";
    }

    /** REST 응답 코드 */
    interface RES_CODE_NAME{
        /** 정상(0000) */
        final String OK = "정상";
        /** 처리거절(처리불가능 상황)(0002) */
        final String FAIL = "처리거절";
        /** 시스템 오류(정의되지 않은 오류)(9999) */
        final String SYSTEM_ERROR="시스템 오류(정의되지 않은 오류)";
    }

    /*public enum STATUS_ACT_TYPE {
     *//** 1. 배차 *//*
        DISPATCH("1","배차"),
      *//** 2. 배차정보수정 *//*
        DISPATCH_UPDATE("2","배차정보수정"),
       *//** 3. 배차취소 *//*
        DISPATCH_CANCEL("3","배차취소"),
        *//** 4. 완료 *//*
        COMPLITE("4","완료"),
         *//** 5. 출발 *//*
        DEPART("5","출발"),
          *//** 6. 결제정보수정 *//*
        PAY_UPDATE("6","결제정보수정"),
           *//** 7. 카드승인정보수정 *//*
        CARD_UPDATE("7","카드승인정보수정"),
            *//** 8. 주문취소 *//*
        ORDER_CANCEL("8","주문취소");


        @Getter private final String code;
        @Getter private final String name;

        STATUS_ACT_TYPE(String code, String name) {
            this.code = code;
            this.name = name;
        }

    }*/


}
