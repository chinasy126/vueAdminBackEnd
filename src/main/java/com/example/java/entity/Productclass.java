package com.example.java.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.models.auth.In;
import lombok.Data;

@Data
public class Productclass {

    /**
     * 编号|0|0|0
     */
    @TableId(value = "classid", type = IdType.AUTO)
    private Integer classid;

    /**
     * 分类名称|1|0|1
     */
    private String classname;

    /**
     * 分类编码|0|0|0
     */
    private String classpower;

    /**
     * 分类深度|0|0|0
     */
    private Integer depth;

    /**
     * 分类根ID|0|0|0
     */
    private Integer rootid;

    private String classcontents;

    private String classpic;
}
