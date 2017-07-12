# KI Tenant Domain Model

KI domain model plugins should ONLY contain domain classes.

KI Projects are constructed of modular/reusable domain models which can be used to share data between services if needed. Sometimes services will use API level interactions, 
but some data structures are best considered shared and enable interaction at the storage module.

This grails plugin defines the following domain classes

     com.k_int.dm.tenant.Tenant      - Holds information about tenant identifiers

And provides the following spring services

     none.

There are no parent dependencies for this module - Tenant could be considered the root of much of the shared data model.


# Configuration Management

## Versioning

Follow semantic versioning.

## Procedure

Updates to this domain model need to be published to the nexus repository at nexus.k-int.com. Generally, projects should only use
released versions of this domain model, and any build.gradle/pom.xml should add this maven repository as a source.

To build the plugin

    grails package-plugin

To upload the release to nexus, make sure your ~/.gradle/gradle.properties file contains mvnuser and mvnpassword and then use

    gradle publish

Depending upon your personal preference.
