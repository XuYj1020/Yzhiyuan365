package com.XYJ.mapper;

import com.XYJ.pojo.Areas;

import com.XYJ.pojo.Area;
import java.util.List;

public interface AreaMapper {
    /*老表查询语句，areas表，数据不全，弃用
    List<Areas> SelectProvince();

    List<Areas> SelectadressByAreaID(String AreaID);
     */

    /*
    新表sql语句，area表， 码云下载，数据较全
     */
    String SelectadressByAreaID(String area_code);
}
