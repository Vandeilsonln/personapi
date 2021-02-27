package com.digitalinnovationone.personapi.utils;

import com.digitalinnovationone.personapi.dto.request.PhoneDTO;
import com.digitalinnovationone.personapi.entity.Phone;
import com.digitalinnovationone.personapi.enums.PhoneType;

public class PhoneUtils {

    public static final String PHONE_NUMBER = "1198765432";
    public static final PhoneType PHONE_TYPE = PhoneType.MOBILE;
    public static final long PHONE_ID = 1L;

    public static PhoneDTO createFakeDTO() {
        return PhoneDTO.builder()
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }

    public static Phone createFakeEntity() {
        return Phone.builder()
                .id(PHONE_ID)
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }
}
