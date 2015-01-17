/*package us.tx.state.rrc.service;

import javax.annotation.Resource;

import org.junit.Test;

import us.tx.state.rrc.bo.PaymentResponceBO;
import us.tx.state.rrc.dao.UpdatePaymentInformationDAOImpl;
import us.tx.state.rrc.entity.RmRemit;

public class UpdatePaymentInfoTest extends AbstractConfigBaseIT {

	@Resource
	private UpdatePaymentInformationDAOImpl service;
	


	@Test
	public void testUpdatePaymentInfo() {
	
		RmRemit remit = new RmRemit();
		
		remit.setId(new Long(1172));
		remit.setReceiptId(new Long(1172));
		remit.setControlGroupId(new Long(1016));
		remit.setRemitterId(new Long(1147));
		remit.setRegisterNumber(new Long(1000171));
		remit.setRemitStatusCode(new Long(4));
		remit.setCreatedBy("NIETOR");
		remit.setPaymentMethodCode(new Long(3));
		remit.setCreditCardLast4Digits(1234);
		
		service.updatePaymentInfo(remit);
		
		PaymentResponceBO paymentResponceBO = new PaymentResponceBO();
		
		paymentResponceBO.setLocalRefid(new Long(547025));	
		
		service.updatePaymentInfo(paymentResponceBO);
		
		Assert.assertEquals(remit.getTraceNumber(), "1172");
		
	}
		
		
}
*/