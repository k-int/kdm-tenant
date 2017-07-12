package com.k_int.dm.tenant

class Tenant {

  String tenantId
  String name

  static constraints = {
    tenantId nullable:false, blank: false, unique: true
    name blank: false, nullable:true
  }

  static mapping = {
    table 'ki_tenant'
    id column:'kit_id'
    tenantId column:'kit_tenant_id'
    name column:'kit_name'
  }
}
