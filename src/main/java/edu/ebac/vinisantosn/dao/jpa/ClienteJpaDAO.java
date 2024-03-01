package edu.ebac.vinisantosn.dao.jpa;

import edu.ebac.vinisantosn.domain.jpa.ClienteJPA;
import edu.ebac.vinisantosn.generic.jpa.GenericJpaDAO;

public class ClienteJpaDAO extends GenericJpaDAO<ClienteJPA, Long> implements IClienteJpaDAO {

    public ClienteJpaDAO() {
        super(ClienteJPA.class);
    }

}
