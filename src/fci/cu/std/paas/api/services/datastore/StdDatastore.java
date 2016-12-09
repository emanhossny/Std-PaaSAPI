package fci.cu.std.paas.api.services.datastore;

import java.util.HashMap;

/**********************************************************************************
 * this interface aims to provide a set of standard methods to satisfy the 
 * functionalities of the datastore service (NoSQL DB) over a set of the heterogeneous 
 * PaaS platforms
 * 
 * @date 13/9/2016
 * @author Eman Hossny, FCI-CU
 ********************************************************************************/

public interface StdDatastore {
	
	/**
	 * 
	 * @param tableName: String to represent the tableName or the kind of an entity
	 * @param rowKey: String represent a unique key for this entity
	 * @param properties: a hash map for a set of properties, such that each element in this 
	 * map represents a propertyName and a propertyValue
	 */
	Object createEntity(Object datastoreAccount,String tableName, String partitionKey, String rowKey, HashMap<String, String> properties);
	Object retrieveEntity(Object datastoreAccount,String tableName, String partitionKey, String rowKey);
	Object authenticateDS(String manifestString);

}
