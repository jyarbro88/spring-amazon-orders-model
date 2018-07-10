package com.spring.amazondatamodel.datalayer.repositories;

import com.spring.amazondatamodel.datalayer.daos.AccountDAO;
import com.spring.amazondatamodel.datalayer.daos.AddressDAO;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class AccountRepository extends AbstractRepository {

    public List<AccountDAO> list() {
        return list(AccountDAO.class);
    }

    public List<AddressDAO> findAllBy(AddressDAO addressDAO) {
        TypedQuery<AddressDAO> query = getEntityManager().createQuery();
    }

    private <T> String buildSqlQuery(final Class<T> tClass, final AddressDAO addressDAO) {

        String sql = "SELECT t FROM " + tClass.getName() + " t WHERE";


    }
}
