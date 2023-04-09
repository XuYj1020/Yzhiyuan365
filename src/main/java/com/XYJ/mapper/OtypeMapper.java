package com.XYJ.mapper;

import com.XYJ.pojo.Otype;

import java.util.List;

public interface OtypeMapper {
    List<Otype>selectByRegistrationstatusid(String registrationsid);
}
