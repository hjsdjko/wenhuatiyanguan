package com.dao;

import com.entity.DiscusszhizuoshipinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszhizuoshipinVO;
import com.entity.view.DiscusszhizuoshipinView;


/**
 * 制作视频评论表
 * 
 * @author 
 * @email 
 * @date 2021-02-22 15:48:18
 */
public interface DiscusszhizuoshipinDao extends BaseMapper<DiscusszhizuoshipinEntity> {
	
	List<DiscusszhizuoshipinVO> selectListVO(@Param("ew") Wrapper<DiscusszhizuoshipinEntity> wrapper);
	
	DiscusszhizuoshipinVO selectVO(@Param("ew") Wrapper<DiscusszhizuoshipinEntity> wrapper);
	
	List<DiscusszhizuoshipinView> selectListView(@Param("ew") Wrapper<DiscusszhizuoshipinEntity> wrapper);

	List<DiscusszhizuoshipinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszhizuoshipinEntity> wrapper);
	
	DiscusszhizuoshipinView selectView(@Param("ew") Wrapper<DiscusszhizuoshipinEntity> wrapper);
	
}
