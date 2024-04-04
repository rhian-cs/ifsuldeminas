
package controller;

import DAO.PacienteDAO;

public class TelaVerHistoricoAController {
    
    public static PacienteDAO getPacientePorId(String id) {
        return PacienteDAO.getPacientePorId(id);
    }
    
    
}
