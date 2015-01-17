package us.tx.state.rrc.service;


import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import us.tx.state.rrc.bo.PaymentResponceBO;
import us.tx.state.rrc.config.AppConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextHierarchy (value = { 
		@ContextConfiguration(classes = { AppConfig.class })
})

public class ServiceTest  {


	@Resource
	private NicService service;


		@Test
		public void serviceTest() {

		String traceId = "4249b846-74ac-4481-b9f4-e659a20caf45";


		PaymentResponceBO paymentResponceBO = new PaymentResponceBO();

		paymentResponceBO = service.nicService();



		Assert.assertEquals("CHARLOOTE",paymentResponceBO.getAddressline1());


		Assert.assertEquals("28217", paymentResponceBO.getZip());

		Assert.assertEquals("*0019", paymentResponceBO.getLast4Number());



		}






}
 