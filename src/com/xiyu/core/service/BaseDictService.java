package com.xiyu.core.service;
import java.util.List;
import com.xiyu.core.po.BaseDict;
/**
 * �����ֵ�Service�ӿ�
 */
public interface BaseDictService {
	//�����������ѯ�����ֵ�
	public List<BaseDict> findBaseDictByTypeCode(String typecode);	
}
