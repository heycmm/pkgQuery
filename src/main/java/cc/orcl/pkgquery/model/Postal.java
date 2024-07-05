package cc.orcl.pkgquery.model;

import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;

import java.util.Date;
/**
* 
*/
@Data
@TableName("taiwan_cain_2nd.postal")
public class Postal {
    @TableId
    private Integer postalId;

    /**
     * 发送时间
     */
    @TableField("occ_time")
    private Date occTime = new Date();

    /**
     * 发送人ID（角色ID）
     */
    @TableField("send_charac_no")
    private int sendCharacNo;

    /**
     * 发送人昵称
     */
    @TableField("send_charac_name")
    private String sendCharacName;

    /**
     * 接收人ID(角色ID)
     */
    @TableField("receive_charac_no")
    private String receiveCharacNo;

    /**
     * 物品附件ID
     */
    @TableField("item_id")
    private int itemId;

    /**
     * 物品数量
     */
    @TableField("add_info")
    private int addInfo = 1;

    /**
     * 物品强化等级
     */
    @TableField("`upgrade`")
    private int upgrade;

    /**
     * 红字属性类型（智力力量什么的，具体回家分析代码补全）
     * '空-0', '异次元体力-1', '异次元精神-2', '异次元力量-3', '异次元智力-4'
     */
    @TableField("amplify_option")
    private int amplifyOption;

    /**
     * 红字属性值
     *
     */
    @TableField("amplify_value")
    private int amplifyValue;

    /**
     * 金币数量
     */
    private int gold;

    /**
     * 是否删除
     */
    @TableField("delete_flag")
    private boolean deleteFlag;

    /**
     * 邮件内物品是否是封装（ss禁止封装）
     */
    @TableField("seal_flag")
    private boolean sealFlag;

    /**
     * 信件ID（但市面上的GM工具是自增的，但实际应该对应letter表，指的是邮件文本内容。）
     * 不知道哪个傻叉干的，不能自增，留空传0就行，表示纯物品邮件， 否则可能导致内容错乱！
     */
    @TableField("letter_id")
    private int letterId;

    /**
     * 物品锻造等级
     */
    @TableField("seperate_upgrade")
    private int seperateUpgrade;

}