package case_study.repository;

import case_study.model.Facility;
import case_study.service.IFacilityService;

import java.util.Map;

public interface IFacilityRepository extends IRepository<Facility> {
    Map<Facility,Integer> getAll();
    void add(Facility facility);
    void displayMaintenance();
}
