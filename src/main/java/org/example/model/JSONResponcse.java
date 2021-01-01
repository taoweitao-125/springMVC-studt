package org.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author xiaogege
 * @描述：
 * @date 2020/12/26
 * @time 11:41
 */
@Getter
@Setter
@ToString
public class JSONResponcse {
    private boolean success;
    private String code;
    private String message;
    private Object data;

}
