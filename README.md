=================================================================================================================
The Std-PaaS API version 1.6
=================================================================================================================
Authors: Eman Hossny, Sherif Khattab, Fatma Omara, Hisham Hassan 

****************
A. Description
****************
The Std-PaaS APIs can include a set of generic implementation APIs for each service. 
These generic APIs work as a middleware layer to hide heterogeneity of different PaaS 
platforms and help cloud developers to implement generic applications.
Currently, the Std-PaaS APIs include two sets of generic APIs for blob storage and NoSql datastore
<br />
The Blob storage generic APIs provides a set of generic methods which can be used to develop
generic blob storage applications. These generic methods are:<br />
1- authenticate  <br />
2- createBlob    <br />
3- uploadBlob <br />
4- downloadBlob<br />
5- listBlobs<br />
6- deleteBlob<br />
<br />
The NoSQL datastore generic APIs provides a set of generic methods which can be used to develop generic 
datastore applications. These generic methods are:<br />
1- authenticateDS<br />
2- createEntity<br />
3- retrieveEntity<br />
4- deleteEntity<br />

The generic applications can be deployed remotely on PaaS clouds with no change in the source code. 
The user needs only to configure the class path of the generic application to use a specific
adapter.
