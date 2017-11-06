package com.jax.JerseySpring.mgr.acct.impl;

import org.springframework.stereotype.Service;

import com.jax.JerseySpring.mgr.acct.IAcctMgr;

@Service
public class AcctMgrImpl implements IAcctMgr {

	@Override
	public String getAcctByCd(String cd) {
		return "查询到帐户cd:" + cd + "的信息";
	}
}
