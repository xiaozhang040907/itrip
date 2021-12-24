package com.zyh.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zyh.entity.ItripUser;
import com.zyh.mapper.ItripUserMapper;
import com.zyh.service.ItripUserService;
@Service
public class ItripUserServiceImpl extends ServiceImpl<ItripUserMapper, ItripUser> implements ItripUserService{

}
