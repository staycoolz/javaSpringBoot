package com.adrian.master.BackendUserSpringboot.service;

public class UserModulesImpl implements UserModules{

	@Override
	public void getUserModulesById() {
		final String sql = " select u.user_id, uto.user_type_order_seq, l.lookup_name "+
				"from users u "+
				"join user_type ut on ut.user_type_id = u.user_type_id "+
				"join user_type_order uto on uto.user_type_id = ut.user_type_id "+
				"join lookup l on l.lookup_id = uto.lookup_id "+
				"where u.user_id = :userId ";
		
	}

}
