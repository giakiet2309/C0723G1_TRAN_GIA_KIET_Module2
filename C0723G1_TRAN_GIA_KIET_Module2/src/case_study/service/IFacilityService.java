package case_study.service;

import case_study.model.furama.Facility;

public interface IFacilityService extends IFuramaService<Facility> {
    void maintenanceList();
}
