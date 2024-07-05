package cc.orcl.pkgquery.model;

import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;

/**
* 存储各种工具信息的表
*/
@Data
@TableName("tools")
public class Tools {
    /**
    * 工具的唯一标识符
    */
    @TableId
    private Integer id;
    /**
    * 工具的名称
    */
    @TableField("name")
    private String name;
    /**
    * 工具的原始种类
    */
    @TableField("original_category")
    private String originalCategory;
    /**
    * 工具的种类
    */
    @TableField("type")
    private String type;
    /**
    * 工具的使用等级
    */
    @TableField("usage_level")
    private String usageLevel;
    /**
    * 工具的稀有度
    */
    @TableField("rarity")
    private String rarity;
}