package cc.orcl.pkgquery.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import cc.orcl.pkgquery.model.Accounts;

/**
 * 
 */
public interface AccountsService extends IService<Accounts> {

    /**
     * 通过ID查询单个
     *
     * @param id ID
     * @return {@link Accounts}
     */
     Accounts findById(Integer id);

    /**
     * 分页查询
     *
     * @param pageNum   页号
     * @param pageSize 每页大小
     * @return {@link Accounts}
     */
     IPage<Accounts> findByPage(int pageNum, int pageSize);

    /**
     * 新增
     *
     * @param accounts Accounts
     */
    void insert(Accounts accounts);

    /**
     * 修改
     *
     * @param accounts Accounts
     */
    void update(Accounts accounts);

    /**
     * 通过ID删除单个
     *
     * @param id ID
     */
    void deleteById(Integer id);

}