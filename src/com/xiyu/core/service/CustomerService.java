package com.xiyu.core.service;

import com.xiyu.common.utils.Page;
import com.xiyu.core.po.Customer;

public interface CustomerService {
	// ��ѯ�ͻ��б�
	public Page<Customer> findCustomerList(Integer page, Integer rows, 
                                        String custName,String custSource,
                                        String custIndustry,String custLevel);
	
	public int createCustomer(Customer customer);
	
	// ͨ��id��ѯ�ͻ�
	public Customer getCustomerById(Integer id);
	// ���¿ͻ�
	public int updateCustomer(Customer customer);

	// ɾ���ͻ�
	public int deleteCustomer(Integer id);
}
