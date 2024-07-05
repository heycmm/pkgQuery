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
@TableName("taiwan_cain.charac_info")
public class CharacInfo {
    /**
    * 
    */
    @TableField("m_id")
    private Integer mId;
    /**
    * 
    */
    @TableId
    private Integer characNo;
    /**
    * 
    */
    @TableField("charac_name")
    private String characName;
    /**
    * 
    */
    @TableField("village")
    private Integer village;
    /**
    * 
    */
    @TableField("job")
    private Integer job;
    /**
    * 
    */
    @TableField("lev")
    private Integer lev;
    /**
    * 
    */
    @TableField("exp")
    private Integer exp;
    /**
    * 
    */
    @TableField("grow_type")
    private Integer growType;
    /**
    * 
    */
    @TableField("HP")
    private Integer hp;
    /**
    * 
    */
    @TableField("maxHP")
    private Integer maxhp;
    /**
    * 
    */
    @TableField("maxMP")
    private Integer maxmp;
    /**
    * 
    */
    @TableField("phy_attack")
    private Integer phyAttack;
    /**
    * 
    */
    @TableField("phy_defense")
    private Integer phyDefense;
    /**
    * 
    */
    @TableField("mag_attack")
    private Integer magAttack;
    /**
    * 
    */
    @TableField("mag_defense")
    private Integer magDefense;
    /**
    * 
    */
    @TableField("element_resist")
    private String elementResist;
    /**
    * 
    */
    @TableField("spec_property")
    private String specProperty;
    /**
    * 
    */
    @TableField("inven_weight")
    private Integer invenWeight;
    /**
    * 
    */
    @TableField("hp_regen")
    private Integer hpRegen;
    /**
    * 
    */
    @TableField("mp_regen")
    private Integer mpRegen;
    /**
    * 
    */
    @TableField("move_speed")
    private Integer moveSpeed;
    /**
    * 
    */
    @TableField("attack_speed")
    private Integer attackSpeed;
    /**
    * 
    */
    @TableField("cast_speed")
    private Integer castSpeed;
    /**
    * 
    */
    @TableField("hit_recovery")
    private Integer hitRecovery;
    /**
    * 
    */
    @TableField("jump")
    private Integer jump;
    /**
    * 
    */
    @TableField("charac_weight")
    private Integer characWeight;
    /**
    * 
    */
    @TableField("fatigue")
    private Integer fatigue;
    /**
    * 
    */
    @TableField("max_fatigue")
    private Integer maxFatigue;
    /**
    * 
    */
    @TableField("premium_fatigue")
    private Integer premiumFatigue;
    /**
    * 
    */
    @TableField("max_premium_fatigue")
    private Integer maxPremiumFatigue;
    /**
    * 
    */
    @TableField("create_time")
    private Date createTime;
    /**
    * 
    */
    @TableField("last_play_time")
    private Date lastPlayTime;
    /**
    * 
    */
    @TableField("dungeon_clear_point")
    private Integer dungeonClearPoint;
    /**
    * 
    */
    @TableField("delete_time")
    private Date deleteTime;
    /**
    * 
    */
    @TableField("delete_flag")
    private Integer deleteFlag;
    /**
    * 
    */
    @TableField("guild_id")
    private Integer guildId;
    /**
    * 
    */
    @TableField("guild_right")
    private Integer guildRight;
    /**
    * 
    */
    @TableField("member_flag")
    private Integer memberFlag;
    /**
    * 
    */
    @TableField("sex")
    private Integer sex;
    /**
    * 
    */
    @TableField("expert_job")
    private Integer expertJob;
    /**
    * 
    */
    @TableField("skill_tree_index")
    private Integer skillTreeIndex;
    /**
    * 
    */
    @TableField("link_charac_no")
    private Integer linkCharacNo;
    /**
    * 
    */
    @TableField("event_charac_level")
    private Integer eventCharacLevel;
    /**
    * 
    */
    @TableField("guild_secede")
    private Integer guildSecede;
    /**
    * 
    */
    @TableField("start_time")
    private Integer startTime;
    /**
    * 
    */
    @TableField("finish_time")
    private Integer finishTime;
    /**
    * 
    */
    @TableField("competition_area")
    private Integer competitionArea;
    /**
    * 
    */
    @TableField("competition_period")
    private Integer competitionPeriod;
    /**
    * 
    */
    @TableField("mercenary_start_time")
    private Integer mercenaryStartTime;
    /**
    * 
    */
    @TableField("mercenary_finish_time")
    private Integer mercenaryFinishTime;
    /**
    * 
    */
    @TableField("mercenary_area")
    private Integer mercenaryArea;
    /**
    * 
    */
    @TableField("mercenary_period")
    private Integer mercenaryPeriod;
    /**
    * 
    */
    @TableField("VIP")
    private String vip;
}