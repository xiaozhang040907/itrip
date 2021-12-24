package com.zyh.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zyh.entity.ItripComment;
import com.zyh.mapper.ItripCommentMapper;
import com.zyh.service.ItripCommentService;
@Service
public class ItripCommentServiceImpl extends ServiceImpl<ItripCommentMapper, ItripComment> implements ItripCommentService{

}
