package cc.orcl.pkgquery.model;

import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;

/**
* 存储各种装备信息的表
*/
@Data
@TableName("halo.equipment")
public class Equipment {
    /**
    * 装备的唯一标识符
    */
    @TableId
    private Integer id;
    /**
    * 装备的名称
    */
    @TableField("name")
    private String name;
    /**
    * 装备的大类
    */
    @TableField("main_category")
    private String mainCategory;
    /**
    * 装备的小类
    */
    @TableField("sub_category")
    private String subCategory;
    /**
    * 装备的子类
    */
    @TableField("sub_sub_category")
    private String subSubCategory;
    /**
    * 装备的等级
    */
    @TableField("level")
    private String level;
    /**
    * 装备的稀有度
    */
    @TableField("rarity")
    private String rarity;
}