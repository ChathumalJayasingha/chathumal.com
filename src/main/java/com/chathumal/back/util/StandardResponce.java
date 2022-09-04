package com.chathumal.back.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Chathumal Jayasingha | [chathumaljayasingha@hotmail.com]
 * @since - 9/4/22 | 2022-September-04[Sunday]
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StandardResponce {
    private String code;
    private String message;
    private Object data;
}

