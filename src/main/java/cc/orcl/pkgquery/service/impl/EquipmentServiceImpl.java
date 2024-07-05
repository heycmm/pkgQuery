package cc.orcl.pkgquery.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cc.orcl.pkgquery.model.Equipment;
import cc.orcl.pkgquery.dao.EquipmentMapper;
import cc.orcl.pkgquery.service.EquipmentService;

@Service
public class EquipmentServiceImpl extends ServiceImpl<EquipmentMapper, Equipment> implements EquipmentService {

    private final EquipmentMapper equipmentMapper;

    public EquipmentServiceImpl(EquipmentMapper equipmentMapper) {
        this.equipmentMapper = equipmentMapper;
    }

    @Override
    public Equipment findById(Integer id) {
        return equipmentMapper.selectById(id);
    }

    @Override
    public IPage<Equipment> findByPage(String keyword, int pageNum, int pageSize) {

        return equipmentMapper.selectPage(new Page<>(pageNum, pageSize), Wrappers.<Equipment>lambdaQuery().like(Equipment::getName, keyword));
    }

    @Override
    public void insert(Equipment equipment) {
        equipmentMapper.insert(equipment);
    }

    @Override
    public void update(Equipment equipment) {
        equipmentMapper.updateById(equipment);
    }

    @Override
    public void deleteById(Integer id) {
        equipmentMapper.deleteById(id);
    }

}