package fci.cu.std.paas.api.services.blobstorage;

import java.util.HashMap;

/**********************************************************************************
 * this interface aims to provide a set of standard methods to satisfy the 
 * functionalities of the Blob storage service over a set of the heterogeneous 
 * PaaS platforms
 * 
 * @date 13/9/2016
 * @author Eman Hossny, FCI-CU
 ********************************************************************************/

public interface StdBlobStorage {
	
		/**
		 * 
		 * @param storageAccount: this is the account that is used to work with blobs
		 * @param containerName: this is the container which stores blobs
		 * @param blobName: this is the blob name that need to be deleted or downloaded
		 * @return
		 */
		public boolean deleteBlob(java.lang.Object storageAccount,java.lang.String containerName,java.lang.String blobName);
		public boolean downloadBlob(java.lang.Object storageAccount,java.lang.String containerName,java.lang.String blobName,java.io.OutputStream outputStream,long startPosition);
		public java.util.Iterator<com.std.paas.api.staticcode.HelperFunctionalities.GenericBlob> listBlobs(java.lang.Object storageAccount,java.lang.String containerName);
		public java.lang.Object authenticate(java.lang.String manifestString);
		public java.lang.Object createBlob(java.lang.String contentType,java.lang.Object storageAccount,java.lang.String containerName,java.lang.String blobName,com.std.paas.api.staticcode.HelperFunctionalities.AccessRights accessRights);
		public boolean uploadBlob(java.lang.Object blob,java.io.InputStream inputStream);
		

}
