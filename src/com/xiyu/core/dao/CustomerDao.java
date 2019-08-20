package com.xiyu.core.dao;

import java.util.List;

import com.xiyu.core.po.Customer;

public interface CustomerDao {
	//�ͻ��б�
	public List<Customer> selectCustomerList(Customer customer);
	//�ͻ���
	public Integer selectCustomerListCount(Customer customer);
	// �����ͻ�
	public int createCustomer(Customer customer);
	// ͨ��id��ѯ�ͻ�
	public Customer getCustomerById(Integer id);
	// ���¿ͻ���Ϣ
	public int updateCustomer(Customer customer);
	// ɾ���ͻ�
	int deleteCustomer (Integer id);
}
