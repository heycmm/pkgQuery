package cc.orcl.pkgquery.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cc.orcl.pkgquery.model.Accounts;
import cc.orcl.pkgquery.dao.AccountsMapper;
import cc.orcl.pkgquery.service.AccountsService;

@Service
public class AccountsServiceImpl extends ServiceImpl<AccountsMapper, Accounts> implements AccountsService{

    private final AccountsMapper accountsMapper;

    public AccountsServiceImpl(AccountsMapper accountsMapper) {
        this.accountsMapper = accountsMapper;
    }

    @Override
    public Accounts findById(Integer id){
        return accountsMapper.selectById(id);
    }

    @Override
    public IPage<Accounts> findByPage(int pageNum, int pageSize) {
        return accountsMapper.selectPage(new Page<>(pageNum, pageSize), null);
    }

    @Override
    public void insert(Accounts accounts){
        accountsMapper.insert(accounts);
    }

    @Override
    public void update(Accounts accounts){
        accountsMapper.updateById(accounts);
    }

    @Override
    public void deleteById(Integer id){
        accountsMapper.deleteById(id);
    }

}