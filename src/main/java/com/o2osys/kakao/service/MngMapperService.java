package com.o2osys.kakao.service;

import java.util.ArrayList;

import com.o2osys.kakao.entity.MnGrSt;

/**
   @FileName  : ConMapperService.java
   @Description : 배달대행 연동 서비스 인터페이스
   @author      : KMS
   @since       : 2017. 7. 24.
   @version     : 1.0

   @개정이력

   수정일           수정자         수정내용
   -----------      ---------      -------------------------------
   2017. 7. 24.     KMS            최초생성

 */
public interface MngMapperService {

    public ArrayList<MnGrSt> mnGrStList(int pageno, int pagesize) throws Exception;

    public int mnGrStListSize() throws Exception;

}
