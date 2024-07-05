package cc.orcl.pkgquery.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import cc.orcl.pkgquery.model.Equipment;

/**
 * 存储各种装备信息的表
 */
public interface EquipmentService extends IService<Equipment> {

    /**
     * 通过ID查询单个存储各种装备信息的表
     *
     * @param id ID
     * @return {@link Equipment}
     */
     Equipment findById(Integer id);

    /**
     * 分页查询存储各种装备信息的表
     *
     * @param keyword 关键字
     * @param pageNum  页号
     * @param pageSize 每页大小
     * @return {@link Equipment}
     */
     IPage<Equipment> findByPage(String keyword, int pageNum, int pageSize);

    /**
     * 新增存储各种装备信息的表
     *
     * @param equipment Equipment
     */
    void insert(Equipment equipment);

    /**
     * 修改存储各种装备信息的表
     *
     * @param equipment Equipment
     */
    void update(Equipment equipment);

    /**
     * 通过ID删除单个存储各种装备信息的表
     *
     * @param id ID
     */
    void deleteById(Integer id);

}