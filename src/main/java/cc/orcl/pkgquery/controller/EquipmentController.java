package cc.orcl.pkgquery.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import cc.orcl.pkgquery.model.Equipment;
import cc.orcl.pkgquery.service.EquipmentService;

/**
 * 存储各种装备信息的表
 */
@Tag(name = "装备信息",description = "获取装备信息")
@RestController
@RequestMapping("/equipment")
public class EquipmentController {
    private final EquipmentService equipmentService;

    public EquipmentController(EquipmentService equipmentService) {
        this.equipmentService = equipmentService;
    }

    @GetMapping("/{id}")
    public Equipment findById(@PathVariable("id") Integer id) {
        return equipmentService.findById(id);
    }

    @GetMapping
    public IPage<Equipment> findByPage(
            @RequestParam(value = "keyword") String keyword,
            @RequestParam(defaultValue = "1") Integer pageNum,
            @RequestParam(defaultValue = "10") Integer pageSize) {
        return equipmentService.findByPage(keyword, pageNum, pageSize);
    }


}
