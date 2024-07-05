package cc.orcl.pkgquery.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;


/**
* 
*/
@Data
@Schema(description = "邮件的入参")
public class PostalDto {

    /**
     * 接收人ID(角色ID)
     */
    @Schema(description = "接收人ID(角色ID)")
    private String receiveCharacNo;

    /**
     * 物品附件ID
     */
    @Schema(description = "物品附件ID")
    private int itemId;

    /**
     * 物品数量
     */
    @Schema(description = "物品数量")
    private int addInfo = 1;

    /**
     * 物品强化等级
     */
    @Schema(description = "物品强化等级")
    private int upgrade;

    /**
     * 红字属性类型（智力力量什么的，具体回家分析代码补全）
     * '空-0', '异次元体力-1', '异次元精神-2', '异次元力量-3', '异次元智力-4'
     */
    @Schema(description = "红字属性类型'空-0', '异次元体力-1', '异次元精神-2', '异次元力量-3', '异次元智力-4'")
    private int amplifyOption;

    /**
     * 红字属性值
     *
     */
    @Schema(description = "红字属性值")
    private int amplifyValue;

    /**
     * 金币数量
     */
    @Schema(description = "金币数量")
    private int gold;


    /**
     * 邮件内物品是否是封装（ss禁止封装）
     */
    @Schema(description = "邮件内物品是否是封装（ss禁止封装）")
    private boolean sealFlag;


    /**
     * 物品锻造等级
     */
    @Schema(description = "物品锻造等级")
    private int seperateUpgrade;
}