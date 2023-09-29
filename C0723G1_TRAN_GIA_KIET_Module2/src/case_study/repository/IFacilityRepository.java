package case_study.repository;


import case_study.model.furama.Facility;

public interface IFacilityRepository extends IFurameRepo<Facility> {
    void maintenanceList();

}
