package cc.orcl.pkgquery.controller;

import cc.orcl.pkgquery.model.CharacInfoVo;
import cc.orcl.pkgquery.utils.MultiCharsetDecoder;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import cc.orcl.pkgquery.service.CharacInfoService;


/**
 *
 */
@Tag(name = "角色信息",description = "你的角色名字和id")
@RestController
@RequestMapping("/characInfo")
public class CharacInfoController {
    private final CharacInfoService characInfoService;

    public CharacInfoController(CharacInfoService characInfoService) {
        this.characInfoService = characInfoService;
    }


    @Operation(summary = "查询角色表", description = "拿账号或者qq查")
    @GetMapping
    public IPage<CharacInfoVo> findByPage(@RequestParam(defaultValue = "1") Integer pageNum,
                                        @RequestParam(defaultValue = "10") Integer pageSize,
                                        @RequestParam String accountName
                                          ) {
        IPage<CharacInfoVo> byPage = characInfoService.findByPage(pageNum, pageSize,accountName);
        byPage.getRecords().forEach(vo->{
            String characName = vo.getCharacName();
            String decode = MultiCharsetDecoder.decode(characName);
            vo.setCharacName(decode);
        });
        return byPage;
    }


}
