package cc.orcl.pkgquery.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.beans.factory.annotation.Autowired;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cc.orcl.pkgquery.model.Tools;
import cc.orcl.pkgquery.dao.ToolsMapper;
import cc.orcl.pkgquery.service.ToolsService;

@Service
public class ToolsServiceImpl extends ServiceImpl<ToolsMapper, Tools> implements ToolsService {

    private final ToolsMapper toolsMapper;

    public ToolsServiceImpl(ToolsMapper toolsMapper) {
        this.toolsMapper = toolsMapper;
    }

    @Override
    public Tools findById(Integer id) {
        return toolsMapper.selectById(id);
    }

    @Override
    public IPage<Tools> findByPage(int pageNum, int pageSize, String keyword) {
        return toolsMapper.selectPage(new Page<>(pageNum, pageSize), Wrappers.<Tools>lambdaQuery().like(Tools::getName, keyword));
    }

    @Override
    public void insert(Tools tools) {
        toolsMapper.insert(tools);
    }

    @Override
    public void update(Tools tools) {
        toolsMapper.updateById(tools);
    }

    @Override
    public void deleteById(Integer id) {
        toolsMapper.deleteById(id);
    }

}