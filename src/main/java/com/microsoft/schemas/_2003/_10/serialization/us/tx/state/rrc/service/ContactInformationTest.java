/*package us.tx.state.rrc.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import us.tx.state.rrc.dao.ContactInformationDAO;
import us.tx.state.rrc.entity.ContactInformation;
import us.tx.state.rrc.service.AbstractConfigBaseIT;

*//**
 * Test Class to select and insert scenarios for RM_OWNR.RM_REMITTER table
 * 
 * @author Ajay Dudipala
 *
 *//*
public class ContactInformationTest extends AbstractConfigBaseIT  {
	
	@Resource
	private ContactInformationService service;
	ContactInformationDAO ContactInformationDAO = new ContactInformationDAO();
	
	@Test
	public void testFind() throws Exception {
		ContactInformation contactInformation = new ContactInformation();
		
		Long id = new Long(2079);
		contactInformation = service.findbyId(id);
		
		Assert.assertNotNull(contactInformation);
		Assert.assertEquals(contactInformation.getId(), id);
		Assert.assertEquals(contactInformation.getFirstName(), "ROBERT");
	}
	
	@Test
	public void testFindId() throws Exception {
		List<ContactInformation> list = new ArrayList<ContactInformation>();
		list = ContactInformationDAO.getRemitterId();
		Long remitterId = null;
		
		for(ContactInformation newList : list){
			if(newList.getFirstName().equalsIgnoreCase("Ajay") && newList.getLastName().equalsIgnoreCase("Dudipala")) {
				remitterId = newList.getId();
			} else {
				service.save(newList);
				remitterId = newList.getId();
			}
		}
		Assert.assertNotNull(list);
		Assert.assertNotNull(remitterId);
		System.out.println("Remitter Id: " + remitterId);
	}

	
	@Test
	@Rollback(false)
	public void testSave() throws Exception {
		ContactInformation contactInformation = new ContactInformation();
		contactInformation.setRemitterTypeCode(Long.valueOf(1));
		contactInformation.setCreatedBy("AjayD");
		contactInformation.setCreatedDate(Timestamp.valueOf("2015-01-09 12:12:12"));
		contactInformation.setIsOrganizationFlag("Y");
		contactInformation.setFirstName("Ajay");
		contactInformation.setLastName("Reddy");
		
		contactInformation = service.save(contactInformation);

		Assert.assertNotNull(contactInformation);
		Assert.assertEquals(contactInformation.getFirstName(), "Ajay");
		Assert.assertEquals(contactInformation.getLastName(), "Reddy");
	}

	
}
*/