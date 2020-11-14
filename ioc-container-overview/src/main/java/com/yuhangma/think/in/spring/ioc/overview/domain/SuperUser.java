package com.yuhangma.think.in.spring.ioc.overview.domain;

import com.yuhangma.think.in.spring.ioc.overview.anno.Super;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author Moore
 * @since 2020/11/14
 */
@Data
@Super
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class SuperUser extends User {

    private Integer age;
}
