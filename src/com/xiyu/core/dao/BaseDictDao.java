package com.xiyu.core.dao;
import java.util.List;
import com.xiyu.core.po.BaseDict;
/**
 * �����ֵ�
 */
public interface BaseDictDao {
	// �����������ѯ�����ֵ�
    public List<BaseDict> selectBaseDictByTypeCode(String typecode);
}
