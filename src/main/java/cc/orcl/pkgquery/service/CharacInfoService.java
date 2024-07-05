package cc.orcl.pkgquery.service;

import cc.orcl.pkgquery.model.CharacInfoVo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import cc.orcl.pkgquery.model.CharacInfo;

/**
 * 
 */
public interface CharacInfoService extends IService<CharacInfo> {

    /**
     * 通过ID查询单个
     *
     * @param id ID
     * @return {@link CharacInfo}
     */
     CharacInfo findById(Integer id);

    /**
     * 分页查询
     *
     * @param pageNum     页号
     * @param pageSize    每页大小
     * @param accountName 账号
     * @return {@link CharacInfo}
     */
     IPage<CharacInfoVo> findByPage(int pageNum, int pageSize, String accountName);

    /**
     * 新增
     *
     * @param characInfo CharacInfo
     */
    void insert(CharacInfo characInfo);

    /**
     * 修改
     *
     * @param characInfo CharacInfo
     */
    void update(CharacInfo characInfo);

    /**
     * 通过ID删除单个
     *
     * @param id ID
     */
    void deleteById(Integer id);

}