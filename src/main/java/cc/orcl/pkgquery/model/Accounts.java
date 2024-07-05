package cc.orcl.pkgquery.model;

import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;

/**
* 
*/
@Data
@TableName("d_taiwan.accounts")
public class Accounts {
    /**
    * 
    */
    @TableId
    private Integer uid;
    /**
    * 
    */
    @TableField("accountname")
    private String accountname;
    /**
    * 
    */
    @TableField("password")
    private String password;
    /**
    * 
    */
    @TableField("qq")
    private String qq;
    /**
    * 
    */
    @TableField("ip")
    private String ip;
    /**
    * 
    */
    @TableField("VIP")
    private String vip;
}