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

The Blob storage generic APIs provides a set of generic methods which can be used to develop
generic blob storage applications. These generic methods are:
1- authenticate
2- createBlob
3- uploadBlob
4- downloadBlob
5- listBlobs
6- deleteBlob

The NoSQL datastore generic APIs provides a set of generic methods which can be used to develop generic 
datastore applications. These generic methods are:
1- authenticateDS
2- createEntity
3- retrieveEntity
4- deleteEntity

The generic applications can be deployed remotely on PaaS clouds with no change in the source code. 
The user needs only to configure the class path of the generic application to use a specific
adapter.
