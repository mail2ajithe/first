/*package us.tx.state.rrc.service;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;

import us.tx.state.rrc.dao.IRetrieveRemitRowDAO;
import us.tx.state.rrc.dao.IUpdatePaymentInformationDAO;
import us.tx.state.rrc.entity.RmRemit;

public class RetrieveRemitRowTest extends AbstractConfigBaseIT {

	@Resource
	private IUpdatePaymentInformationDAO service;

	@Test
	public void RemitInformationRetriveTest () {

		Integer remitId = 1172;



		RmRemit rmRemit = service.queryRemitInfo(remitId.longValue());

		System.out.println("....................thest.............."+rmRemit.getRemitterId());

		Assert.assertEquals(rmRemit.getRemitterId(), new Long("1147"));

	}

}
 */