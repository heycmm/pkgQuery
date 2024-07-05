package cc.orcl.pkgquery.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import cc.orcl.pkgquery.model.Tools;
import cc.orcl.pkgquery.service.ToolsService;

/**
 * 存储各种工具信息的表
 */
@Tag(name = "道具信息",description = "获取道具信息列表")
@RestController
@RequestMapping("/tools")
public class ToolsController {
    private  final ToolsService toolsService;

    public ToolsController(ToolsService toolsService) {
        this.toolsService = toolsService;
    }

    @GetMapping("/{id}")
    public Tools findById(@PathVariable("id") Integer id) {
        return toolsService.findById(id);
    }

    @GetMapping
    public IPage<Tools> findByPage(
            @RequestParam(value = "keyword") String keyword,
            @RequestParam(defaultValue = "1") Integer pageNum,
            @RequestParam(defaultValue = "10") Integer pageSize) {
        return toolsService.findByPage(pageNum, pageSize, keyword);
    }


}
