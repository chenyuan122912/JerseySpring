package com.jax.JerseySpring.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jax.JerseySpring.mgr.acct.IAcctMgr;

@Component
@Path("/demo")
public class HelloResources {

	@Autowired
	public IAcctMgr acctMgr;
	
	@GET
	@Path("/hello")
	public String acct() {
		String result = "failure";
		try {
			result = acctMgr.getAcctByCd("9527");
			System.out.println("结果：" + result);
		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}
}
