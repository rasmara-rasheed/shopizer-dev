package com.salesmanager.core.modules.cms.content;

import com.salesmanager.core.business.content.model.image.InputContentImage;
import com.salesmanager.core.business.generic.exception.ServiceException;
import com.salesmanager.core.business.merchant.model.MerchantStore;

public interface ImagePut {
	
	
	public void addImage(MerchantStore store, InputContentImage image) throws ServiceException;

}
