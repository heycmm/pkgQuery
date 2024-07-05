package cc.orcl.pkgquery.service.impl;

import cc.orcl.pkgquery.model.PostalDto;
import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cc.orcl.pkgquery.model.Postal;
import cc.orcl.pkgquery.dao.PostalMapper;
import cc.orcl.pkgquery.service.PostalService;

@Service
public class PostalServiceImpl extends ServiceImpl<PostalMapper, Postal> implements PostalService{

    private final PostalMapper postalMapper;

    public PostalServiceImpl(PostalMapper postalMapper) {
        this.postalMapper = postalMapper;
    }

    @Override
    public Postal findById(Integer id){
        return postalMapper.selectById(id);
    }

    @Override
    public IPage<Postal> findByPage(int pageNum, int pageSize) {
        return postalMapper.selectPage(new Page<>(pageNum, pageSize), null);
    }

    @Override
    public void insert(PostalDto postalDto){
        Postal postal = new Postal();
        BeanUtils.copyProperties(postalDto, postal);
        postal.setSendCharacNo(1);
        postal.setSendCharacName("GM");
        postal.setLetterId(0);
        postalMapper.insert(postal);
    }

    @Override
    public void update(Postal postal){
        postalMapper.updateById(postal);
    }

    @Override
    public void deleteById(Integer id){
        postalMapper.deleteById(id);
    }

}