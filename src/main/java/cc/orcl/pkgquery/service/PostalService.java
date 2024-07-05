package cc.orcl.pkgquery.service;

import cc.orcl.pkgquery.model.PostalDto;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import cc.orcl.pkgquery.model.Postal;

/**
 * 
 */
public interface PostalService extends IService<Postal> {

    /**
     * 通过ID查询单个
     *
     * @param id ID
     * @return {@link Postal}
     */
     Postal findById(Integer id);

    /**
     * 分页查询
     *
     * @param pageNum   页号
     * @param pageSize 每页大小
     * @return {@link Postal}
     */
     IPage<Postal> findByPage(int pageNum, int pageSize);

    /**
     * 新增
     *
     * @param postal Postal
     */
    void insert(PostalDto postal);

    /**
     * 修改
     *
     * @param postal Postal
     */
    void update(Postal postal);

    /**
     * 通过ID删除单个
     *
     * @param id ID
     */
    void deleteById(Integer id);

}