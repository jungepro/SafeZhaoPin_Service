package com.entity.view;

import com.entity.NewsEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 新闻资讯
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * coderH 
 * @email 
 * @date 2020-05-13 10:02:23
 */
@TableName("news")
public class NewsView  extends NewsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public NewsView(){
	}
 
 	public NewsView(NewsEntity newsEntity){
 	try {
			BeanUtils.copyProperties(this, newsEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
