package cc.orcl.pkgquery.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import cc.orcl.pkgquery.model.Tools;

/**
 * 存储各种工具信息的表
 */
public interface ToolsService extends IService<Tools> {

    /**
     * 通过ID查询单个存储各种工具信息的表
     *
     * @param id ID
     * @return {@link Tools}
     */
     Tools findById(Integer id);

    /**
     * 分页查询存储各种工具信息的表
     *
     * @param pageNum  页号
     * @param pageSize 每页大小
     * @param keyword 关键字
     * @return {@link Tools}
     */
     IPage<Tools> findByPage(int pageNum, int pageSize, String keyword);

    /**
     * 新增存储各种工具信息的表
     *
     * @param tools Tools
     */
    void insert(Tools tools);

    /**
     * 修改存储各种工具信息的表
     *
     * @param tools Tools
     */
    void update(Tools tools);

    /**
     * 通过ID删除单个存储各种工具信息的表
     *
     * @param id ID
     */
    void deleteById(Integer id);

}