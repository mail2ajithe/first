/*package us.tx.state.rrc.service;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;

import us.tx.state.rrc.bo.PaymentResponceBO;
import us.tx.state.rrc.dao.IRetrieveRemitIdDAO;
import us.tx.state.rrc.dao.IUpdatePaymentInformationDAO;
import us.tx.state.rrc.dao.RetrieveRemitIdDAOImpl;
import us.tx.state.rrc.entity.Remit;

public class RetrieveRemitIdTest extends AbstractConfigBaseIT{

	@Resource
	private IUpdatePaymentInformationDAO service;


	@Test
	public void RemitIdRetriveTest(){



		PaymentResponceBO paymentResponceBO = new PaymentResponceBO();

		paymentResponceBO.setLocalRefid("455RM060LNH0014");

		Long remitId = service.queryPaymentInfo(paymentResponceBO);


		Assert.assertEquals(remitId, new Long(562789));
		Assert.assertEquals(remitId, new Long(562789));

	}

}
 */