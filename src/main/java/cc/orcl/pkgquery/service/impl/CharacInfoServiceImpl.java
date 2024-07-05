package cc.orcl.pkgquery.service.impl;

import cc.orcl.pkgquery.model.Accounts;
import cc.orcl.pkgquery.model.CharacInfoVo;
import cc.orcl.pkgquery.service.AccountsService;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cc.orcl.pkgquery.model.CharacInfo;
import cc.orcl.pkgquery.dao.CharacInfoMapper;
import cc.orcl.pkgquery.service.CharacInfoService;

@Service
public class CharacInfoServiceImpl extends ServiceImpl<CharacInfoMapper, CharacInfo> implements CharacInfoService {

    private final CharacInfoMapper characInfoMapper;
    private final AccountsService accountsService;

    public CharacInfoServiceImpl(CharacInfoMapper characInfoMapper, AccountsService accountsService) {
        this.characInfoMapper = characInfoMapper;
        this.accountsService = accountsService;
    }

    @Override
    public CharacInfo findById(Integer id) {
        return characInfoMapper.selectById(id);
    }

    @Override
    public IPage<CharacInfoVo> findByPage(int pageNum, int pageSize, String accountName) {
        Accounts one = accountsService.getOne(Wrappers.<Accounts>lambdaQuery().eq(Accounts::getAccountname, accountName).or().eq(Accounts::getQq, accountName));
        long mid = 0;
        if (one != null) {
            mid = one.getUid();
        }
        return characInfoMapper.selectPageWithCharsetConversion(new Page<>(pageNum, pageSize), mid);
    }

    @Override
    public void insert(CharacInfo characInfo) {
        characInfoMapper.insert(characInfo);
    }

    @Override
    public void update(CharacInfo characInfo) {
        characInfoMapper.updateById(characInfo);
    }

    @Override
    public void deleteById(Integer id) {
        characInfoMapper.deleteById(id);
    }

}