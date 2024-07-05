package cc.orcl.pkgquery.controller;

import cc.orcl.pkgquery.model.PostalDto;
import io.swagger.v3.oas.annotations.tags.Tag;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import cc.orcl.pkgquery.model.Postal;
import cc.orcl.pkgquery.service.PostalService;

/**
 *
 */
@Tag(name = "邮件信息",description = "发邮件的")
@RestController
@RequestMapping("/postal")
public class PostalController {
    private final PostalService postalService;

    public PostalController(PostalService postalService) {
        this.postalService = postalService;
    }

    @GetMapping("/{id}")
    public Postal findById(@PathVariable("id") Integer id) {
        return postalService.findById(id);
    }

    @GetMapping
    public IPage<Postal> findByPage(@RequestParam(defaultValue = "1") Integer pageNum,
                                    @RequestParam(defaultValue = "10") Integer pageSize) {
        return postalService.findByPage(pageNum, pageSize);
    }

    @PostMapping
    public void insert(@RequestBody PostalDto postal) {
        postalService.insert(postal);
    }

}
