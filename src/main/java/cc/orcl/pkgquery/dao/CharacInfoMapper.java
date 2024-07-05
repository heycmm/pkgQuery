package cc.orcl.pkgquery.dao;

import cc.orcl.pkgquery.model.CharacInfoVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import cc.orcl.pkgquery.model.CharacInfo;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 *
 */
public interface CharacInfoMapper extends BaseMapper<CharacInfo> {
    @Select("SELECT charac_name AS characName,charac_no as characNo FROM taiwan_cain.charac_info WHERE m_id=#{mId}")
    Page<CharacInfoVo> selectPageWithCharsetConversion(Page<CharacInfo> page, @Param("mId") Long mId);
}