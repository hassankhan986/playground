package com.sc.cdb.data.dao;

import com.sc.cdb.data.model.auth.Company;
import org.bson.types.ObjectId;

public interface CompanyDao extends BaseDao<Company> {
    boolean activateCompany(String companyId, boolean active);
}
